//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[SDKClientException](index.md)

# SDKClientException

[JVM]\
open class [SDKClientException](index.md) : [CompletionException](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletionException.html)

## Constructors

| | |
|---|---|
| [SDKClientException](-s-d-k-client-exception.md) | [JVM]<br>constructor(ex: [Exception](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html))constructor(message: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))constructor(error: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), message: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))constructor(ex: [Exception](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html), cause: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html), msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))constructor(cause: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html), msg: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)) |

## Properties

| Name | Summary |
|---|---|
| [cause](../-t-c-p-service-exception/index.md#-1023347080%2FProperties%2F1213652557) | [JVM]<br>open val [cause](../-t-c-p-service-exception/index.md#-1023347080%2FProperties%2F1213652557): [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html) |
| [error](error.md) | [JVM]<br>val [error](error.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [exception](exception.md) | [JVM]<br>val [exception](exception.md): [Exception](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html) |
| [stackTrace](../-t-c-p-service-exception/index.md#1573944892%2FProperties%2F1213652557) | [JVM]<br>open var [stackTrace](../-t-c-p-service-exception/index.md#1573944892%2FProperties%2F1213652557): Array&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt; |

## Functions

| Name | Summary |
|---|---|
| [addSuppressed](../-t-c-p-service-exception/index.md#-1898257014%2FFunctions%2F1213652557) | [JVM]<br>fun [addSuppressed](../-t-c-p-service-exception/index.md#-1898257014%2FFunctions%2F1213652557)(p: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html)) |
| [fillInStackTrace](../-t-c-p-service-exception/index.md#-1207709164%2FFunctions%2F1213652557) | [JVM]<br>open fun [fillInStackTrace](../-t-c-p-service-exception/index.md#-1207709164%2FFunctions%2F1213652557)(): [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html) |
| [getLocalizedMessage](../-t-c-p-service-exception/index.md#-2138642817%2FFunctions%2F1213652557) | [JVM]<br>open fun [getLocalizedMessage](../-t-c-p-service-exception/index.md#-2138642817%2FFunctions%2F1213652557)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getMessage](../-t-c-p-service-exception/index.md#1068546184%2FFunctions%2F1213652557) | [JVM]<br>open fun [getMessage](../-t-c-p-service-exception/index.md#1068546184%2FFunctions%2F1213652557)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getSuppressed](../-t-c-p-service-exception/index.md#1678506999%2FFunctions%2F1213652557) | [JVM]<br>fun [getSuppressed](../-t-c-p-service-exception/index.md#1678506999%2FFunctions%2F1213652557)(): Array&lt;[Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html)&gt; |
| [initCause](../-t-c-p-service-exception/index.md#-104903378%2FFunctions%2F1213652557) | [JVM]<br>open fun [initCause](../-t-c-p-service-exception/index.md#-104903378%2FFunctions%2F1213652557)(p: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html)): [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html) |
| [printStackTrace](../-t-c-p-service-exception/index.md#-1357294889%2FFunctions%2F1213652557) | [JVM]<br>open fun [printStackTrace](../-t-c-p-service-exception/index.md#-1357294889%2FFunctions%2F1213652557)() |
| [toString](to-string.md) | [JVM]<br>open fun [toString](to-string.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
