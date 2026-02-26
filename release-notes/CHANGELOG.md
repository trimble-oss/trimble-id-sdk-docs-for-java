# 1.1.0 (2026-02-26)

Added Proxy Authentication Support:

- Introduced proxy-based authentication support for client token generation in restricted/enterprise network environments

# 1.0.3 (2025-03-04)
- Improved exception handling and HTTP client

# 1.0.2 (2024-12-16)

- Refactored BearerTokenHttpClientProvider:
    - The BearerTokenHttpClientProvider class has been refactored to improve the handling of bearer tokens for HTTP client requests.

- Added Response Class:
    - A new Response class has been introduced to provide a more structured and consistent way to manage API responses, including status codes, headers, and response times.

# 1.0.1 (2023-12-12)

Security vulnerability fixes

# 1.0.0 (2023-11-06)

Initial stable version of trimble-id client library

- It is client library for OAuth2.0 related protocol operations. It provides:
    - Discovery of endpoints
    - Supported Grant Types Token Providers
    - Automatic Token Refresh
    - Token Validation
    - HTTP Client Handler to access a given API with the access token
