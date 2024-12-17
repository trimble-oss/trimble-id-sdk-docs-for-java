//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[FixedTokenProvider](index.md)

# FixedTokenProvider

[JVM]\
open class [FixedTokenProvider](index.md) : [ITokenProvider](../-i-token-provider/index.md)

Represents a token provider that returns a fixed token.

## Constructors

| | |
|---|---|
| [FixedTokenProvider](-fixed-token-provider.md) | [JVM]<br>constructor(accessToken: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Creates a new instance of the FixedTokenProvider class. |

## Functions

| Name | Summary |
|---|---|
| [getAccessToken](get-access-token.md) | [JVM]<br>open fun [getAccessToken](get-access-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;<br>Gets the access token. |
| [getIdToken](../-i-token-provider/get-id-token.md) | [JVM]<br>open fun [getIdToken](../-i-token-provider/get-id-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getRefreshToken](../-i-token-provider/get-refresh-token.md) | [JVM]<br>open fun [getRefreshToken](../-i-token-provider/get-refresh-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [revokeRefreshToken](../-i-token-provider/revoke-refresh-token.md) | [JVM]<br>open fun [revokeRefreshToken](../-i-token-provider/revoke-refresh-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)&gt; |
