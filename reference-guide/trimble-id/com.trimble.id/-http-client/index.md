//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[HttpClient](index.md)

# HttpClient

[JVM]\
open class [HttpClient](index.md)

HttpClient class to make HTTP requests.

## Constructors

| | |
|---|---|
| [HttpClient](-http-client.md) | [JVM]<br>constructor()<br>Default constructor<br>constructor(configuration: [HttpClientConfiguration](../-http-client-configuration/index.md))<br>Constructor with configuration<br>constructor(baseUri: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html))<br>Constructor with baseUri<br>constructor(baseUri: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html), configuration: [HttpClientConfiguration](../-http-client-configuration/index.md))<br>Constructor with baseUri and configuration |

## Functions

| Name | Summary |
|---|---|
| [delete](delete.md) | [JVM]<br>open fun &lt;[T](delete.md)&gt; [delete](delete.md)(url: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), headers: [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[NameValuePair](../-name-value-pair/index.md)&gt;, responseType: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](delete.md)&gt;): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Response](../-response/index.md)&lt;[T](delete.md)&gt;&gt;<br>Delete method |
| [dispose](dispose.md) | [JVM]<br>open fun [dispose](dispose.md)()<br>Shutdown the HttpClient |
| [get](get.md) | [JVM]<br>open fun &lt;[T](get.md)&gt; [get](get.md)(url: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), headers: [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[NameValuePair](../-name-value-pair/index.md)&gt;, responseType: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](get.md)&gt;): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Response](../-response/index.md)&lt;[T](get.md)&gt;&gt;<br>Get method |
| [patch](patch.md) | [JVM]<br>open fun &lt;[T](patch.md)&gt; [patch](patch.md)(url: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), payload: [RequestPayload](../-request-payload/index.md), headers: [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[NameValuePair](../-name-value-pair/index.md)&gt;, responseType: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](patch.md)&gt;): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Response](../-response/index.md)&lt;[T](patch.md)&gt;&gt;<br>Patch method |
| [post](post.md) | [JVM]<br>open fun &lt;[T](post.md)&gt; [post](post.md)(url: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), payload: [RequestPayload](../-request-payload/index.md), headers: [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[NameValuePair](../-name-value-pair/index.md)&gt;, responseType: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](post.md)&gt;): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Response](../-response/index.md)&lt;[T](post.md)&gt;&gt;<br>Post method |
| [put](put.md) | [JVM]<br>open fun &lt;[T](put.md)&gt; [put](put.md)(url: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), payload: [RequestPayload](../-request-payload/index.md), headers: [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[NameValuePair](../-name-value-pair/index.md)&gt;, responseType: [Class](https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html)&lt;[T](put.md)&gt;): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Response](../-response/index.md)&lt;[T](put.md)&gt;&gt;<br>Put method |
