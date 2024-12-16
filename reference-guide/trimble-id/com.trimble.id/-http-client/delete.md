//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[HttpClient](index.md)/[delete](delete.md)

# delete

[JVM]\
open fun &lt;[T](delete.md)&gt; [delete](delete.md)(url: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), headers: [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[NameValuePair](../-name-value-pair/index.md)&gt;, responseType: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](delete.md)&gt;): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Response](../-response/index.md)&lt;[T](delete.md)&gt;&gt;

Delete method

#### Return

- Future that resolves to Response

#### Parameters

JVM

| | |
|---|---|
| &lt;T&gt; | - responseType |
| url | - url |
| headers | - headers |
| responseType | - responseType |

#### Throws

| | |
|---|---|
| [TCPServiceException](../-t-c-p-service-exception/index.md) | - If an error occurs due to API or network-related issues. |
| [SDKClientException](../-s-d-k-client-exception/index.md) | - If a client-side error occurs within the SDK. |
