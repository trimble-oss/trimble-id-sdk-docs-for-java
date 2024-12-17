//[trimble-id](../../index.md)/[com.trimble.id](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [AuthenticationConstants](-authentication-constants/index.md) | [JVM]<br>interface [AuthenticationConstants](-authentication-constants/index.md) |
| [AuthorizationCodeGrantTokenProvider](-authorization-code-grant-token-provider/index.md) | [JVM]<br>open class [AuthorizationCodeGrantTokenProvider](-authorization-code-grant-token-provider/index.md) : [ITokenProvider](-i-token-provider/index.md)<br>A token provider based on the OAuth Authorization Code grant type |
| [BearerTokenHttpClientProvider](-bearer-token-http-client-provider/index.md) | [JVM]<br>open class [BearerTokenHttpClientProvider](-bearer-token-http-client-provider/index.md) : [IHttpClientProvider](-i-http-client-provider/index.md)<br>A HttpClient provider for APIs using Bearer token authorization |
| [ClientCredentialsGrantTokenProvider](-client-credentials-grant-token-provider/index.md) | [JVM]<br>open class [ClientCredentialsGrantTokenProvider](-client-credentials-grant-token-provider/index.md) : [ITokenProvider](-i-token-provider/index.md)<br>A token provider based on the OAuth Client Credential grant type |
| [CryptographicHelper](-cryptographic-helper/index.md) | [JVM]<br>open class [CryptographicHelper](-cryptographic-helper/index.md) |
| [FixedEndpointProvider](-fixed-endpoint-provider/index.md) | [JVM]<br>open class [FixedEndpointProvider](-fixed-endpoint-provider/index.md) : [IEndpointProvider](-i-endpoint-provider/index.md)<br>An endpoint provider that returns fixed values |
| [FixedTokenProvider](-fixed-token-provider/index.md) | [JVM]<br>open class [FixedTokenProvider](-fixed-token-provider/index.md) : [ITokenProvider](-i-token-provider/index.md)<br>Represents a token provider that returns a fixed token. |
| [FormData](-form-data/index.md) | [JVM]<br>open class [FormData](-form-data/index.md) : [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html) |
| [HttpClient](-http-client/index.md) | [JVM]<br>open class [HttpClient](-http-client/index.md)<br>HttpClient class to make HTTP requests. |
| [HttpClientConfiguration](-http-client-configuration/index.md) | [JVM]<br>open class [HttpClientConfiguration](-http-client-configuration/index.md)<br>Configuration for the HttpClient. |
| [HttpTokenClient](-http-token-client/index.md) | [JVM]<br>open class [HttpTokenClient](-http-token-client/index.md) : [IHttpTokenClient](-i-http-token-client/index.md) |
| [IClaimsetProvider](-i-claimset-provider/index.md) | [JVM]<br>interface [IClaimsetProvider](-i-claimset-provider/index.md) |
| [IEndpointProvider](-i-endpoint-provider/index.md) | [JVM]<br>interface [IEndpointProvider](-i-endpoint-provider/index.md) |
| [IHttpClientProvider](-i-http-client-provider/index.md) | [JVM]<br>interface [IHttpClientProvider](-i-http-client-provider/index.md) |
| [IHttpTokenClient](-i-http-token-client/index.md) | [JVM]<br>interface [IHttpTokenClient](-i-http-token-client/index.md) |
| [IKeysetProvider](-i-keyset-provider/index.md) | [JVM]<br>interface [IKeysetProvider](-i-keyset-provider/index.md) |
| [ITokenProvider](-i-token-provider/index.md) | [JVM]<br>interface [ITokenProvider](-i-token-provider/index.md) |
| [NameValuePair](-name-value-pair/index.md) | [JVM]<br>open class [NameValuePair](-name-value-pair/index.md) : [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html) |
| [OnBehalfGrantTokenProvider](-on-behalf-grant-token-provider/index.md) | [JVM]<br>open class [OnBehalfGrantTokenProvider](-on-behalf-grant-token-provider/index.md) : [ITokenProvider](-i-token-provider/index.md)<br>A token provider based on the OAuth On Behalf grant type |
| [OpenIdEndpointProvider](-open-id-endpoint-provider/index.md) | [JVM]<br>open class [OpenIdEndpointProvider](-open-id-endpoint-provider/index.md) : [IEndpointProvider](-i-endpoint-provider/index.md)<br>An endpoint provider that returns values from a OpenID well known configuration |
| [OpenIdKeysetProvider](-open-id-keyset-provider/index.md) | [JVM]<br>open class [OpenIdKeysetProvider](-open-id-keyset-provider/index.md) : [IKeysetProvider](-i-keyset-provider/index.md)<br>A keyset provider based on the OAuth well known configuration |
| [OpenIdResponse](-open-id-response/index.md) | [JVM]<br>open class [OpenIdResponse](-open-id-response/index.md) |
| [PropertiesFileReader](-properties-file-reader/index.md) | [JVM]<br>open class [PropertiesFileReader](-properties-file-reader/index.md) |
| [RefreshableTokenProvider](-refreshable-token-provider/index.md) | [JVM]<br>open class [RefreshableTokenProvider](-refreshable-token-provider/index.md) : [ITokenProvider](-i-token-provider/index.md) |
| [RequestPayload](-request-payload/index.md) | [JVM]<br>open class [RequestPayload](-request-payload/index.md) |
| [Response](-response/index.md) | [JVM]<br>open class [Response](-response/index.md)&lt;[T](-response/index.md)&gt;<br>Represents the response from an HTTP request. |
| [SDKClientException](-s-d-k-client-exception/index.md) | [JVM]<br>open class [SDKClientException](-s-d-k-client-exception/index.md) : [CompletionException](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletionException.html) |
| [TCPServiceException](-t-c-p-service-exception/index.md) | [JVM]<br>open class [TCPServiceException](-t-c-p-service-exception/index.md) : [CompletionException](https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletionException.html)<br>TCPException is a custom exception class that extends CompletionException. |
| [TokenRequest](-token-request/index.md) | [JVM]<br>open class [TokenRequest](-token-request/index.md) |
| [TokenResponse](-token-response/index.md) | [JVM]<br>open class [TokenResponse](-token-response/index.md) |
| [ValidatedClaimsetProvider](-validated-claimset-provider/index.md) | [JVM]<br>open class [ValidatedClaimsetProvider](-validated-claimset-provider/index.md) : [IClaimsetProvider](-i-claimset-provider/index.md)<br>A claimset provider that returns a validated claimset |
