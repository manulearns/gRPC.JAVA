package com.meric.order.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: OrderSvc.proto")
public final class CreateOrderServiceGrpc {

  private CreateOrderServiceGrpc() {}

  public static final String SERVICE_NAME = "com.meric.order.model.CreateOrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.meric.order.model.OrderRequest,
      com.meric.order.model.OrderResponse> getOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "order",
      requestType = com.meric.order.model.OrderRequest.class,
      responseType = com.meric.order.model.OrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.meric.order.model.OrderRequest,
      com.meric.order.model.OrderResponse> getOrderMethod() {
    io.grpc.MethodDescriptor<com.meric.order.model.OrderRequest, com.meric.order.model.OrderResponse> getOrderMethod;
    if ((getOrderMethod = CreateOrderServiceGrpc.getOrderMethod) == null) {
      synchronized (CreateOrderServiceGrpc.class) {
        if ((getOrderMethod = CreateOrderServiceGrpc.getOrderMethod) == null) {
          CreateOrderServiceGrpc.getOrderMethod = getOrderMethod = 
              io.grpc.MethodDescriptor.<com.meric.order.model.OrderRequest, com.meric.order.model.OrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.meric.order.model.CreateOrderService", "order"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.meric.order.model.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.meric.order.model.OrderResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CreateOrderServiceMethodDescriptorSupplier("order"))
                  .build();
          }
        }
     }
     return getOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreateOrderServiceStub newStub(io.grpc.Channel channel) {
    return new CreateOrderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreateOrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreateOrderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreateOrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreateOrderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CreateOrderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void order(com.meric.order.model.OrderRequest request,
        io.grpc.stub.StreamObserver<com.meric.order.model.OrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.meric.order.model.OrderRequest,
                com.meric.order.model.OrderResponse>(
                  this, METHODID_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class CreateOrderServiceStub extends io.grpc.stub.AbstractStub<CreateOrderServiceStub> {
    private CreateOrderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateOrderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateOrderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateOrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void order(com.meric.order.model.OrderRequest request,
        io.grpc.stub.StreamObserver<com.meric.order.model.OrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreateOrderServiceBlockingStub extends io.grpc.stub.AbstractStub<CreateOrderServiceBlockingStub> {
    private CreateOrderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateOrderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateOrderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateOrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.meric.order.model.OrderResponse order(com.meric.order.model.OrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreateOrderServiceFutureStub extends io.grpc.stub.AbstractStub<CreateOrderServiceFutureStub> {
    private CreateOrderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateOrderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateOrderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateOrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.meric.order.model.OrderResponse> order(
        com.meric.order.model.OrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreateOrderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CreateOrderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ORDER:
          serviceImpl.order((com.meric.order.model.OrderRequest) request,
              (io.grpc.stub.StreamObserver<com.meric.order.model.OrderResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CreateOrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CreateOrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.meric.order.model.OrderSvc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CreateOrderService");
    }
  }

  private static final class CreateOrderServiceFileDescriptorSupplier
      extends CreateOrderServiceBaseDescriptorSupplier {
    CreateOrderServiceFileDescriptorSupplier() {}
  }

  private static final class CreateOrderServiceMethodDescriptorSupplier
      extends CreateOrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CreateOrderServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CreateOrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreateOrderServiceFileDescriptorSupplier())
              .addMethod(getOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
