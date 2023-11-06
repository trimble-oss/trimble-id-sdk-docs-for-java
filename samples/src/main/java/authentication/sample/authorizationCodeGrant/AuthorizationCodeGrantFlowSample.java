package authentication.sample.authorizationCodeGrant;

import java.io.IOException;
import java.net.URI;
import java.text.ParseException;
import java.util.concurrent.ExecutionException;

import com.nimbusds.jwt.JWTClaimsSet;
import com.trimble.id.AuthorizationCodeGrantTokenProvider;
import com.trimble.id.OpenIdEndpointProvider;
import com.trimble.id.OpenIdKeysetProvider;
import com.trimble.id.ValidatedClaimsetProvider;

public class AuthorizationCodeGrantFlowSample {

    private static OpenIdEndpointProvider endpointProvider = null;
    private static AuthorizationCodeGrantTokenProvider tokenProvider = null;

    public AuthorizationCodeGrantFlowSample() {

        // Initialize the endpoint provider
        endpointProvider = new OpenIdEndpointProvider(URI.create("<OPENID_CONFIGURATION_URL>"));

        // Authorization Code Grant Token Provider without PKCE (Client secret is required)
        tokenProvider = new AuthorizationCodeGrantTokenProvider(endpointProvider, "<CLIENT_ID>", URI.create("<REDIRECT_URI>"))
                .withClientSecret("<CLIENT_SECRET>")
                .withScopes(new String[]{"<SCOPE>"})
                .withLogoutRedirect(URI.create("<LOGOUT_REDIRECT_URI>"));
    }

    // Launch browser with the authorization URI to login
    public URI getAuthorizationUri() throws InterruptedException, ExecutionException {
        return tokenProvider.createAuthorizationUri().get();
    }

    // Check if the login was successful
    public boolean isAuthorizationSuccessful(String queryString) throws ExecutionException, InterruptedException {
        return tokenProvider.isAuthorizationSuccessful(queryString).get();
    }

    // Get the access token
    // If the token is expired, the SDK internally refreshes the token and returns the new access token
    public String getAccessToken() throws ExecutionException, InterruptedException {
        return tokenProvider.getAccessToken().get();
    }

    // Get the refresh token
    public String getRefreshToken() throws ExecutionException, InterruptedException {
        return tokenProvider.getRefreshToken().get();
    }

    // Get the id token
    public String getIdToken() throws ExecutionException, InterruptedException {
        return tokenProvider.getIdToken().get();
    }

    // Launch browser with the logout URI to logout
    public URI getLogoutUri() throws ExecutionException, InterruptedException, IOException {
        return tokenProvider.createLogoutUri().get();
    }

    // Used to retrieve claimset which can be used to get logged in user's information
    public JWTClaimsSet getClaimset() throws ExecutionException, InterruptedException, ParseException {
        OpenIdKeysetProvider keysetProvider = new OpenIdKeysetProvider(endpointProvider);
        ValidatedClaimsetProvider claimsetProvider = new ValidatedClaimsetProvider(keysetProvider);
        return claimsetProvider.retrieveClaimset(tokenProvider.getIdToken().get()).get();
    }

    // Get the logged in user's email
    public String getUserEmail() throws ExecutionException, InterruptedException, ParseException {
        JWTClaimsSet claimset = getClaimset();
        return claimset.getStringClaim("email");
    }
}
