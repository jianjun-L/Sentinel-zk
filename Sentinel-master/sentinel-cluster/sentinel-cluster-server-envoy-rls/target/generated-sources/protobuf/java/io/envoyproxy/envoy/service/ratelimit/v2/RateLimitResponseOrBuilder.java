// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/ratelimit/v2/rls.proto

package io.envoyproxy.envoy.service.ratelimit.v2;

public interface RateLimitResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.ratelimit.v2.RateLimitResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The overall response code which takes into account all of the descriptors that were passed
   * in the RateLimitRequest message.
   * </pre>
   *
   * <code>.envoy.service.ratelimit.v2.RateLimitResponse.Code overall_code = 1;</code>
   * @return The enum numeric value on the wire for overallCode.
   */
  int getOverallCodeValue();
  /**
   * <pre>
   * The overall response code which takes into account all of the descriptors that were passed
   * in the RateLimitRequest message.
   * </pre>
   *
   * <code>.envoy.service.ratelimit.v2.RateLimitResponse.Code overall_code = 1;</code>
   * @return The overallCode.
   */
  io.envoyproxy.envoy.service.ratelimit.v2.RateLimitResponse.Code getOverallCode();

  /**
   * <pre>
   * A list of DescriptorStatus messages which matches the length of the descriptor list passed
   * in the RateLimitRequest. This can be used by the caller to determine which individual
   * descriptors failed and/or what the currently configured limits are for all of them.
   * </pre>
   *
   * <code>repeated .envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatus statuses = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatus> 
      getStatusesList();
  /**
   * <pre>
   * A list of DescriptorStatus messages which matches the length of the descriptor list passed
   * in the RateLimitRequest. This can be used by the caller to determine which individual
   * descriptors failed and/or what the currently configured limits are for all of them.
   * </pre>
   *
   * <code>repeated .envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatus statuses = 2;</code>
   */
  io.envoyproxy.envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatus getStatuses(int index);
  /**
   * <pre>
   * A list of DescriptorStatus messages which matches the length of the descriptor list passed
   * in the RateLimitRequest. This can be used by the caller to determine which individual
   * descriptors failed and/or what the currently configured limits are for all of them.
   * </pre>
   *
   * <code>repeated .envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatus statuses = 2;</code>
   */
  int getStatusesCount();
  /**
   * <pre>
   * A list of DescriptorStatus messages which matches the length of the descriptor list passed
   * in the RateLimitRequest. This can be used by the caller to determine which individual
   * descriptors failed and/or what the currently configured limits are for all of them.
   * </pre>
   *
   * <code>repeated .envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatus statuses = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatusOrBuilder> 
      getStatusesOrBuilderList();
  /**
   * <pre>
   * A list of DescriptorStatus messages which matches the length of the descriptor list passed
   * in the RateLimitRequest. This can be used by the caller to determine which individual
   * descriptors failed and/or what the currently configured limits are for all of them.
   * </pre>
   *
   * <code>repeated .envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatus statuses = 2;</code>
   */
  io.envoyproxy.envoy.service.ratelimit.v2.RateLimitResponse.DescriptorStatusOrBuilder getStatusesOrBuilder(
      int index);

  /**
   * <pre>
   * [#next-major-version: rename to response_headers_to_add]
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValue headers = 3;</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.core.HeaderValue> 
      getHeadersList();
  /**
   * <pre>
   * [#next-major-version: rename to response_headers_to_add]
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValue headers = 3;</code>
   */
  io.envoyproxy.envoy.api.v2.core.HeaderValue getHeaders(int index);
  /**
   * <pre>
   * [#next-major-version: rename to response_headers_to_add]
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValue headers = 3;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * [#next-major-version: rename to response_headers_to_add]
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValue headers = 3;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder> 
      getHeadersOrBuilderList();
  /**
   * <pre>
   * [#next-major-version: rename to response_headers_to_add]
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValue headers = 3;</code>
   */
  io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder getHeadersOrBuilder(
      int index);

  /**
   * <pre>
   * A list of headers to add to the request when forwarded
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValue request_headers_to_add = 4;</code>
   */
  java.util.List<io.envoyproxy.envoy.api.v2.core.HeaderValue> 
      getRequestHeadersToAddList();
  /**
   * <pre>
   * A list of headers to add to the request when forwarded
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValue request_headers_to_add = 4;</code>
   */
  io.envoyproxy.envoy.api.v2.core.HeaderValue getRequestHeadersToAdd(int index);
  /**
   * <pre>
   * A list of headers to add to the request when forwarded
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValue request_headers_to_add = 4;</code>
   */
  int getRequestHeadersToAddCount();
  /**
   * <pre>
   * A list of headers to add to the request when forwarded
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValue request_headers_to_add = 4;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder> 
      getRequestHeadersToAddOrBuilderList();
  /**
   * <pre>
   * A list of headers to add to the request when forwarded
   * </pre>
   *
   * <code>repeated .envoy.api.v2.core.HeaderValue request_headers_to_add = 4;</code>
   */
  io.envoyproxy.envoy.api.v2.core.HeaderValueOrBuilder getRequestHeadersToAddOrBuilder(
      int index);
}