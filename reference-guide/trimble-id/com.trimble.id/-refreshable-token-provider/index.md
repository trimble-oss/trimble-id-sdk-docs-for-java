//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[RefreshableTokenProvider](index.md)

# RefreshableTokenProvider

[JVM]\
open class [RefreshableTokenProvider](index.md) : [ITokenProvider](../-i-token-provider/index.md)

## Constructors

| | |
|---|---|
| [RefreshableTokenProvider](-refreshable-token-provider.md) | [JVM]<br>constructor(endpointProvider: [IEndpointProvider](../-i-endpoint-provider/index.md), clientId: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), clientSecret: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), accessToken: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), tokenExpiry: [Long](https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html), refreshToken: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), idToken: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), codeVerifier: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)) |

## Properties

| Name | Summary |
|---|---|
| [codeVerifier](code-verifier.md) | [JVM]<br>open var [codeVerifier](code-verifier.md): [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) |
| [tokenExpiry](token-expiry.md) | [JVM]<br>open var [tokenExpiry](token-expiry.md): [Long](https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html) |

## Functions

| Name | Summary |
|---|---|
| [getAccessToken](get-access-token.md) | [JVM]<br>open fun [getAccessToken](get-access-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getIdToken](get-id-token.md) | [JVM]<br>open fun [getIdToken](get-id-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getRefreshToken](get-refresh-token.md) | [JVM]<br>open fun [getRefreshToken](get-refresh-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [revokeRefreshToken](revoke-refresh-token.md) | [JVM]<br>open fun [revokeRefreshToken](revoke-refresh-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)&gt; |
| [setAccessToken](set-access-token.md) | [JVM]<br>open fun [setAccessToken](set-access-token.md)(accessToken: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)) |
| [setIdToken](set-id-token.md) | [JVM]<br>open fun [setIdToken](set-id-token.md)(idToken: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)) |
| [setRefreshToken](set-refresh-token.md) | [JVM]<br>open fun [setRefreshToken](set-refresh-token.md)(refreshToken: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)) |
