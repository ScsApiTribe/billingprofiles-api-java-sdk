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
import com.swisscom.api.sdk.billingprofiles.model.BillingProfilesCollectionInnerLinks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * BillingProfilesCollectionInner
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-28T13:17:01.098+02:00")
public class BillingProfilesCollectionInner   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  /**
   * The preferred language for the billing profile customer.
   */
  public enum LanguageEnum {
    @SerializedName("en")
    EN("en"),
    
    @SerializedName("de")
    DE("de"),
    
    @SerializedName("fr")
    FR("fr"),
    
    @SerializedName("it")
    IT("it");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("language")
  private LanguageEnum language = null;

  @SerializedName("links")
  private List<BillingProfilesCollectionInnerLinks> links = new ArrayList<BillingProfilesCollectionInnerLinks>();

  @SerializedName("addresses")
  private List<String> addresses = new ArrayList<String>();

  public BillingProfilesCollectionInner id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the billing profile
   * @return id
  **/
  @ApiModelProperty(example = "BSC:BAC:4324592", required = true, value = "The unique identifier of the billing profile")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BillingProfilesCollectionInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the billing profile (e.g.: mobile, ip, wireline).
   * @return type
  **/
  @ApiModelProperty(example = "ip", required = true, value = "The type of the billing profile (e.g.: mobile, ip, wireline).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BillingProfilesCollectionInner language(LanguageEnum language) {
    this.language = language;
    return this;
  }

   /**
   * The preferred language for the billing profile customer.
   * @return language
  **/
  @ApiModelProperty(example = "en", value = "The preferred language for the billing profile customer.")
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }

  public BillingProfilesCollectionInner links(List<BillingProfilesCollectionInnerLinks> links) {
    this.links = links;
    return this;
  }

  public BillingProfilesCollectionInner addLinksItem(BillingProfilesCollectionInnerLinks linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<BillingProfilesCollectionInnerLinks> getLinks() {
    return links;
  }

  public void setLinks(List<BillingProfilesCollectionInnerLinks> links) {
    this.links = links;
  }

  public BillingProfilesCollectionInner addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public BillingProfilesCollectionInner addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingProfilesCollectionInner billingProfilesCollectionInner = (BillingProfilesCollectionInner) o;
    return Objects.equals(this.id, billingProfilesCollectionInner.id) &&
        Objects.equals(this.type, billingProfilesCollectionInner.type) &&
        Objects.equals(this.language, billingProfilesCollectionInner.language) &&
        Objects.equals(this.links, billingProfilesCollectionInner.links) &&
        Objects.equals(this.addresses, billingProfilesCollectionInner.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, language, links, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingProfilesCollectionInner {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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
