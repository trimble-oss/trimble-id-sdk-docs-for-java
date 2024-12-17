//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[BearerTokenHttpClientProvider](index.md)

# BearerTokenHttpClientProvider

[JVM]\
open class [BearerTokenHttpClientProvider](index.md) : [IHttpClientProvider](../-i-http-client-provider/index.md)

A HttpClient provider for APIs using Bearer token authorization

## Constructors

| | |
|---|---|
| [BearerTokenHttpClientProvider](-bearer-token-http-client-provider.md) | [JVM]<br>constructor(tokenProvider: [ITokenProvider](../-i-token-provider/index.md), baseUri: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html), configuration: [HttpClientConfiguration](../-http-client-configuration/index.md))<br>Public constructor of BearerTokenHttpClientProvider<br>constructor(tokenProvider: [ITokenProvider](../-i-token-provider/index.md), baseUri: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html))<br>Public constructor of BearerTokenHttpClientProvider |

## Functions

| Name | Summary |
|---|---|
| [dispose](dispose.md) | [JVM]<br>open fun [dispose](dispose.md)()<br>Dispose the HttpClient |
| [retrieveClient](retrieve-client.md) | [JVM]<br>open fun [retrieveClient](retrieve-client.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[HttpClient](../-http-client/index.md)&gt;<br>Get the HttpClient with the authorization token set |
| [withTokenProvider](with-token-provider.md) | [JVM]<br>open fun [withTokenProvider](with-token-provider.md)(tokenProvider: [FixedTokenProvider](../-fixed-token-provider/index.md)): [BearerTokenHttpClientProvider](index.md)<br>Set the token provider |
