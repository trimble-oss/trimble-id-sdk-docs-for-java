//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[OpenIdKeysetProvider](index.md)

# OpenIdKeysetProvider

[JVM]\
open class [OpenIdKeysetProvider](index.md) : [IKeysetProvider](../-i-keyset-provider/index.md)

A keyset provider based on the OAuth well known configuration

## Constructors

| | |
|---|---|
| [OpenIdKeysetProvider](-open-id-keyset-provider.md) | [JVM]<br>constructor(endpointProvider: [IEndpointProvider](../-i-endpoint-provider/index.md))<br>Public constructor of OpenIdKeysetProvider |

## Functions

| Name | Summary |
|---|---|
| [retrieveKeyset](retrieve-keyset.md) | [JVM]<br>open fun [retrieveKeyset](retrieve-keyset.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;JWKSet&gt;<br>Get the JSON Web Keyset |
