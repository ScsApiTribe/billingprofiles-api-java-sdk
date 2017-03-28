/**
 * Billing Profiles
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.swisscom.api.sdk.billingprofiles.api;

import com.swisscom.api.sdk.billingprofiles.ApiCallback;
import com.swisscom.api.sdk.billingprofiles.ApiClient;
import com.swisscom.api.sdk.billingprofiles.ApiException;
import com.swisscom.api.sdk.billingprofiles.ApiResponse;
import com.swisscom.api.sdk.billingprofiles.Configuration;
import com.swisscom.api.sdk.billingprofiles.Pair;
import com.swisscom.api.sdk.billingprofiles.ProgressRequestBody;
import com.swisscom.api.sdk.billingprofiles.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import com.swisscom.api.sdk.billingprofiles.model.BillingProfilesCollection;
import java.math.BigDecimal;
import com.swisscom.api.sdk.billingprofiles.model.Error;
import com.swisscom.api.sdk.billingprofiles.model.BillingProfileDetails;
import com.swisscom.api.sdk.billingprofiles.model.BillingProfileEligibility;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for gETBillingprofiles */
    private com.squareup.okhttp.Call gETBillingprofilesCall(Boolean bestForPayment, String sCSVersion, BigDecimal customerId, String sCSRequestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'bestForPayment' is set
        if (bestForPayment == null) {
            throw new ApiException("Missing the required parameter 'bestForPayment' when calling gETBillingprofiles(Async)");
        }
        
        // verify the required parameter 'sCSVersion' is set
        if (sCSVersion == null) {
            throw new ApiException("Missing the required parameter 'sCSVersion' when calling gETBillingprofiles(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/billingprofiles".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (customerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "customerId", customerId));
        if (bestForPayment != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "bestForPayment", bestForPayment));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (sCSRequestID != null)
        localVarHeaderParams.put("SCS-Request-ID", apiClient.parameterToString(sCSRequestID));
        if (sCSVersion != null)
        localVarHeaderParams.put("SCS-Version", apiClient.parameterToString(sCSVersion));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_2_0_client_credentials" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * #### Search Billing Profiles #### Searches for billing profiles owned by the Swisscom customer identifier provided or contained in access token. At present, only searching for a customer&#39;s best billing profile to be used for payment is supported. 
     * @param bestForPayment Determines whether to return only the identified best billing profile of the provided customer identifier. The best billing profile is always eligible for use with the Payments API and is owned by the customer specified. Currently, only the value \&quot;true\&quot; is supported.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param customerId The Swisscom customer identifier that uniquely identifies a customer. Performing the request with this query parameter returns the list of billing profiles owned by the Swisscom customer identifier provided. It is mandatory when using the client credentials grant.  (optional)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return BillingProfilesCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BillingProfilesCollection gETBillingprofiles(Boolean bestForPayment, String sCSVersion, BigDecimal customerId, String sCSRequestID) throws ApiException {
        ApiResponse<BillingProfilesCollection> resp = gETBillingprofilesWithHttpInfo(bestForPayment, sCSVersion, customerId, sCSRequestID);
        return resp.getData();
    }

    /**
     * 
     * #### Search Billing Profiles #### Searches for billing profiles owned by the Swisscom customer identifier provided or contained in access token. At present, only searching for a customer&#39;s best billing profile to be used for payment is supported. 
     * @param bestForPayment Determines whether to return only the identified best billing profile of the provided customer identifier. The best billing profile is always eligible for use with the Payments API and is owned by the customer specified. Currently, only the value \&quot;true\&quot; is supported.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param customerId The Swisscom customer identifier that uniquely identifies a customer. Performing the request with this query parameter returns the list of billing profiles owned by the Swisscom customer identifier provided. It is mandatory when using the client credentials grant.  (optional)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return ApiResponse&lt;BillingProfilesCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BillingProfilesCollection> gETBillingprofilesWithHttpInfo(Boolean bestForPayment, String sCSVersion, BigDecimal customerId, String sCSRequestID) throws ApiException {
        com.squareup.okhttp.Call call = gETBillingprofilesCall(bestForPayment, sCSVersion, customerId, sCSRequestID, null, null);
        Type localVarReturnType = new TypeToken<BillingProfilesCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * #### Search Billing Profiles #### Searches for billing profiles owned by the Swisscom customer identifier provided or contained in access token. At present, only searching for a customer&#39;s best billing profile to be used for payment is supported. 
     * @param bestForPayment Determines whether to return only the identified best billing profile of the provided customer identifier. The best billing profile is always eligible for use with the Payments API and is owned by the customer specified. Currently, only the value \&quot;true\&quot; is supported.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param customerId The Swisscom customer identifier that uniquely identifies a customer. Performing the request with this query parameter returns the list of billing profiles owned by the Swisscom customer identifier provided. It is mandatory when using the client credentials grant.  (optional)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call gETBillingprofilesAsync(Boolean bestForPayment, String sCSVersion, BigDecimal customerId, String sCSRequestID, final ApiCallback<BillingProfilesCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = gETBillingprofilesCall(bestForPayment, sCSVersion, customerId, sCSRequestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BillingProfilesCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for gETBillingprofilesBillingProfileId */
    private com.squareup.okhttp.Call gETBillingprofilesBillingProfileIdCall(String billingProfileId, String sCSVersion, String sCSRequestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'billingProfileId' is set
        if (billingProfileId == null) {
            throw new ApiException("Missing the required parameter 'billingProfileId' when calling gETBillingprofilesBillingProfileId(Async)");
        }
        
        // verify the required parameter 'sCSVersion' is set
        if (sCSVersion == null) {
            throw new ApiException("Missing the required parameter 'sCSVersion' when calling gETBillingprofilesBillingProfileId(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/billingprofiles/{billingProfileId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "billingProfileId" + "\\}", apiClient.escapeString(billingProfileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (sCSRequestID != null)
        localVarHeaderParams.put("SCS-Request-ID", apiClient.parameterToString(sCSRequestID));
        if (sCSVersion != null)
        localVarHeaderParams.put("SCS-Version", apiClient.parameterToString(sCSVersion));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_2_0_client_credentials", "oauth_2_0_authorization_code" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * #### Returns Billing Profile Information #### Allows to retrieve the details of the billing profile represented by the billing profile identifier provided as parameter. 
     * @param billingProfileId The unique identifier used to identify a billing profile.  When using access tokens generated with Authorization Code grant, the request parameter must be \&quot;me\&quot; and the billingProfileId is extracted from the access token.  The value of the URI parameter must not contain spaces and should be URL encoded.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return BillingProfileDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BillingProfileDetails gETBillingprofilesBillingProfileId(String billingProfileId, String sCSVersion, String sCSRequestID) throws ApiException {
        ApiResponse<BillingProfileDetails> resp = gETBillingprofilesBillingProfileIdWithHttpInfo(billingProfileId, sCSVersion, sCSRequestID);
        return resp.getData();
    }

    /**
     * 
     * #### Returns Billing Profile Information #### Allows to retrieve the details of the billing profile represented by the billing profile identifier provided as parameter. 
     * @param billingProfileId The unique identifier used to identify a billing profile.  When using access tokens generated with Authorization Code grant, the request parameter must be \&quot;me\&quot; and the billingProfileId is extracted from the access token.  The value of the URI parameter must not contain spaces and should be URL encoded.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return ApiResponse&lt;BillingProfileDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BillingProfileDetails> gETBillingprofilesBillingProfileIdWithHttpInfo(String billingProfileId, String sCSVersion, String sCSRequestID) throws ApiException {
        com.squareup.okhttp.Call call = gETBillingprofilesBillingProfileIdCall(billingProfileId, sCSVersion, sCSRequestID, null, null);
        Type localVarReturnType = new TypeToken<BillingProfileDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * #### Returns Billing Profile Information #### Allows to retrieve the details of the billing profile represented by the billing profile identifier provided as parameter. 
     * @param billingProfileId The unique identifier used to identify a billing profile.  When using access tokens generated with Authorization Code grant, the request parameter must be \&quot;me\&quot; and the billingProfileId is extracted from the access token.  The value of the URI parameter must not contain spaces and should be URL encoded.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call gETBillingprofilesBillingProfileIdAsync(String billingProfileId, String sCSVersion, String sCSRequestID, final ApiCallback<BillingProfileDetails> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = gETBillingprofilesBillingProfileIdCall(billingProfileId, sCSVersion, sCSRequestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BillingProfileDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for gETBillingprofilesBillingProfileIdEligibility */
    private com.squareup.okhttp.Call gETBillingprofilesBillingProfileIdEligibilityCall(String billingProfileId, String sCSVersion, BigDecimal customerId, String sCSRequestID, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'billingProfileId' is set
        if (billingProfileId == null) {
            throw new ApiException("Missing the required parameter 'billingProfileId' when calling gETBillingprofilesBillingProfileIdEligibility(Async)");
        }
        
        // verify the required parameter 'sCSVersion' is set
        if (sCSVersion == null) {
            throw new ApiException("Missing the required parameter 'sCSVersion' when calling gETBillingprofilesBillingProfileIdEligibility(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/billingprofiles/{billingProfileId}/eligibility".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "billingProfileId" + "\\}", apiClient.escapeString(billingProfileId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (customerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "customerId", customerId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (sCSRequestID != null)
        localVarHeaderParams.put("SCS-Request-ID", apiClient.parameterToString(sCSRequestID));
        if (sCSVersion != null)
        localVarHeaderParams.put("SCS-Version", apiClient.parameterToString(sCSVersion));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth_2_0_client_credentials", "oauth_2_0_authorization_code" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * #### Returns Billing Profile Eligibility #### This API provides the capability to verify the eligibility of a billing profile.  Before submitting the payment transactions using the Payments API, an API-Consumer can check if a specific billing profile is eligible  for making the payment transactions.  The eligibility is determined by considering various factors. Some of the reasons for the billing profile to be non-eligible are * credit has been reached * has been barred * has no paid invoices * does not have any active subscriptions * is not found in the Swisscom billing systems * is not active  This API additionally provides the capability to execute specific eligibility checks.  If only some certain eligiblity checks shall be executed, then a list of desired eligibility checks has to be provided.   If no specific eligibility checks are provided by the API-consumer, then some default checks are executed, depending to  the specific configuration of each API-Consumer.  
     * @param billingProfileId The unique identifier used to identify a billing profile.  When using access tokens generated with Authorization Code grant, the request parameter must be \&quot;me\&quot; and the billingProfileId is extracted from the access token.  The value of the URI parameter must not contain spaces and should be URL encoded.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param customerId The Swisscom customer identifier that uniquely identifies a customer.   It is only required for certain eligibilty checks and only when using access tokens generated with Client Credentials grant.  Which eligibility checks are executed, are depending to the configuration of each API-Consumer.  When using access tokens generated with Authorization Code grant, the customerId is extracted from the access token.  (optional)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return BillingProfileEligibility
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BillingProfileEligibility gETBillingprofilesBillingProfileIdEligibility(String billingProfileId, String sCSVersion, BigDecimal customerId, String sCSRequestID) throws ApiException {
        ApiResponse<BillingProfileEligibility> resp = gETBillingprofilesBillingProfileIdEligibilityWithHttpInfo(billingProfileId, sCSVersion, customerId, sCSRequestID);
        return resp.getData();
    }

    /**
     * 
     * #### Returns Billing Profile Eligibility #### This API provides the capability to verify the eligibility of a billing profile.  Before submitting the payment transactions using the Payments API, an API-Consumer can check if a specific billing profile is eligible  for making the payment transactions.  The eligibility is determined by considering various factors. Some of the reasons for the billing profile to be non-eligible are * credit has been reached * has been barred * has no paid invoices * does not have any active subscriptions * is not found in the Swisscom billing systems * is not active  This API additionally provides the capability to execute specific eligibility checks.  If only some certain eligiblity checks shall be executed, then a list of desired eligibility checks has to be provided.   If no specific eligibility checks are provided by the API-consumer, then some default checks are executed, depending to  the specific configuration of each API-Consumer.  
     * @param billingProfileId The unique identifier used to identify a billing profile.  When using access tokens generated with Authorization Code grant, the request parameter must be \&quot;me\&quot; and the billingProfileId is extracted from the access token.  The value of the URI parameter must not contain spaces and should be URL encoded.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param customerId The Swisscom customer identifier that uniquely identifies a customer.   It is only required for certain eligibilty checks and only when using access tokens generated with Client Credentials grant.  Which eligibility checks are executed, are depending to the configuration of each API-Consumer.  When using access tokens generated with Authorization Code grant, the customerId is extracted from the access token.  (optional)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @return ApiResponse&lt;BillingProfileEligibility&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BillingProfileEligibility> gETBillingprofilesBillingProfileIdEligibilityWithHttpInfo(String billingProfileId, String sCSVersion, BigDecimal customerId, String sCSRequestID) throws ApiException {
        com.squareup.okhttp.Call call = gETBillingprofilesBillingProfileIdEligibilityCall(billingProfileId, sCSVersion, customerId, sCSRequestID, null, null);
        Type localVarReturnType = new TypeToken<BillingProfileEligibility>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * #### Returns Billing Profile Eligibility #### This API provides the capability to verify the eligibility of a billing profile.  Before submitting the payment transactions using the Payments API, an API-Consumer can check if a specific billing profile is eligible  for making the payment transactions.  The eligibility is determined by considering various factors. Some of the reasons for the billing profile to be non-eligible are * credit has been reached * has been barred * has no paid invoices * does not have any active subscriptions * is not found in the Swisscom billing systems * is not active  This API additionally provides the capability to execute specific eligibility checks.  If only some certain eligiblity checks shall be executed, then a list of desired eligibility checks has to be provided.   If no specific eligibility checks are provided by the API-consumer, then some default checks are executed, depending to  the specific configuration of each API-Consumer.  
     * @param billingProfileId The unique identifier used to identify a billing profile.  When using access tokens generated with Authorization Code grant, the request parameter must be \&quot;me\&quot; and the billingProfileId is extracted from the access token.  The value of the URI parameter must not contain spaces and should be URL encoded.  (required)
     * @param sCSVersion The version of the API, value must be \&quot;**&lt;&lt;SCS-Version&gt;&gt;**\&quot;.  This header indicates which version of the API should serve the request. If the value of the header is missing or it indicates a wrong version, the API returns an error message.  (required)
     * @param customerId The Swisscom customer identifier that uniquely identifies a customer.   It is only required for certain eligibilty checks and only when using access tokens generated with Client Credentials grant.  Which eligibility checks are executed, are depending to the configuration of each API-Consumer.  When using access tokens generated with Authorization Code grant, the customerId is extracted from the access token.  (optional)
     * @param sCSRequestID The request ID.  It is used by the API to trace the fulfillment of a request. The API user may provide its own request ID or can accept the request ID generated by the API. In both cases the request ID is returned in the header of the response.  This ID should be refered by the API users in their communication with Swisscom whenever requesting details about the execution of a request.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call gETBillingprofilesBillingProfileIdEligibilityAsync(String billingProfileId, String sCSVersion, BigDecimal customerId, String sCSRequestID, final ApiCallback<BillingProfileEligibility> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = gETBillingprofilesBillingProfileIdEligibilityCall(billingProfileId, sCSVersion, customerId, sCSRequestID, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BillingProfileEligibility>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
