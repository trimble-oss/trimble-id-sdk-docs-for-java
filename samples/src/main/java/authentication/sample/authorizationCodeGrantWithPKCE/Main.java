package authentication.sample.authorizationCodeGrantWithPKCE;

import java.net.URI;
import java.util.concurrent.ExecutionException;

public class Main {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Create an instance of AuthorizationCodeGrantFlowWithPKCESample
        AuthorizationCodeGrantFlowWithPKCESample authCodeFlow = new AuthorizationCodeGrantFlowWithPKCESample();
        
        // Launch browser with the authorization URI and login
        URI authorizationUri = authCodeFlow.getAuthorizationUri();

        // Use the method isAuthorizationSuccessful() to check if the login was successful
        // If login was successful, tokens can be retrieved using the methods getAccessToken(), getRefreshToken() and getIdToken()
    }
}
