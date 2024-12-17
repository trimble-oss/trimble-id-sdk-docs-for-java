//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[Response](index.md)

# Response

[JVM]\
open class [Response](index.md)&lt;[T](index.md)&gt;

Represents the response from an HTTP request.

## Constructors

| | |
|---|---|
| [Response](-response.md) | [JVM]<br>constructor(statusCode: Int, headers: [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;&gt;, data: [T](index.md), requestId: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), errorMessage: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))constructor(statusCode: Int, headers: [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;&gt;, data: [T](index.md), requestId: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), apiEndpoint: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), responseTime: Long) |

## Properties

| Name | Summary |
|---|---|
| [apiEndpoint](api-endpoint.md) | [JVM]<br>open var [apiEndpoint](api-endpoint.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [data](data.md) | [JVM]<br>open var [data](data.md): [T](index.md) |
| [errorMessage](error-message.md) | [JVM]<br>open val [errorMessage](error-message.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [headers](headers.md) | [JVM]<br>open val [headers](headers.md): [Map](https://docs.oracle.com/javase/8/docs/api/java/util/Map.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), [List](https://docs.oracle.com/javase/8/docs/api/java/util/List.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;&gt; |
| [requestId](request-id.md) | [JVM]<br>open val [requestId](request-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [responseTime](response-time.md) | [JVM]<br>open var [responseTime](response-time.md): Long |
| [statusCode](status-code.md) | [JVM]<br>open val [statusCode](status-code.md): Int |

## Functions

| Name | Summary |
|---|---|
| [toString](to-string.md) | [JVM]<br>open fun [toString](to-string.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
