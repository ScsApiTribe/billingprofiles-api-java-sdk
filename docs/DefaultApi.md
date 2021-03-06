# DefaultApi

All URIs are relative to *https://api.swisscom.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**gETBillingprofiles**](DefaultApi.md#gETBillingprofiles) | **GET** /billingprofiles | 
[**gETBillingprofilesBillingProfileId**](DefaultApi.md#gETBillingprofilesBillingProfileId) | **GET** /billingprofiles/{billingProfileId} | 
[**gETBillingprofilesBillingProfileIdEligibility**](DefaultApi.md#gETBillingprofilesBillingProfileIdEligibility) | **GET** /billingprofiles/{billingProfileId}/eligibility | 


<a name="gETBillingprofiles"></a>
# **gETBillingprofiles**
> BillingProfilesCollection gETBillingprofiles(bestForPayment, sCSVersion, customerId, sCSRequestID)



#### Search Billing Profiles #### Searches for billing profiles owned by the Swisscom customer identifier provided or contained in access token. At present, only searching for a customer&#39;s best billing profile to be used for payment is supported. 

### Example
```java
// Import classes:
//import com.swisscom.api.sdk.billingprofiles.ApiClient;
//import com.swisscom.api.sdk.billingprofiles.ApiException;
//import com.swisscom.api.sdk.billingprofiles.Configuration;
//import com.swisscom.api.sdk.billingprofiles.auth.*;
//import com.swisscom.api.sdk.billingprofiles.api.DefaultApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bestForPayment** | **Boolean**| Determines whether to return only the identified best billing profile of the provided customer identifier. The best billing profile is always eligible for use with the Payments API and is owned by the customer specified. Currently, only the value \&quot;true\&quot; is supported.  |
 **sCSVersion** | **String**| The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  |
 **customerId** | **BigDecimal**| The Swisscom customer identifier that uniquely identifies a customer. Performing the request with this query parameter returns the list of billing profiles owned by the Swisscom customer identifier provided. It is mandatory when using the client credentials grant.  | [optional]
 **sCSRequestID** | **String**| The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  | [optional]

### Return type

[**BillingProfilesCollection**](BillingProfilesCollection.md)

### Authorization

[oauth_2_0_client_credentials](../README.md#oauth_2_0_client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gETBillingprofilesBillingProfileId"></a>
# **gETBillingprofilesBillingProfileId**
> BillingProfileDetails gETBillingprofilesBillingProfileId(billingProfileId, sCSVersion, sCSRequestID)



#### Returns Billing Profile Information #### Allows to retrieve the details of the billing profile represented by the billing profile identifier provided as parameter. 

### Example
```java
// Import classes:
//import com.swisscom.api.sdk.billingprofiles.ApiClient;
//import com.swisscom.api.sdk.billingprofiles.ApiException;
//import com.swisscom.api.sdk.billingprofiles.Configuration;
//import com.swisscom.api.sdk.billingprofiles.auth.*;
//import com.swisscom.api.sdk.billingprofiles.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0_authorization_code
OAuth oauth_2_0_authorization_code = (OAuth) defaultClient.getAuthentication("oauth_2_0_authorization_code");
oauth_2_0_authorization_code.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth_2_0_client_credentials
OAuth oauth_2_0_client_credentials = (OAuth) defaultClient.getAuthentication("oauth_2_0_client_credentials");
oauth_2_0_client_credentials.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String billingProfileId = "billingProfileId_example"; // String | The unique identifier used to identify a billing profile.  When using access tokens generated with Authorization Code grant, the request parameter must be \"me\" and the billingProfileId is extracted from the access token.  The value of the URI parameter must not contain spaces and should be URL encoded. 
String sCSVersion = "sCSVersion_example"; // String | The version of the API, value must be \"**<<SCS-Version>>**\".  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message. 
String sCSRequestID = "sCSRequestID_example"; // String | The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request. 
try {
    BillingProfileDetails result = apiInstance.gETBillingprofilesBillingProfileId(billingProfileId, sCSVersion, sCSRequestID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETBillingprofilesBillingProfileId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingProfileId** | **String**| The unique identifier used to identify a billing profile.  When using access tokens generated with Authorization Code grant, the request parameter must be \&quot;me\&quot; and the billingProfileId is extracted from the access token.  The value of the URI parameter must not contain spaces and should be URL encoded.  |
 **sCSVersion** | **String**| The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  |
 **sCSRequestID** | **String**| The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  | [optional]

### Return type

[**BillingProfileDetails**](BillingProfileDetails.md)

### Authorization

[oauth_2_0_authorization_code](../README.md#oauth_2_0_authorization_code), [oauth_2_0_client_credentials](../README.md#oauth_2_0_client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gETBillingprofilesBillingProfileIdEligibility"></a>
# **gETBillingprofilesBillingProfileIdEligibility**
> BillingProfileEligibility gETBillingprofilesBillingProfileIdEligibility(billingProfileId, sCSVersion, customerId, sCSRequestID)



#### Returns Billing Profile Eligibility #### This API provides the capability to verify the eligibility of a billing profile.  Before submitting the payment transactions using the Payments API, an API-Consumer can check if a specific billing profile is eligible  for making the payment transactions.  The eligibility is determined by considering various factors. Some of the reasons for the billing profile to be non-eligible are * credit has been reached * has been barred * has no paid invoices * does not have any active subscriptions * is not found in the Swisscom billing systems * is not active  This API additionally provides the capability to execute specific eligibility checks.  If only some certain eligiblity checks shall be executed, then a list of desired eligibility checks has to be provided.   If no specific eligibility checks are provided by the API-consumer, then some default checks are executed, depending to  the specific configuration of each API-Consumer.  

### Example
```java
// Import classes:
//import com.swisscom.api.sdk.billingprofiles.ApiClient;
//import com.swisscom.api.sdk.billingprofiles.ApiException;
//import com.swisscom.api.sdk.billingprofiles.Configuration;
//import com.swisscom.api.sdk.billingprofiles.auth.*;
//import com.swisscom.api.sdk.billingprofiles.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0_authorization_code
OAuth oauth_2_0_authorization_code = (OAuth) defaultClient.getAuthentication("oauth_2_0_authorization_code");
oauth_2_0_authorization_code.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: oauth_2_0_client_credentials
OAuth oauth_2_0_client_credentials = (OAuth) defaultClient.getAuthentication("oauth_2_0_client_credentials");
oauth_2_0_client_credentials.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String billingProfileId = "billingProfileId_example"; // String | The unique identifier used to identify a billing profile.  When using access tokens generated with Authorization Code grant, the request parameter must be \"me\" and the billingProfileId is extracted from the access token.  The value of the URI parameter must not contain spaces and should be URL encoded. 
String sCSVersion = "sCSVersion_example"; // String | The version of the API, value must be \"**<<SCS-Version>>**\".  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message. 
BigDecimal customerId = new BigDecimal(); // BigDecimal | The Swisscom customer identifier that uniquely identifies a customer.   It is only required for certain eligibilty checks and only when using access tokens generated with Client Credentials grant.  Which eligibility checks are executed, are depending to the configuration of each API-Consumer.  When using access tokens generated with Authorization Code grant, the customerId is extracted from the access token. 
String sCSRequestID = "sCSRequestID_example"; // String | The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request. 
try {
    BillingProfileEligibility result = apiInstance.gETBillingprofilesBillingProfileIdEligibility(billingProfileId, sCSVersion, customerId, sCSRequestID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#gETBillingprofilesBillingProfileIdEligibility");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **billingProfileId** | **String**| The unique identifier used to identify a billing profile.  When using access tokens generated with Authorization Code grant, the request parameter must be \&quot;me\&quot; and the billingProfileId is extracted from the access token.  The value of the URI parameter must not contain spaces and should be URL encoded.  |
 **sCSVersion** | **String**| The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  |
 **customerId** | **BigDecimal**| The Swisscom customer identifier that uniquely identifies a customer.   It is only required for certain eligibilty checks and only when using access tokens generated with Client Credentials grant.  Which eligibility checks are executed, are depending to the configuration of each API-Consumer.  When using access tokens generated with Authorization Code grant, the customerId is extracted from the access token.  | [optional]
 **sCSRequestID** | **String**| The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  | [optional]

### Return type

[**BillingProfileEligibility**](BillingProfileEligibility.md)

### Authorization

[oauth_2_0_authorization_code](../README.md#oauth_2_0_authorization_code), [oauth_2_0_client_credentials](../README.md#oauth_2_0_client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

