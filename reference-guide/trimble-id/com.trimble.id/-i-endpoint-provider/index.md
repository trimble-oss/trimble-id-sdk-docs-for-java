//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[IEndpointProvider](index.md)

# IEndpointProvider

interface [IEndpointProvider](index.md)

#### Inheritors

| |
|---|
| [OpenIdEndpointProvider](../-open-id-endpoint-provider/index.md) |
| [FixedEndpointProvider](../-fixed-endpoint-provider/index.md) |

## Functions

| Name | Summary |
|---|---|
| [getAuthorizationEndpoint](get-authorization-endpoint.md) | [JVM]<br>abstract fun [getAuthorizationEndpoint](get-authorization-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt; |
| [getEndSessionEndpoint](get-end-session-endpoint.md) | [JVM]<br>abstract fun [getEndSessionEndpoint](get-end-session-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt; |
| [getJSONWebKeysetEndpoint](get-j-s-o-n-web-keyset-endpoint.md) | [JVM]<br>abstract fun [getJSONWebKeysetEndpoint](get-j-s-o-n-web-keyset-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt; |
| [getRevocationEndpoint](get-revocation-endpoint.md) | [JVM]<br>abstract fun [getRevocationEndpoint](get-revocation-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt; |
| [getTokenEndpoint](get-token-endpoint.md) | [JVM]<br>abstract fun [getTokenEndpoint](get-token-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt; |
