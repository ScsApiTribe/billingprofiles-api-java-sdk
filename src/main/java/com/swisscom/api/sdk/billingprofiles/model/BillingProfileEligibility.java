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


package com.swisscom.api.sdk.billingprofiles.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * BillingProfileEligibility
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T11:50:22.766+02:00")
public class BillingProfileEligibility   {
  @SerializedName("eligible")
  private Boolean eligible = null;

  @SerializedName("reasonCode")
  private String reasonCode = null;

  @SerializedName("reasonText")
  private String reasonText = null;

  public BillingProfileEligibility eligible(Boolean eligible) {
    this.eligible = eligible;
    return this;
  }

   /**
   * True or False value to represent the eligibility of billing profile.
   * @return eligible
  **/
  @ApiModelProperty(example = "false", required = true, value = "True or False value to represent the eligibility of billing profile.")
  public Boolean getEligible() {
    return eligible;
  }

  public void setEligible(Boolean eligible) {
    this.eligible = eligible;
  }

  public BillingProfileEligibility reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

   /**
   * The code value to represent the reason why eligibility failed.
   * @return reasonCode
  **/
  @ApiModelProperty(example = "CHK-11", value = "The code value to represent the reason why eligibility failed.")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public BillingProfileEligibility reasonText(String reasonText) {
    this.reasonText = reasonText;
    return this;
  }

   /**
   * The text describing why the eligibility failed.
   * @return reasonText
  **/
  @ApiModelProperty(example = "The Billing Profile does not have any active subscription.", value = "The text describing why the eligibility failed.")
  public String getReasonText() {
    return reasonText;
  }

  public void setReasonText(String reasonText) {
    this.reasonText = reasonText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingProfileEligibility billingProfileEligibility = (BillingProfileEligibility) o;
    return Objects.equals(this.eligible, billingProfileEligibility.eligible) &&
        Objects.equals(this.reasonCode, billingProfileEligibility.reasonCode) &&
        Objects.equals(this.reasonText, billingProfileEligibility.reasonText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligible, reasonCode, reasonText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingProfileEligibility {\n");
    
    sb.append("    eligible: ").append(toIndentedString(eligible)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    reasonText: ").append(toIndentedString(reasonText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

