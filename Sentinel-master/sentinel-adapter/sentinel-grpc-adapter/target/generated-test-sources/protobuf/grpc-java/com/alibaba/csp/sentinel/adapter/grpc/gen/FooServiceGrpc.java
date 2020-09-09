package com.alibaba.csp.sentinel.adapter.grpc.gen;

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
 * <pre>
 * Example service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: example.proto")
public final class FooServiceGrpc {

  private FooServiceGrpc() {}

  public static final String SERVICE_NAME = "com.alibaba.sentinel.examples.FooService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest,
      com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> getSayHelloMethod;

  public static io.grpc.MethodDescriptor<com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest,
      com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> getSayHelloMethod() {
    io.grpc.MethodDescriptor<com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest, com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> getSayHelloMethod;
    if ((getSayHelloMethod = FooServiceGrpc.getSayHelloMethod) == null) {
      synchronized (FooServiceGrpc.class) {
        if ((getSayHelloMethod = FooServiceGrpc.getSayHelloMethod) == null) {
          FooServiceGrpc.getSayHelloMethod = getSayHelloMethod = 
              io.grpc.MethodDescriptor.<com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest, com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.alibaba.sentinel.examples.FooService", "sayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FooServiceMethodDescriptorSupplier("sayHello"))
                  .build();
          }
        }
     }
     return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest,
      com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> getAnotherHelloMethod;

  public static io.grpc.MethodDescriptor<com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest,
      com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> getAnotherHelloMethod() {
    io.grpc.MethodDescriptor<com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest, com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> getAnotherHelloMethod;
    if ((getAnotherHelloMethod = FooServiceGrpc.getAnotherHelloMethod) == null) {
      synchronized (FooServiceGrpc.class) {
        if ((getAnotherHelloMethod = FooServiceGrpc.getAnotherHelloMethod) == null) {
          FooServiceGrpc.getAnotherHelloMethod = getAnotherHelloMethod = 
              io.grpc.MethodDescriptor.<com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest, com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.alibaba.sentinel.examples.FooService", "anotherHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FooServiceMethodDescriptorSupplier("anotherHello"))
                  .build();
          }
        }
     }
     return getAnotherHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FooServiceStub newStub(io.grpc.Channel channel) {
    return new FooServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FooServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FooServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FooServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FooServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Example service definition.
   * </pre>
   */
  public static abstract class FooServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest request,
        io.grpc.stub.StreamObserver<com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void anotherHello(com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest request,
        io.grpc.stub.StreamObserver<com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAnotherHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest,
                com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getAnotherHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest,
                com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse>(
                  this, METHODID_ANOTHER_HELLO)))
          .build();
    }
  }

  /**
   * <pre>
   * Example service definition.
   * </pre>
   */
  public static final class FooServiceStub extends io.grpc.stub.AbstractStub<FooServiceStub> {
    private FooServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FooServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FooServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FooServiceStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest request,
        io.grpc.stub.StreamObserver<com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void anotherHello(com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest request,
        io.grpc.stub.StreamObserver<com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAnotherHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Example service definition.
   * </pre>
   */
  public static final class FooServiceBlockingStub extends io.grpc.stub.AbstractStub<FooServiceBlockingStub> {
    private FooServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FooServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FooServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FooServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse sayHello(com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse anotherHello(com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest request) {
      return blockingUnaryCall(
          getChannel(), getAnotherHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Example service definition.
   * </pre>
   */
  public static final class FooServiceFutureStub extends io.grpc.stub.AbstractStub<FooServiceFutureStub> {
    private FooServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FooServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FooServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FooServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> sayHello(
        com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse> anotherHello(
        com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAnotherHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_ANOTHER_HELLO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FooServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FooServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest) request,
              (io.grpc.stub.StreamObserver<com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse>) responseObserver);
          break;
        case METHODID_ANOTHER_HELLO:
          serviceImpl.anotherHello((com.alibaba.csp.sentinel.adapter.grpc.gen.FooRequest) request,
              (io.grpc.stub.StreamObserver<com.alibaba.csp.sentinel.adapter.grpc.gen.FooResponse>) responseObserver);
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

  private static abstract class FooServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FooServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.alibaba.csp.sentinel.adapter.grpc.gen.FooProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FooService");
    }
  }

  private static final class FooServiceFileDescriptorSupplier
      extends FooServiceBaseDescriptorSupplier {
    FooServiceFileDescriptorSupplier() {}
  }

  private static final class FooServiceMethodDescriptorSupplier
      extends FooServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FooServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FooServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FooServiceFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getAnotherHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
