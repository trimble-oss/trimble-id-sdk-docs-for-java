//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[IHttpTokenClient](index.md)

# IHttpTokenClient

interface [IHttpTokenClient](index.md)

#### Inheritors

| |
|---|
| [HttpTokenClient](../-http-token-client/index.md) |

## Functions

| Name | Summary |
|---|---|
| [getOauthTokens](get-oauth-tokens.md) | [JVM]<br>abstract fun [getOauthTokens](get-oauth-tokens.md)(tokenRequest: [TokenRequest](../-token-request/index.md)): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[TokenResponse](../-token-response/index.md)&gt; |
| [revokeRefreshToken](revoke-refresh-token.md) | [JVM]<br>abstract fun [revokeRefreshToken](revoke-refresh-token.md)(tokenRequest: [TokenRequest](../-token-request/index.md)): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)&gt; |
