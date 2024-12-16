//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[HttpClientConfiguration](index.md)

# HttpClientConfiguration

[JVM]\
open class [HttpClientConfiguration](index.md)

Configuration for the HttpClient. The code retries if the response status code is in the 5xx range. This indicates server-side errors, such as internal server errors, bad gateway, service unavailable, etc. The code retries if an IOException occurs during the request. This can happen due to network issues, timeouts, or other I/O problems.

## Constructors

| | |
|---|---|
| [HttpClientConfiguration](-http-client-configuration.md) | [JVM]<br>constructor() |

## Properties

| Name | Summary |
|---|---|
| [httpTimeout](http-timeout.md) | [JVM]<br>open var [httpTimeout](http-timeout.md): [Duration](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html)<br>Timeout used for Http calls. |
| [retries](retries.md) | [JVM]<br>open var [retries](retries.md): Int<br>Number of retries for HTTP calls with a retry-able response. |
| [retryInterval](retry-interval.md) | [JVM]<br>open var [retryInterval](retry-interval.md): [Duration](https://docs.oracle.com/javase/8/docs/api/java/time/Duration.html)<br>Time to wait between retries. |
