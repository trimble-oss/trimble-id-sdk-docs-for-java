//[trimble-id](../../../index.md)/[com.trimble.id](../index.md)/[AuthorizationCodeGrantTokenProvider](index.md)

# AuthorizationCodeGrantTokenProvider

[JVM]\
open class [AuthorizationCodeGrantTokenProvider](index.md) : [ITokenProvider](../-i-token-provider/index.md)

A token provider based on the OAuth Authorization Code grant type

## Constructors

| | |
|---|---|
| [AuthorizationCodeGrantTokenProvider](-authorization-code-grant-token-provider.md) | [JVM]<br>constructor(endpointProvider: [IEndpointProvider](../-i-endpoint-provider/index.md), clientId: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html), redirectUri: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html))<br>Public constructor of AuthorizationCodeGrantTokenProvider class |

## Properties

| Name | Summary |
|---|---|
| [endpointProvider](endpoint-provider.md) | [JVM]<br>open val [endpointProvider](endpoint-provider.md): [IEndpointProvider](../-i-endpoint-provider/index.md) |
| [httpTokenClient](http-token-client.md) | [JVM]<br>open val [httpTokenClient](http-token-client.md): [IHttpTokenClient](../-i-http-token-client/index.md) |
| [refreshableTokenProvider](refreshable-token-provider.md) | [JVM]<br>open var [refreshableTokenProvider](refreshable-token-provider.md): [RefreshableTokenProvider](../-refreshable-token-provider/index.md) |

## Functions

| Name | Summary |
|---|---|
| [createAuthorizationUri](create-authorization-uri.md) | [JVM]<br>open fun [createAuthorizationUri](create-authorization-uri.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Create an authorization URI with the provided parameters |
| [createLogoutUri](create-logout-uri.md) | [JVM]<br>open fun [createLogoutUri](create-logout-uri.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)&gt;<br>Create a logout URI with the provided parameters |
| [getAccessToken](get-access-token.md) | [JVM]<br>open fun [getAccessToken](get-access-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;<br>Retrieves an access token for the authenticated user |
| [getIdToken](get-id-token.md) | [JVM]<br>open fun [getIdToken](get-id-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;<br>Retrieves an ID token for the authenticated user |
| [getRefreshToken](get-refresh-token.md) | [JVM]<br>open fun [getRefreshToken](get-refresh-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;<br>Retrieves a refresh token for the authenticated user |
| [isAuthorizationSuccessful](is-authorization-successful.md) | [JVM]<br>open fun [isAuthorizationSuccessful](is-authorization-successful.md)(queryString: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Boolean](https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html)&gt;<br>Checks if the authorization was successful |
| [revokeRefreshToken](revoke-refresh-token.md) | [JVM]<br>open fun [revokeRefreshToken](revoke-refresh-token.md)(): [CompletableFuture](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html)&lt;[Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)&gt;<br>Revokes the refresh token |
| [withClientSecret](with-client-secret.md) | [JVM]<br>open fun [withClientSecret](with-client-secret.md)(clientSecret: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [AuthorizationCodeGrantTokenProvider](index.md)<br>Fluent extension to add client secret to the token provider |
| [withCodeChallenge](with-code-challenge.md) | [JVM]<br>open fun [withCodeChallenge](with-code-challenge.md)(codeChallenge: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [AuthorizationCodeGrantTokenProvider](index.md)<br>Fluent extension to add code challenge to the token provider |
| [withCodeVerifier](with-code-verifier.md) | [JVM]<br>open fun [withCodeVerifier](with-code-verifier.md)(codeVerifier: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [AuthorizationCodeGrantTokenProvider](index.md)<br>Fluent extension to add code verifier to the token provider |
| [withIdentityProvider](with-identity-provider.md) | [JVM]<br>open fun [withIdentityProvider](with-identity-provider.md)(identityProvider: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [AuthorizationCodeGrantTokenProvider](index.md)<br>Fluent extension to add identity provider to the token provider |
| [withLogoutRedirect](with-logout-redirect.md) | [JVM]<br>open fun [withLogoutRedirect](with-logout-redirect.md)(logoutRedirectUri: [URI](https://docs.oracle.com/javase/8/docs/api/java/net/URI.html)): [AuthorizationCodeGrantTokenProvider](index.md)<br>Fluent extension to add logout redirect URI to the token provider |
| [withProofKeyForCodeExchange](with-proof-key-for-code-exchange.md) | [JVM]<br>open fun [withProofKeyForCodeExchange](with-proof-key-for-code-exchange.md)(): [AuthorizationCodeGrantTokenProvider](index.md)<br>Fluent extension to use PKCE flow for the token provider |
| [withRandomState](with-random-state.md) | [JVM]<br>open fun [withRandomState](with-random-state.md)(): [AuthorizationCodeGrantTokenProvider](index.md)<br>Fluent extension to add random state to the token provider |
| [withScopes](with-scopes.md) | [JVM]<br>open fun [withScopes](with-scopes.md)(scopes: Array&lt;[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)&gt;): [AuthorizationCodeGrantTokenProvider](index.md)<br>Fluent extension to add scopes to the token provider |
| [withState](with-state.md) | [JVM]<br>open fun [withState](with-state.md)(state: [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)): [AuthorizationCodeGrantTokenProvider](index.md)<br>Fluent extension to add state to the token provider |
