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
 * BillingProfilesCollectionInnerLinks
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-25T11:50:22.766+02:00")
public class BillingProfilesCollectionInnerLinks   {
  @SerializedName("rel")
  private String rel = null;

  @SerializedName("href")
  private String href = null;

  public BillingProfilesCollectionInnerLinks rel(String rel) {
    this.rel = rel;
    return this;
  }

   /**
   * The name of the relationship.
   * @return rel
  **/
  @ApiModelProperty(example = "owner", required = true, value = "The name of the relationship.")
  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public BillingProfilesCollectionInnerLinks href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The relation to the customer number belonging to the billing profile.
   * @return href
  **/
  @ApiModelProperty(example = "https://api.swisscom.com/customers/48635876", required = true, value = "The relation to the customer number belonging to the billing profile.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingProfilesCollectionInnerLinks billingProfilesCollectionInnerLinks = (BillingProfilesCollectionInnerLinks) o;
    return Objects.equals(this.rel, billingProfilesCollectionInnerLinks.rel) &&
        Objects.equals(this.href, billingProfilesCollectionInnerLinks.href);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, href);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingProfilesCollectionInnerLinks {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

