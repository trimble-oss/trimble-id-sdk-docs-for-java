//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[ITokenProvider](index.md)

# ITokenProvider

interface [ITokenProvider](index.md)

#### Inheritors

| |
|---|
| [OnBehalfGrantTokenProvider](../-on-behalf-grant-token-provider/index.md) |
| [RefreshableTokenProvider](../-refreshable-token-provider/index.md) |
| [ClientCredentialsGrantTokenProvider](../-client-credentials-grant-token-provider/index.md) |
| [FixedTokenProvider](../-fixed-token-provider/index.md) |
| [AuthorizationCodeGrantTokenProvider](../-authorization-code-grant-token-provider/index.md) |

## Functions

| Name | Summary |
|---|---|
| [getAccessToken](get-access-token.md) | [JVM]<br>abstract fun [getAccessToken](get-access-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getIdToken](get-id-token.md) | [JVM]<br>open fun [getIdToken](get-id-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getRefreshToken](get-refresh-token.md) | [JVM]<br>open fun [getRefreshToken](get-refresh-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [revokeRefreshToken](revoke-refresh-token.md) | [JVM]<br>open fun [revokeRefreshToken](revoke-refresh-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)&gt; |
