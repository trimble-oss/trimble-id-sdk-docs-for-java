package authentication.sample.clientCredentialGrant;

import java.util.concurrent.ExecutionException;

public class Main {
    
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // Create an instance of ClientCredentialGrantFlowSample
        ClientCredentialGrantFlowSample clientCredentialFlow = new ClientCredentialGrantFlowSample();
        
        // Get the access token
        String accessToken = clientCredentialFlow.getAccessToken();
    }
}
