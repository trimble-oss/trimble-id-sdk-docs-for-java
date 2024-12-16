//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[ValidatedClaimsetProvider](index.md)

# ValidatedClaimsetProvider

[JVM]\
open class [ValidatedClaimsetProvider](index.md) : [IClaimsetProvider](../-i-claimset-provider/index.md)

A claimset provider that returns a validated claimset

## Constructors

| | |
|---|---|
| [ValidatedClaimsetProvider](-validated-claimset-provider.md) | [JVM]<br>constructor(keysetProvider: [IKeysetProvider](../-i-keyset-provider/index.md))<br>Public constructor of ValidatedClaimsetProvider |

## Functions

| Name | Summary |
|---|---|
| [retrieveClaimset](retrieve-claimset.md) | [JVM]<br>open fun [retrieveClaimset](retrieve-claimset.md)(token: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;JWTClaimsSet&gt;<br>Get the claimset |
