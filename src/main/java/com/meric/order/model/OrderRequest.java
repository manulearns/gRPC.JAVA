// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OrderSvc.proto

package com.meric.order.model;

/**
 * Protobuf type {@code com.meric.order.model.OrderRequest}
 */
public  final class OrderRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.meric.order.model.OrderRequest)
    OrderRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderRequest.newBuilder() to construct.
  private OrderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderRequest() {
    orderNo_ = "";
    orderDate_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            orderNo_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            orderDate_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.meric.order.model.OrderSvc.internal_static_com_meric_order_model_OrderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.meric.order.model.OrderSvc.internal_static_com_meric_order_model_OrderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.meric.order.model.OrderRequest.class, com.meric.order.model.OrderRequest.Builder.class);
  }

  public static final int ORDERNO_FIELD_NUMBER = 1;
  private volatile java.lang.Object orderNo_;
  /**
   * <code>string orderNo = 1;</code>
   */
  public java.lang.String getOrderNo() {
    java.lang.Object ref = orderNo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderNo_ = s;
      return s;
    }
  }
  /**
   * <code>string orderNo = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOrderNoBytes() {
    java.lang.Object ref = orderNo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderNo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDERDATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object orderDate_;
  /**
   * <code>string orderDate = 2;</code>
   */
  public java.lang.String getOrderDate() {
    java.lang.Object ref = orderDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      orderDate_ = s;
      return s;
    }
  }
  /**
   * <code>string orderDate = 2;</code>
   */
  public com.google.protobuf.ByteString
      getOrderDateBytes() {
    java.lang.Object ref = orderDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      orderDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getOrderNoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, orderNo_);
    }
    if (!getOrderDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, orderDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrderNoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, orderNo_);
    }
    if (!getOrderDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, orderDate_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.meric.order.model.OrderRequest)) {
      return super.equals(obj);
    }
    com.meric.order.model.OrderRequest other = (com.meric.order.model.OrderRequest) obj;

    boolean result = true;
    result = result && getOrderNo()
        .equals(other.getOrderNo());
    result = result && getOrderDate()
        .equals(other.getOrderDate());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ORDERNO_FIELD_NUMBER;
    hash = (53 * hash) + getOrderNo().hashCode();
    hash = (37 * hash) + ORDERDATE_FIELD_NUMBER;
    hash = (53 * hash) + getOrderDate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.meric.order.model.OrderRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.meric.order.model.OrderRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.meric.order.model.OrderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.meric.order.model.OrderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.meric.order.model.OrderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.meric.order.model.OrderRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.meric.order.model.OrderRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.meric.order.model.OrderRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.meric.order.model.OrderRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.meric.order.model.OrderRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.meric.order.model.OrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.meric.order.model.OrderRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.meric.order.model.OrderRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code com.meric.order.model.OrderRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.meric.order.model.OrderRequest)
      com.meric.order.model.OrderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.meric.order.model.OrderSvc.internal_static_com_meric_order_model_OrderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.meric.order.model.OrderSvc.internal_static_com_meric_order_model_OrderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.meric.order.model.OrderRequest.class, com.meric.order.model.OrderRequest.Builder.class);
    }

    // Construct using com.meric.order.model.OrderRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      orderNo_ = "";

      orderDate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.meric.order.model.OrderSvc.internal_static_com_meric_order_model_OrderRequest_descriptor;
    }

    @java.lang.Override
    public com.meric.order.model.OrderRequest getDefaultInstanceForType() {
      return com.meric.order.model.OrderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.meric.order.model.OrderRequest build() {
      com.meric.order.model.OrderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.meric.order.model.OrderRequest buildPartial() {
      com.meric.order.model.OrderRequest result = new com.meric.order.model.OrderRequest(this);
      result.orderNo_ = orderNo_;
      result.orderDate_ = orderDate_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.meric.order.model.OrderRequest) {
        return mergeFrom((com.meric.order.model.OrderRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.meric.order.model.OrderRequest other) {
      if (other == com.meric.order.model.OrderRequest.getDefaultInstance()) return this;
      if (!other.getOrderNo().isEmpty()) {
        orderNo_ = other.orderNo_;
        onChanged();
      }
      if (!other.getOrderDate().isEmpty()) {
        orderDate_ = other.orderDate_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.meric.order.model.OrderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.meric.order.model.OrderRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object orderNo_ = "";
    /**
     * <code>string orderNo = 1;</code>
     */
    public java.lang.String getOrderNo() {
      java.lang.Object ref = orderNo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderNo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderNo = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOrderNoBytes() {
      java.lang.Object ref = orderNo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderNo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderNo = 1;</code>
     */
    public Builder setOrderNo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderNo = 1;</code>
     */
    public Builder clearOrderNo() {
      
      orderNo_ = getDefaultInstance().getOrderNo();
      onChanged();
      return this;
    }
    /**
     * <code>string orderNo = 1;</code>
     */
    public Builder setOrderNoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderNo_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object orderDate_ = "";
    /**
     * <code>string orderDate = 2;</code>
     */
    public java.lang.String getOrderDate() {
      java.lang.Object ref = orderDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        orderDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string orderDate = 2;</code>
     */
    public com.google.protobuf.ByteString
        getOrderDateBytes() {
      java.lang.Object ref = orderDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        orderDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string orderDate = 2;</code>
     */
    public Builder setOrderDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      orderDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string orderDate = 2;</code>
     */
    public Builder clearOrderDate() {
      
      orderDate_ = getDefaultInstance().getOrderDate();
      onChanged();
      return this;
    }
    /**
     * <code>string orderDate = 2;</code>
     */
    public Builder setOrderDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      orderDate_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.meric.order.model.OrderRequest)
  }

  // @@protoc_insertion_point(class_scope:com.meric.order.model.OrderRequest)
  private static final com.meric.order.model.OrderRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.meric.order.model.OrderRequest();
  }

  public static com.meric.order.model.OrderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderRequest>
      PARSER = new com.google.protobuf.AbstractParser<OrderRequest>() {
    @java.lang.Override
    public OrderRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.meric.order.model.OrderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
