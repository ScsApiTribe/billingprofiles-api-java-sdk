# billingprofilesapi

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.swisscom.api.sdk.billingprofiles</groupId>
    <artifactId>billingprofilesapi</artifactId>
    <version>1.0.21</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.swisscom.api.sdk.billingprofiles:billingprofilesapi:1.0.21"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/billingprofilesapi-1.0.21.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.swisscom.api.sdk.billingprofiles.*;
import com.swisscom.api.sdk.billingprofiles.auth.*;
import com.swisscom.api.sdk.billingprofiles.model.*;
import com.swisscom.api.sdk.billingprofiles.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oauth_2_0_client_credentials
        OAuth oauth_2_0_client_credentials = (OAuth) defaultClient.getAuthentication("oauth_2_0_client_credentials");
        oauth_2_0_client_credentials.setAccessToken("YOUR ACCESS TOKEN");

        DefaultApi apiInstance = new DefaultApi();
        Boolean bestForPayment = true; // Boolean | Determines whether to return only the identified best billing profile of the provided customer identifier. The best billing profile is always eligible for use with the Payments API and is owned by the customer specified. Currently, only the value \"true\" is supported. 
        String sCSVersion = "sCSVersion_example"; // String | The version of the API, value must be \"**<<SCS-Version>>**\".  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message. 
        BigDecimal customerId = new BigDecimal(); // BigDecimal | The Swisscom customer identifier that uniquely identifies a customer. Performing the request with this query parameter returns the list of billing profiles owned by the Swisscom customer identifier provided. It is mandatory when using the client credentials grant. 
        String sCSRequestID = "sCSRequestID_example"; // String | The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request. 
        try {
            BillingProfilesCollection result = apiInstance.gETBillingprofiles(bestForPayment, sCSVersion, customerId, sCSRequestID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#gETBillingprofiles");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.swisscom.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**gETBillingprofiles**](docs/DefaultApi.md#gETBillingprofiles) | **GET** /billingprofiles | 
*DefaultApi* | [**gETBillingprofilesBillingProfileId**](docs/DefaultApi.md#gETBillingprofilesBillingProfileId) | **GET** /billingprofiles/{billingProfileId} | 
*DefaultApi* | [**gETBillingprofilesBillingProfileIdEligibility**](docs/DefaultApi.md#gETBillingprofilesBillingProfileIdEligibility) | **GET** /billingprofiles/{billingProfileId}/eligibility | 


## Documentation for Models

 - [BillingProfileDetails](docs/BillingProfileDetails.md)
 - [BillingProfileEligibility](docs/BillingProfileEligibility.md)
 - [BillingProfilesCollection](docs/BillingProfilesCollection.md)
 - [BillingProfilesCollectionInner](docs/BillingProfilesCollectionInner.md)
 - [BillingProfilesCollectionInnerLinks](docs/BillingProfilesCollectionInnerLinks.md)
 - [CustomerAddress](docs/CustomerAddress.md)
 - [CustomerAddressInner](docs/CustomerAddressInner.md)
 - [Error](docs/Error.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth_2_0_authorization_code

- **Type**: OAuth
- **Flow**: accessCode
- **Authorizatoin URL**: https://consent.swisscom.com/c/oauth2/auth
- **Scopes**: 
  - read-payment: Allows reading payments.
  - write-payment: Allows writing payments.
  - cbt: Allows placing charges on a Swisscom bill.
  - read-billingprofile-details: Allows reading billing profiles details.
  - read-billingprofile-eligibility: Allows checking whether a billing profile is eligible for payment.

### oauth_2_0_client_credentials

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



