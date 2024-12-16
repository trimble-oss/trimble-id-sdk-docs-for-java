//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[HttpClient](index.md)/[patch](patch.md)

# patch

[JVM]\
open fun &lt;[T](patch.md)&gt; [patch](patch.md)(url: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), payload: [RequestPayload](../-request-payload/index.md), headers: [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[NameValuePair](../-name-value-pair/index.md)&gt;, responseType: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](patch.md)&gt;): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Response](../-response/index.md)&lt;[T](patch.md)&gt;&gt;

Patch method

#### Return

#### Parameters

JVM

| | |
|---|---|
| &lt;T&gt; | - responseType |
| url | - url |
| payload | - It has the payload data and content type |
| headers | - headers |
| responseType | - responseType |

#### Throws

| | |
|---|---|
| [TCPServiceException](../-t-c-p-service-exception/index.md) | - If an error occurs due to API or network-related issues. |
| [SDKClientException](../-s-d-k-client-exception/index.md) | - If a client-side error occurs within the SDK. |
