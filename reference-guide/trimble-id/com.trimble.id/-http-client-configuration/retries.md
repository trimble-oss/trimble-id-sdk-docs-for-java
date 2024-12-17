//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[HttpClientConfiguration](index.md)/[retries](retries.md)

# retries

[JVM]\
open var [retries](retries.md): Int

Number of retries for HTTP calls with a retry-able response. The code retries if the response status code is in the 5xx range. This indicates server-side errors, such as internal server errors, bad gateway, service unavailable, etc.
