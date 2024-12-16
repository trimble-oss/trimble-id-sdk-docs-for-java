//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[OpenIdEndpointProvider](index.md)

# OpenIdEndpointProvider

[JVM]\
open class [OpenIdEndpointProvider](index.md) : [IEndpointProvider](../-i-endpoint-provider/index.md)

An endpoint provider that returns values from a OpenID well known configuration

## Constructors

| | |
|---|---|
| [OpenIdEndpointProvider](-open-id-endpoint-provider.md) | [JVM]<br>constructor(openIdConfigurationEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html))<br>Public constructor of OpenIdEndpointProvider |

## Properties

| Name | Summary |
|---|---|
| [openIdConfigurationEndpoint](open-id-configuration-endpoint.md) | [JVM]<br>open var [openIdConfigurationEndpoint](open-id-configuration-endpoint.md): [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html) |

## Functions

| Name | Summary |
|---|---|
| [getAuthorizationEndpoint](get-authorization-endpoint.md) | [JVM]<br>open fun [getAuthorizationEndpoint](get-authorization-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Get the authorization endpoint |
| [getEndSessionEndpoint](get-end-session-endpoint.md) | [JVM]<br>open fun [getEndSessionEndpoint](get-end-session-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Get the end session endpoint |
| [getJSONWebKeysetEndpoint](get-j-s-o-n-web-keyset-endpoint.md) | [JVM]<br>open fun [getJSONWebKeysetEndpoint](get-j-s-o-n-web-keyset-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Get the JSON Web Keyset endpoint |
| [getRevocationEndpoint](get-revocation-endpoint.md) | [JVM]<br>open fun [getRevocationEndpoint](get-revocation-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Get the revocation endpoint |
| [getTokenEndpoint](get-token-endpoint.md) | [JVM]<br>open fun [getTokenEndpoint](get-token-endpoint.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Get the token endpoint |
| [setAuthorizationEndpoint](set-authorization-endpoint.md) | [JVM]<br>open fun [setAuthorizationEndpoint](set-authorization-endpoint.md)(authorizationEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)) |
| [setEndSessionEndpoint](set-end-session-endpoint.md) | [JVM]<br>open fun [setEndSessionEndpoint](set-end-session-endpoint.md)(endSessionEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)) |
| [setJwksEndpoint](set-jwks-endpoint.md) | [JVM]<br>open fun [setJwksEndpoint](set-jwks-endpoint.md)(jwksEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)) |
| [setRevocationEndpoint](set-revocation-endpoint.md) | [JVM]<br>open fun [setRevocationEndpoint](set-revocation-endpoint.md)(revocationEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)) |
| [setTokenEndpoint](set-token-endpoint.md) | [JVM]<br>open fun [setTokenEndpoint](set-token-endpoint.md)(tokenEndpoint: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)) |
