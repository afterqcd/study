package com.afterqcd.study.flink

import org.apache.flink.api.common.typeinfo.TypeInformation
import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment
import org.apache.flink.streaming.api.windowing.time.Time

/**
  * Created by afterqcd on 2017/3/28.
  */
object ScalaWordCountDemo {
  def main(args: Array[String]): Unit = {
    implicit val stringTypeInfo = TypeInformation.of(classOf[String])
    implicit val wordCountTypeInfo = TypeInformation.of(classOf[WordCount])

    val port = 9000
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val lines = env.socketTextStream("localhost", port, '\n')
    val wordCounts = lines.flatMap(_.split("\\s"))
      .map(WordCount(_, 1))
      .keyBy(_.word)
      .timeWindow(Time.seconds(5))
      .reduce(_ + _)

    wordCounts.print().setParallelism(1)

    env.execute("Socket Window WordCount")
  }

  case class WordCount(word: String, count: Int) {
    def +(another: WordCount): WordCount = {
      WordCount(word, count + another.count)
    }
  }
}


