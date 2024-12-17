//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[FixedEndpointProvider](index.md)

# FixedEndpointProvider

[JVM]\
open class [FixedEndpointProvider](index.md) : [IEndpointProvider](../-i-endpoint-provider/index.md)

An endpoint provider that returns fixed values

## Constructors

| | |
|---|---|
| [FixedEndpointProvider](-fixed-endpoint-provider.md) | [JVM]<br>constructor()<br>Public constructor to create FixedEndpointProvider without any endpoints<br>constructor(authorizationEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html), tokenEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html))<br>Public constructor of FixedEndpointProvider |

## Functions

| Name | Summary |
|---|---|
| [getAuthorizationEndpoint](get-authorization-endpoint.md) | [JVM]<br>open fun [getAuthorizationEndpoint](get-authorization-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Get the authorization endpoint |
| [getEndSessionEndpoint](get-end-session-endpoint.md) | [JVM]<br>open fun [getEndSessionEndpoint](get-end-session-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Get the end session endpoint |
| [getJSONWebKeysetEndpoint](get-j-s-o-n-web-keyset-endpoint.md) | [JVM]<br>open fun [getJSONWebKeysetEndpoint](get-j-s-o-n-web-keyset-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Get the JSON Web Keyset endpoint |
| [getRevocationEndpoint](get-revocation-endpoint.md) | [JVM]<br>open fun [getRevocationEndpoint](get-revocation-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Get the revocation endpoint |
| [getTokenEndpoint](get-token-endpoint.md) | [JVM]<br>open fun [getTokenEndpoint](get-token-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Get the token endpoint |
| [WithAuthorizationEndpoint](-with-authorization-endpoint.md) | [JVM]<br>open fun [WithAuthorizationEndpoint](-with-authorization-endpoint.md)(authorizationEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)): [FixedEndpointProvider](index.md)<br>Fluent extension to add authorization endpoint to the endpoint provider |
| [WithEndSessionEndpoint](-with-end-session-endpoint.md) | [JVM]<br>open fun [WithEndSessionEndpoint](-with-end-session-endpoint.md)(endSessionEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)): [FixedEndpointProvider](index.md)<br>Fluent extension to add end session endpoint to the endpoint provider |
| [WithJSONWebKeysetEndpoint](-with-j-s-o-n-web-keyset-endpoint.md) | [JVM]<br>open fun [WithJSONWebKeysetEndpoint](-with-j-s-o-n-web-keyset-endpoint.md)(jwksEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)): [FixedEndpointProvider](index.md)<br>Fluent extension to add JSON Web Keyset endpoint to the endpoint provider |
| [WithRevocationEndpoint](-with-revocation-endpoint.md) | [JVM]<br>open fun [WithRevocationEndpoint](-with-revocation-endpoint.md)(revocationEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)): [FixedEndpointProvider](index.md)<br>Fluent extension to add revocation endpoint to the endpoint provider |
| [WithTokenEndpoint](-with-token-endpoint.md) | [JVM]<br>open fun [WithTokenEndpoint](-with-token-endpoint.md)(tokenEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)): [FixedEndpointProvider](index.md)<br>Fluent extension to add token endpoint to the endpoint provider |
