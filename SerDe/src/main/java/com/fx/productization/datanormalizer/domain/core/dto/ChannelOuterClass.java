// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Channel.proto

package com.fx.productization.datanormalizer.domain.core.dto;

public final class ChannelOuterClass {
  private ChannelOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannelOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.fx.productization.datanormalizer.domain.core.dto.Channel)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
     */
    boolean hasBaseDomain();
    /**
     * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
     */
    com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain getBaseDomain();
    /**
     * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
     */
    com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomainOrBuilder getBaseDomainOrBuilder();

    /**
     * <code>optional int64 id = 2;</code>
     */
    long getId();

    /**
     * <code>optional int64 companyId = 3;</code>
     */
    long getCompanyId();

    /**
     * <code>optional int64 platformId = 4;</code>
     */
    long getPlatformId();

    /**
     * <code>optional string name = 5;</code>
     */
    java.lang.String getName();
    /**
     * <code>optional string name = 5;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <code>optional string address = 6;</code>
     */
    java.lang.String getAddress();
    /**
     * <code>optional string address = 6;</code>
     */
    com.google.protobuf.ByteString
        getAddressBytes();
  }
  /**
   * Protobuf type {@code com.fx.productization.datanormalizer.domain.core.dto.Channel}
   */
  public  static final class Channel extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.fx.productization.datanormalizer.domain.core.dto.Channel)
      ChannelOrBuilder {
    // Use Channel.newBuilder() to construct.
    private Channel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Channel() {
      id_ = 0L;
      companyId_ = 0L;
      platformId_ = 0L;
      name_ = "";
      address_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private Channel(
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
              com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.Builder subBuilder = null;
              if (baseDomain_ != null) {
                subBuilder = baseDomain_.toBuilder();
              }
              baseDomain_ = input.readMessage(com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(baseDomain_);
                baseDomain_ = subBuilder.buildPartial();
              }

              break;
            }
            case 16: {

              id_ = input.readInt64();
              break;
            }
            case 24: {

              companyId_ = input.readInt64();
              break;
            }
            case 32: {

              platformId_ = input.readInt64();
              break;
            }
            case 42: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              address_ = s;
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
      return com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.internal_static_com_fx_productization_datanormalizer_domain_core_dto_Channel_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.internal_static_com_fx_productization_datanormalizer_domain_core_dto_Channel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel.class, com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel.Builder.class);
    }

    public static final int BASEDOMAIN_FIELD_NUMBER = 1;
    private com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain baseDomain_;
    /**
     * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
     */
    public boolean hasBaseDomain() {
      return baseDomain_ != null;
    }
    /**
     * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
     */
    public com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain getBaseDomain() {
      return baseDomain_ == null ? com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.getDefaultInstance() : baseDomain_;
    }
    /**
     * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
     */
    public com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomainOrBuilder getBaseDomainOrBuilder() {
      return getBaseDomain();
    }

    public static final int ID_FIELD_NUMBER = 2;
    private long id_;
    /**
     * <code>optional int64 id = 2;</code>
     */
    public long getId() {
      return id_;
    }

    public static final int COMPANYID_FIELD_NUMBER = 3;
    private long companyId_;
    /**
     * <code>optional int64 companyId = 3;</code>
     */
    public long getCompanyId() {
      return companyId_;
    }

    public static final int PLATFORMID_FIELD_NUMBER = 4;
    private long platformId_;
    /**
     * <code>optional int64 platformId = 4;</code>
     */
    public long getPlatformId() {
      return platformId_;
    }

    public static final int NAME_FIELD_NUMBER = 5;
    private volatile java.lang.Object name_;
    /**
     * <code>optional string name = 5;</code>
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
     * <code>optional string name = 5;</code>
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

    public static final int ADDRESS_FIELD_NUMBER = 6;
    private volatile java.lang.Object address_;
    /**
     * <code>optional string address = 6;</code>
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      }
    }
    /**
     * <code>optional string address = 6;</code>
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
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
      if (baseDomain_ != null) {
        output.writeMessage(1, getBaseDomain());
      }
      if (id_ != 0L) {
        output.writeInt64(2, id_);
      }
      if (companyId_ != 0L) {
        output.writeInt64(3, companyId_);
      }
      if (platformId_ != 0L) {
        output.writeInt64(4, platformId_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 5, name_);
      }
      if (!getAddressBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, address_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (baseDomain_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getBaseDomain());
      }
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, id_);
      }
      if (companyId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, companyId_);
      }
      if (platformId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, platformId_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, name_);
      }
      if (!getAddressBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, address_);
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
      if (!(obj instanceof com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel)) {
        return super.equals(obj);
      }
      com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel other = (com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel) obj;

      boolean result = true;
      result = result && (hasBaseDomain() == other.hasBaseDomain());
      if (hasBaseDomain()) {
        result = result && getBaseDomain()
            .equals(other.getBaseDomain());
      }
      result = result && (getId()
          == other.getId());
      result = result && (getCompanyId()
          == other.getCompanyId());
      result = result && (getPlatformId()
          == other.getPlatformId());
      result = result && getName()
          .equals(other.getName());
      result = result && getAddress()
          .equals(other.getAddress());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasBaseDomain()) {
        hash = (37 * hash) + BASEDOMAIN_FIELD_NUMBER;
        hash = (53 * hash) + getBaseDomain().hashCode();
      }
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + COMPANYID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCompanyId());
      hash = (37 * hash) + PLATFORMID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPlatformId());
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parseFrom(
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
    public static Builder newBuilder(com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel prototype) {
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
     * Protobuf type {@code com.fx.productization.datanormalizer.domain.core.dto.Channel}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.fx.productization.datanormalizer.domain.core.dto.Channel)
        com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.ChannelOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.internal_static_com_fx_productization_datanormalizer_domain_core_dto_Channel_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.internal_static_com_fx_productization_datanormalizer_domain_core_dto_Channel_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel.class, com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel.Builder.class);
      }

      // Construct using com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel.newBuilder()
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
        if (baseDomainBuilder_ == null) {
          baseDomain_ = null;
        } else {
          baseDomain_ = null;
          baseDomainBuilder_ = null;
        }
        id_ = 0L;

        companyId_ = 0L;

        platformId_ = 0L;

        name_ = "";

        address_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.internal_static_com_fx_productization_datanormalizer_domain_core_dto_Channel_descriptor;
      }

      public com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel getDefaultInstanceForType() {
        return com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel.getDefaultInstance();
      }

      public com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel build() {
        com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel buildPartial() {
        com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel result = new com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel(this);
        if (baseDomainBuilder_ == null) {
          result.baseDomain_ = baseDomain_;
        } else {
          result.baseDomain_ = baseDomainBuilder_.build();
        }
        result.id_ = id_;
        result.companyId_ = companyId_;
        result.platformId_ = platformId_;
        result.name_ = name_;
        result.address_ = address_;
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
        if (other instanceof com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel) {
          return mergeFrom((com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel other) {
        if (other == com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel.getDefaultInstance()) return this;
        if (other.hasBaseDomain()) {
          mergeBaseDomain(other.getBaseDomain());
        }
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (other.getCompanyId() != 0L) {
          setCompanyId(other.getCompanyId());
        }
        if (other.getPlatformId() != 0L) {
          setPlatformId(other.getPlatformId());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
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
        com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain baseDomain_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain, com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.Builder, com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomainOrBuilder> baseDomainBuilder_;
      /**
       * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
       */
      public boolean hasBaseDomain() {
        return baseDomainBuilder_ != null || baseDomain_ != null;
      }
      /**
       * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
       */
      public com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain getBaseDomain() {
        if (baseDomainBuilder_ == null) {
          return baseDomain_ == null ? com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.getDefaultInstance() : baseDomain_;
        } else {
          return baseDomainBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
       */
      public Builder setBaseDomain(com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain value) {
        if (baseDomainBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          baseDomain_ = value;
          onChanged();
        } else {
          baseDomainBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
       */
      public Builder setBaseDomain(
          com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.Builder builderForValue) {
        if (baseDomainBuilder_ == null) {
          baseDomain_ = builderForValue.build();
          onChanged();
        } else {
          baseDomainBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
       */
      public Builder mergeBaseDomain(com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain value) {
        if (baseDomainBuilder_ == null) {
          if (baseDomain_ != null) {
            baseDomain_ =
              com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.newBuilder(baseDomain_).mergeFrom(value).buildPartial();
          } else {
            baseDomain_ = value;
          }
          onChanged();
        } else {
          baseDomainBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
       */
      public Builder clearBaseDomain() {
        if (baseDomainBuilder_ == null) {
          baseDomain_ = null;
          onChanged();
        } else {
          baseDomain_ = null;
          baseDomainBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
       */
      public com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.Builder getBaseDomainBuilder() {
        
        onChanged();
        return getBaseDomainFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
       */
      public com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomainOrBuilder getBaseDomainOrBuilder() {
        if (baseDomainBuilder_ != null) {
          return baseDomainBuilder_.getMessageOrBuilder();
        } else {
          return baseDomain_ == null ?
              com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.getDefaultInstance() : baseDomain_;
        }
      }
      /**
       * <code>optional .com.fx.productization.datanormalizer.domain.core.dto.BaseDomain baseDomain = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain, com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.Builder, com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomainOrBuilder> 
          getBaseDomainFieldBuilder() {
        if (baseDomainBuilder_ == null) {
          baseDomainBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain, com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomain.Builder, com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.BaseDomainOrBuilder>(
                  getBaseDomain(),
                  getParentForChildren(),
                  isClean());
          baseDomain_ = null;
        }
        return baseDomainBuilder_;
      }

      private long id_ ;
      /**
       * <code>optional int64 id = 2;</code>
       */
      public long getId() {
        return id_;
      }
      /**
       * <code>optional int64 id = 2;</code>
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 id = 2;</code>
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private long companyId_ ;
      /**
       * <code>optional int64 companyId = 3;</code>
       */
      public long getCompanyId() {
        return companyId_;
      }
      /**
       * <code>optional int64 companyId = 3;</code>
       */
      public Builder setCompanyId(long value) {
        
        companyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 companyId = 3;</code>
       */
      public Builder clearCompanyId() {
        
        companyId_ = 0L;
        onChanged();
        return this;
      }

      private long platformId_ ;
      /**
       * <code>optional int64 platformId = 4;</code>
       */
      public long getPlatformId() {
        return platformId_;
      }
      /**
       * <code>optional int64 platformId = 4;</code>
       */
      public Builder setPlatformId(long value) {
        
        platformId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 platformId = 4;</code>
       */
      public Builder clearPlatformId() {
        
        platformId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>optional string name = 5;</code>
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
       * <code>optional string name = 5;</code>
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
       * <code>optional string name = 5;</code>
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
       * <code>optional string name = 5;</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>optional string name = 5;</code>
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

      private java.lang.Object address_ = "";
      /**
       * <code>optional string address = 6;</code>
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string address = 6;</code>
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string address = 6;</code>
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string address = 6;</code>
       */
      public Builder clearAddress() {
        
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }
      /**
       * <code>optional string address = 6;</code>
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        address_ = value;
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


      // @@protoc_insertion_point(builder_scope:com.fx.productization.datanormalizer.domain.core.dto.Channel)
    }

    // @@protoc_insertion_point(class_scope:com.fx.productization.datanormalizer.domain.core.dto.Channel)
    private static final com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel();
    }

    public static com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Channel>
        PARSER = new com.google.protobuf.AbstractParser<Channel>() {
      public Channel parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new Channel(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Channel> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Channel> getParserForType() {
      return PARSER;
    }

    public com.fx.productization.datanormalizer.domain.core.dto.ChannelOuterClass.Channel getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_fx_productization_datanormalizer_domain_core_dto_Channel_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_fx_productization_datanormalizer_domain_core_dto_Channel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rChannel.proto\0224com.fx.productization.d" +
      "atanormalizer.domain.core.dto\032\020BaseDomai" +
      "n.proto\"\261\001\n\007Channel\022T\n\nbaseDomain\030\001 \001(\0132" +
      "@.com.fx.productization.datanormalizer.d" +
      "omain.core.dto.BaseDomain\022\n\n\002id\030\002 \001(\003\022\021\n" +
      "\tcompanyId\030\003 \001(\003\022\022\n\nplatformId\030\004 \001(\003\022\014\n\004" +
      "name\030\005 \001(\t\022\017\n\007address\030\006 \001(\tb\006proto3"
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
          com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.getDescriptor(),
        }, assigner);
    internal_static_com_fx_productization_datanormalizer_domain_core_dto_Channel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_fx_productization_datanormalizer_domain_core_dto_Channel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_fx_productization_datanormalizer_domain_core_dto_Channel_descriptor,
        new java.lang.String[] { "BaseDomain", "Id", "CompanyId", "PlatformId", "Name", "Address", });
    com.fx.productization.datanormalizer.domain.core.dto.BaseDomainOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
