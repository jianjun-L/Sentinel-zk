// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: example.proto

package com.alibaba.csp.sentinel.adapter.grpc.gen;

public final class FooProto {
  private FooProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alibaba_sentinel_examples_FooRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_alibaba_sentinel_examples_FooRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_alibaba_sentinel_examples_FooResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_alibaba_sentinel_examples_FooResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rexample.proto\022\035com.alibaba.sentinel.ex" +
      "amples\"&\n\nFooRequest\022\014\n\004name\030\001 \001(\t\022\n\n\002id" +
      "\030\002 \001(\005\"\036\n\013FooResponse\022\017\n\007message\030\001 \001(\t2\332" +
      "\001\n\nFooService\022c\n\010sayHello\022).com.alibaba." +
      "sentinel.examples.FooRequest\032*.com.aliba" +
      "ba.sentinel.examples.FooResponse\"\000\022g\n\014an" +
      "otherHello\022).com.alibaba.sentinel.exampl" +
      "es.FooRequest\032*.com.alibaba.sentinel.exa" +
      "mples.FooResponse\"\000B7\n)com.alibaba.csp.s" +
      "entinel.adapter.grpc.genB\010FooProtoP\001b\006pr" +
      "oto3"
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
    internal_static_com_alibaba_sentinel_examples_FooRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_alibaba_sentinel_examples_FooRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_alibaba_sentinel_examples_FooRequest_descriptor,
        new java.lang.String[] { "Name", "Id", });
    internal_static_com_alibaba_sentinel_examples_FooResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_alibaba_sentinel_examples_FooResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_alibaba_sentinel_examples_FooResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}