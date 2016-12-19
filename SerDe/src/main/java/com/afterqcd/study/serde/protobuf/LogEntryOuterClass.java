// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: log_entry.proto

package com.afterqcd.study.serde.protobuf;

public final class LogEntryOuterClass {
  private LogEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LogEntryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.afterqcd.study.serde.protobuf.LogEntry)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string name = 1;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 1;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string resource = 2;</code>
     */
    java.lang.String getResource();
    /**
     * <code>optional string resource = 2;</code>
     */
    com.google.protobuf.ByteString
        getResourceBytes();

    /**
     * <code>optional string ip = 3;</code>
     */
    java.lang.String getIp();
    /**
     * <code>optional string ip = 3;</code>
     */
    com.google.protobuf.ByteString
        getIpBytes();
  }
  /**
   * Protobuf type {@code com.afterqcd.study.serde.protobuf.LogEntry}
   */
  public  static final class LogEntry extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.afterqcd.study.serde.protobuf.LogEntry)
      LogEntryOrBuilder {
    // Use LogEntry.newBuilder() to construct.
    private LogEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LogEntry() {
      name_ = "";
      resource_ = "";
      ip_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private LogEntry(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              resource_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              ip_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.afterqcd.study.serde.protobuf.LogEntryOuterClass.internal_static_com_afterqcd_study_serde_protobuf_LogEntry_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.afterqcd.study.serde.protobuf.LogEntryOuterClass.internal_static_com_afterqcd_study_serde_protobuf_LogEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry.class, com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <code>optional string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <code>optional string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESOURCE_FIELD_NUMBER = 2;
    private volatile java.lang.Object resource_;
    /**
     * <code>optional string resource = 2;</code>
     */
    public java.lang.String getResource() {
      java.lang.Object ref = resource_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resource_ = s;
        return s;
      }
    }
    /**
     * <code>optional string resource = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResourceBytes() {
      java.lang.Object ref = resource_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resource_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IP_FIELD_NUMBER = 3;
    private volatile java.lang.Object ip_;
    /**
     * <code>optional string ip = 3;</code>
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      }
    }
    /**
     * <code>optional string ip = 3;</code>
     */
    public com.google.protobuf.ByteString
        getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (!getResourceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resource_);
      }
      if (!getIpBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ip_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (!getResourceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resource_);
      }
      if (!getIpBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ip_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry)) {
        return super.equals(obj);
      }
      com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry other = (com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry) obj;

      boolean result = true;
      result = result && getName()
          .equals(other.getName());
      result = result && getResource()
          .equals(other.getResource());
      result = result && getIp()
          .equals(other.getIp());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
      hash = (37 * hash) + IP_FIELD_NUMBER;
      hash = (53 * hash) + getIp().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.afterqcd.study.serde.protobuf.LogEntry}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.afterqcd.study.serde.protobuf.LogEntry)
        com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.afterqcd.study.serde.protobuf.LogEntryOuterClass.internal_static_com_afterqcd_study_serde_protobuf_LogEntry_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.afterqcd.study.serde.protobuf.LogEntryOuterClass.internal_static_com_afterqcd_study_serde_protobuf_LogEntry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry.class, com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry.Builder.class);
      }

      // Construct using com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        name_ = "";

        resource_ = "";

        ip_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.afterqcd.study.serde.protobuf.LogEntryOuterClass.internal_static_com_afterqcd_study_serde_protobuf_LogEntry_descriptor;
      }

      public com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry getDefaultInstanceForType() {
        return com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry.getDefaultInstance();
      }

      public com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry build() {
        com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry buildPartial() {
        com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry result = new com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry(this);
        result.name_ = name_;
        result.resource_ = resource_;
        result.ip_ = ip_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry) {
          return mergeFrom((com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry other) {
        if (other == com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getResource().isEmpty()) {
          resource_ = other.resource_;
          onChanged();
        }
        if (!other.getIp().isEmpty()) {
          ip_ = other.ip_;
          onChanged();
        }
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 1;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 1;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object resource_ = "";
      /**
       * <code>optional string resource = 2;</code>
       */
      public java.lang.String getResource() {
        java.lang.Object ref = resource_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          resource_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string resource = 2;</code>
       */
      public com.google.protobuf.ByteString
          getResourceBytes() {
        java.lang.Object ref = resource_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          resource_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string resource = 2;</code>
       */
      public Builder setResource(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        resource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string resource = 2;</code>
       */
      public Builder clearResource() {
        
        resource_ = getDefaultInstance().getResource();
        onChanged();
        return this;
      }
      /**
       * <code>optional string resource = 2;</code>
       */
      public Builder setResourceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        resource_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object ip_ = "";
      /**
       * <code>optional string ip = 3;</code>
       */
      public java.lang.String getIp() {
        java.lang.Object ref = ip_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          ip_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string ip = 3;</code>
       */
      public com.google.protobuf.ByteString
          getIpBytes() {
        java.lang.Object ref = ip_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          ip_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string ip = 3;</code>
       */
      public Builder setIp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        ip_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string ip = 3;</code>
       */
      public Builder clearIp() {
        
        ip_ = getDefaultInstance().getIp();
        onChanged();
        return this;
      }
      /**
       * <code>optional string ip = 3;</code>
       */
      public Builder setIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        ip_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:com.afterqcd.study.serde.protobuf.LogEntry)
    }

    // @@protoc_insertion_point(class_scope:com.afterqcd.study.serde.protobuf.LogEntry)
    private static final com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry();
    }

    public static com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LogEntry>
        PARSER = new com.google.protobuf.AbstractParser<LogEntry>() {
      public LogEntry parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new LogEntry(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LogEntry> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LogEntry> getParserForType() {
      return PARSER;
    }

    public com.afterqcd.study.serde.protobuf.LogEntryOuterClass.LogEntry getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_afterqcd_study_serde_protobuf_LogEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_afterqcd_study_serde_protobuf_LogEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017log_entry.proto\022!com.afterqcd.study.se" +
      "rde.protobuf\"6\n\010LogEntry\022\014\n\004name\030\001 \001(\t\022\020" +
      "\n\010resource\030\002 \001(\t\022\n\n\002ip\030\003 \001(\tb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_afterqcd_study_serde_protobuf_LogEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_afterqcd_study_serde_protobuf_LogEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_afterqcd_study_serde_protobuf_LogEntry_descriptor,
        new java.lang.String[] { "Name", "Resource", "Ip", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
