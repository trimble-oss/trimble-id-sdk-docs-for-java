//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[TCPServiceException](index.md)

# TCPServiceException

[JVM]\
open class [TCPServiceException](index.md) : [CompletionException](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletionException.html)

TCPException is a custom exception class that extends CompletionException.

## Constructors

| | |
|---|---|
| [TCPServiceException](-t-c-p-service-exception.md) | [JVM]<br>constructor(exception: [Exception](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html), requestId: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), statusCode: Int)<br>Constructor for TCPException.<br>constructor(message: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), requestId: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), statusCode: Int)<br>Constructor for TCPException.<br>constructor(exception: [Exception](https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html))<br>Constructor for TCPException.<br>constructor(message: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Constructor for TCPException. |

## Properties

| Name | Summary |
|---|---|
| [cause](index.md#-1023347080%2FProperties%2F1213652557) | [JVM]<br>open val [cause](index.md#-1023347080%2FProperties%2F1213652557): [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html) |
| [requestId](request-id.md) | [JVM]<br>val [requestId](request-id.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [stackTrace](index.md#1573944892%2FProperties%2F1213652557) | [JVM]<br>open var [stackTrace](index.md#1573944892%2FProperties%2F1213652557): Array&lt;[StackTraceElement](https://docs.oracle.com/javase/8/docs/api/java/lang/StackTraceElement.html)&gt; |
| [statusCode](status-code.md) | [JVM]<br>val [statusCode](status-code.md): Int |

## Functions

| Name | Summary |
|---|---|
| [addSuppressed](index.md#-1898257014%2FFunctions%2F1213652557) | [JVM]<br>fun [addSuppressed](index.md#-1898257014%2FFunctions%2F1213652557)(p: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html)) |
| [fillInStackTrace](index.md#-1207709164%2FFunctions%2F1213652557) | [JVM]<br>open fun [fillInStackTrace](index.md#-1207709164%2FFunctions%2F1213652557)(): [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html) |
| [getLocalizedMessage](index.md#-2138642817%2FFunctions%2F1213652557) | [JVM]<br>open fun [getLocalizedMessage](index.md#-2138642817%2FFunctions%2F1213652557)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getMessage](index.md#1068546184%2FFunctions%2F1213652557) | [JVM]<br>open fun [getMessage](index.md#1068546184%2FFunctions%2F1213652557)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [getSuppressed](index.md#1678506999%2FFunctions%2F1213652557) | [JVM]<br>fun [getSuppressed](index.md#1678506999%2FFunctions%2F1213652557)(): Array&lt;[Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html)&gt; |
| [initCause](index.md#-104903378%2FFunctions%2F1213652557) | [JVM]<br>open fun [initCause](index.md#-104903378%2FFunctions%2F1213652557)(p: [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html)): [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html) |
| [printStackTrace](index.md#-1357294889%2FFunctions%2F1213652557) | [JVM]<br>open fun [printStackTrace](index.md#-1357294889%2FFunctions%2F1213652557)() |
| [toString](to-string.md) | [JVM]<br>open fun [toString](to-string.md)(): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
