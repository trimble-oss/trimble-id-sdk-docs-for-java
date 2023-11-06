package authentication.sample.clientCredentialGrant;

import java.net.URI;
import java.util.concurrent.ExecutionException;

import com.trimble.id.ClientCredentialsGrantTokenProvider;
import com.trimble.id.OpenIdEndpointProvider;

public class ClientCredentialGrantFlowSample {

    private static ClientCredentialsGrantTokenProvider tokenProvider = null;

    public ClientCredentialGrantFlowSample() {
        
        // Initialize the endpoint provider
        OpenIdEndpointProvider endpointProvider = new OpenIdEndpointProvider(URI.create("<OPENID_CONFIGURATION_URL>"));

        // Client Credentials Grant Token Provider
        tokenProvider = new ClientCredentialsGrantTokenProvider(endpointProvider, "<CLIENT_ID>", "<CLIENT_SECRET>")
                .withScopes(new String[]{"<SCOPE>"});
    }

    // Get the access token
    // If the token is expired, the SDK internally refreshes the token and returns the new access token
    public String getAccessToken() throws ExecutionException, InterruptedException {
        return tokenProvider.getAccessToken().get();
    }
}
