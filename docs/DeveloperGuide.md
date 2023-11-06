# trimble-id Developer Guide

### Content

1. [Overview](#overview)
2. [Authentication with Trimble Identity](#identity)
3. [Configure the endpoint](#configure-endpoint)
4. [Usage Reference](#code-snippets)

## <a name="overview">Overview</a> ##

It is core helper library containing primitives and interaction with supported grant type token providers. It is base library for OAuth 2.0 related protocol operations. It provides, 

- Discovery of endpoints
- Grant Types Token Providers
- Token Refresh
- Token Validation
- HTTP Client Handler to access a given API with the access token


## <a name="identity">Authentication with Trimble Identity</a> ##

To utilize TID authentication, the calling app must be registered with Trimble Identity. You can conveniently handle the application registration process on [Trimble Developer Console](https://developer.console.trimble.com)

## <a name="configure-endpoint">Configure the endpoint</a> ##

Configure the well-known URL endpoint is used to retrieve the authorization, token and user info endpoints for Trimble OAuth server. 

<table>
    <tbody>
        <tr>
            <th>Well-Known URL</th>
            <td>https://id.trimble.com/.well-known/openid-configuration</td>
        </tr>
    </tbody>
  </table>

## <a name="code-snippets">Usage Reference</a> ##

## Fixed Endpoint Provider

This endpoint provider is used to provide a fixed set of endpoints.

## Fixed Endpoint Provider

This endpoint provider is used to provide a fixed set of endpoints.

### Usage
```java
import com.trimble.id.FixedEndpointProvider;

FixedEndpointProvider endpointProvider = new FixedEndpointProvider(URI.create("https://authorization.url"), URI.create("https://token.url"));
URI endpoint = endpointProvider.getAuthorizationEndpoint().get();
```

## OpenID Endpoint Provider

This endpoint provider is used to retrieve the endpoints from a well-known URL endpoint.

### Usage
```java
import com.trimble.id.OpenIdEndpointProvider;

OpenIdEndpointProvider endpointProvider = new OpenIdEndpointProvider(URI.create("https://id.trimble.com/.well-known/openid-configuration"));
URI endpoint = endpointProvider.getAuthorizationEndpoint().get();
```

## Authorization Code Grant Token Provider

This token provider is used to retrieve an access token using the authorization code grant type.

### Usage
```java
import com.trimble.id.AuthorizationCodeGrantTokenProvider;

AuthorizationCodeGrantTokenProvider tokenProvider = new AuthorizationCodeGrantTokenProvider(endpointProvider, "clientId", "https://redirect.url").withClientSecret("clientSecret").withScopes(new String[] { "scope" });

// Launch the browser using this authorizationUri
URI authorizationUri = tokenProvider.createAuthorizationUri().get();

// Upon redirection, listen on rediect URI to validate the auth code
boolean validated = tokenProvider.isAuthorizationSuccessful(queryString);

// Once successfully validated, you can retrieve required tokens
if (validated) {
    String accessToken = tokenProvider.getAccessToken().get();
    String refreshToken = tokenProvider.getRefreshToken().get();
    String idToken = tokenProvider.getIdToken().get();
}
```

## Authorization Code Grant Token Provider with PKCE

Authorization Code with Proof Key for Code Exchange (PKCE) flow is an extension of the Authorization Code grant flow. However, with PKCE, client secret is not required.

### Usage
```java
import com.trimble.id.AuthorizationCodeGrantTokenProvider;

AuthorizationCodeGrantTokenProvider tokenProvider = new AuthorizationCodeGrantTokenProvider(endpointProvider, "clientId", "https://redirect.url").withProofKeyForCodeExchange().withScopes(new String[] { "scope" });

// Launch the browser using this authorizationUri
URI authorizationUri = tokenProvider.createAuthorizationUri().get();

// Upon redirection, listen on rediect URI to validate the auth code
boolean validated = tokenProvider.isAuthorizationSuccessful(queryString);

// Once successfully validated, you can retrieve required tokens
if (validated) {
    String accessToken = tokenProvider.getAccessToken().get();
    String refreshToken = tokenProvider.getRefreshToken().get();
    String idToken = tokenProvider.getIdToken().get();
}
```

## Client Credential Token Provider

This token provider is used to retrieve an access token using the client credentials grant type.

### Usage
```java
import com.trimble.id.ClientCredentialsGrantTokenProvider;

ClientCredentialsGrantTokenProvider tokenProvider = new ClientCredentialsGrantTokenProvider(endpointProvider, "clientId", "clientSecret").withScopes(new String[] { "scope" });
String accessToken = tokenProvider.getAccessToken().get();
```

## Validated Claimset Provider

A claimset provider that returns a validated claimset.

### Usage
```java
import com.trimble.id.ValidatedClaimsetProvider;

ValidatedClaimsetProvider claimsetProvider = new ValidatedClaimsetProvider(keysetProvider);
JWTClaimsSet claimset = claimsetProvider.retrieveClaimset(idToken).get();
```
