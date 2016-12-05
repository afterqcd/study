package com.afterqcd.study.kafka.streams;

import com.afterqcd.study.kafka.JavaKafkaIntegrationTest;
import com.afterqcd.study.kafka.clients.consumer.JavaConsumersBuilder;
import com.afterqcd.study.kafka.clients.producer.IProducer;
import com.afterqcd.study.kafka.clients.producer.JavaProducerBuilder;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KStreamBuilder;
import org.junit.Test;
import rx.Observable;
import rx.subjects.PublishSubject;

import java.util.Arrays;
import java.util.Properties;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Created by afterqcd on 2016/12/3.
 */
public class WordCountTest extends JavaKafkaIntegrationTest {
    private static final String TextLinesTopic = "text-lines-topic";
    private static final String WordCountsTopic = "word-counts-topic";

    @Test
    public void testStreamingWordCount() throws Exception {
        kafkaUnit.createTopic(TextLinesTopic, 1, 1, new Properties());
        kafkaUnit.createTopic(WordCountsTopic, 1, 1, new Properties());

        final KafkaStreams wordCountsStreams = wordCountsStreams(TextLinesTopic, WordCountsTopic);
        wordCountsStreams.cleanUp(); // do not use in real app
        wordCountsStreams.start();

        final IProducer<String, String> linesProducer = textLinesProducer(TextLinesTopic);
        final Observable<ConsumerRecord<String, Long>> wordCounts = wordCounts(WordCountsTopic);

        linesProducer.sendDefault("kafka topics");
        linesProducer.sendDefault("kafka unit test");
        linesProducer.sendDefault("test kafka");
        linesProducer.flush();

        assertThat(
                wordCounts.map(r -> r.key() + " -> " + r.value()).take(4).toList().toBlocking().first(),
                hasItems("kafka -> 3", "topics -> 1", "unit -> 1", "test -> 2")
        );

        wordCountsStreams.close();
    }

    private KafkaStreams wordCountsStreams(String sourceTopic, String dstTopic) {
        final Serde<String> stringSerde = Serdes.String();
        final Serde<Long> longSerde = Serdes.Long();

        final KStreamBuilder builder = new KStreamBuilder();

        final KStream<String, String> textLines = builder.stream(stringSerde, stringSerde, sourceTopic);

        final KStream<String, Long> wordCounts = textLines
                .flatMapValues(line -> Arrays.asList(line.toLowerCase().split(" ")))
                .groupBy((key, word) -> word)
                .aggregate(() -> 0L, (w1, w2, count) -> count + 1, longSerde, "counts")
                .toStream();

        wordCounts.to(stringSerde, longSerde, dstTopic);

        return new KafkaStreams(builder, streamsProps());
    }

    private Properties streamsProps() {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "wordcount-lambda-example");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaUnit.bootstrapServers());
        props.put(StreamsConfig.ZOOKEEPER_CONNECT_CONFIG, kafkaUnit.zkUnit().zkConnect());
        props.put(StreamsConfig.KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.put(StreamsConfig.VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        props.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 2 * 1000);

        return props;
    }

    private IProducer<String, String> textLinesProducer(String sourceTopic) {
        return JavaProducerBuilder.newBuilder(String.class, String.class)
                .bootstrapServers(kafkaUnit.bootstrapServers())
                .clientId("text-lines-producer")
                .messageDeliverySemantics("at-least-once")
                .defaultTopic(sourceTopic)
                .build();
    }

    private Observable<ConsumerRecord<String, Long>> wordCounts(String topic) {
        final PublishSubject<ConsumerRecord<String, Long>> wordCounts = PublishSubject.create();

        JavaConsumersBuilder.newBuilder(String.class, Long.class)
                .bootstrapServers(kafkaUnit.bootstrapServers())
                .clientId("word-counts-consumer")
                .messageDeliverySemantics("at-least-once")
                .subscribe(new String[] {topic})
                .groupId("test")
                .concurrency(1)
                .javaRecordListener(wordCounts::onNext)
                .build().start();

        return wordCounts;
    }
}