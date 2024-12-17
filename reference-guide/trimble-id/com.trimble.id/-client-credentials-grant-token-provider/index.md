//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[ClientCredentialsGrantTokenProvider](index.md)

# ClientCredentialsGrantTokenProvider

[JVM]\
open class [ClientCredentialsGrantTokenProvider](index.md) : [ITokenProvider](../-i-token-provider/index.md)

A token provider based on the OAuth Client Credential grant type

## Constructors

| | |
|---|---|
| [ClientCredentialsGrantTokenProvider](-client-credentials-grant-token-provider.md) | [JVM]<br>constructor(endpointProvider: [IEndpointProvider](../-i-endpoint-provider/index.md), clientId: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), clientSecret: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html))<br>Public constructor of ClientCredentialsGrantTokenProvider |

## Properties

| Name | Summary |
|---|---|
| [tokenExpiry](token-expiry.md) | [JVM]<br>open var [tokenExpiry](token-expiry.md): [Long](https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html) |

## Functions

| Name | Summary |
|---|---|
| [getAccessToken](get-access-token.md) | [JVM]<br>open fun [getAccessToken](get-access-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;<br>Get the access token |
| [getIdToken](../-i-token-provider/get-id-token.md) | [JVM]<br>open fun [getIdToken](../-i-token-provider/get-id-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [getRefreshToken](../-i-token-provider/get-refresh-token.md) | [JVM]<br>open fun [getRefreshToken](../-i-token-provider/get-refresh-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt; |
| [revokeRefreshToken](../-i-token-provider/revoke-refresh-token.md) | [JVM]<br>open fun [revokeRefreshToken](../-i-token-provider/revoke-refresh-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)&gt; |
| [setAccessToken](set-access-token.md) | [JVM]<br>open fun [setAccessToken](set-access-token.md)(accessToken: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)) |
| [withScopes](with-scopes.md) | [JVM]<br>open fun [withScopes](with-scopes.md)(scopes: Array&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;): [ClientCredentialsGrantTokenProvider](index.md)<br>Fluent extension to add scopes to the token provider |
