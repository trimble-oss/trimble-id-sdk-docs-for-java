//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[HttpTokenClient](index.md)

# HttpTokenClient

[JVM]\
open class [HttpTokenClient](index.md) : [IHttpTokenClient](../-i-http-token-client/index.md)

## Constructors

| | |
|---|---|
| [HttpTokenClient](-http-token-client.md) | [JVM]<br>constructor(endpointProvider: [IEndpointProvider](../-i-endpoint-provider/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [objectMapper](object-mapper.md) | [JVM]<br>open val [objectMapper](object-mapper.md): ObjectMapper |
| [okHttpClient](ok-http-client.md) | [JVM]<br>open val [okHttpClient](ok-http-client.md): OkHttpClient |
| [revokeTokenEndpointUrl](revoke-token-endpoint-url.md) | [JVM]<br>open val [revokeTokenEndpointUrl](revoke-token-endpoint-url.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [tokenEndpointUrl](token-endpoint-url.md) | [JVM]<br>open val [tokenEndpointUrl](token-endpoint-url.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |

## Functions

| Name | Summary |
|---|---|
| [getOauthTokens](get-oauth-tokens.md) | [JVM]<br>open fun [getOauthTokens](get-oauth-tokens.md)(tokenRequest: [TokenRequest](../-token-request/index.md)): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[TokenResponse](../-token-response/index.md)&gt; |
| [revokeRefreshToken](revoke-refresh-token.md) | [JVM]<br>open fun [revokeRefreshToken](revoke-refresh-token.md)(tokenRequest: [TokenRequest](../-token-request/index.md)): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)&gt; |
