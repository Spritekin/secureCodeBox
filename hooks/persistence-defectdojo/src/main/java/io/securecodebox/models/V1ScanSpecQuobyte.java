/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.18.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.securecodebox.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Quobyte represents a Quobyte mount on the host that shares a pod&#39;s lifetime
 */
@ApiModel(description = "Quobyte represents a Quobyte mount on the host that shares a pod's lifetime")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-18T15:41:43.082Z[Etc/UTC]")
public class V1ScanSpecQuobyte {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_REGISTRY = "registry";
  @SerializedName(SERIALIZED_NAME_REGISTRY)
  private String registry;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private String tenant;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;


  public V1ScanSpecQuobyte group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Group to map volume access to Default is no group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group to map volume access to Default is no group")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public V1ScanSpecQuobyte readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false.")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1ScanSpecQuobyte registry(String registry) {
    
    this.registry = registry;
    return this;
  }

   /**
   * Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes
   * @return registry
  **/
  @ApiModelProperty(required = true, value = "Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes")

  public String getRegistry() {
    return registry;
  }


  public void setRegistry(String registry) {
    this.registry = registry;
  }


  public V1ScanSpecQuobyte tenant(String tenant) {
    
    this.tenant = tenant;
    return this;
  }

   /**
   * Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant owning the given Quobyte volume in the Backend Used with dynamically provisioned Quobyte volumes, value is set by the plugin")

  public String getTenant() {
    return tenant;
  }


  public void setTenant(String tenant) {
    this.tenant = tenant;
  }


  public V1ScanSpecQuobyte user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * User to map volume access to Defaults to serivceaccount user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User to map volume access to Defaults to serivceaccount user")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public V1ScanSpecQuobyte volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Volume is a string that references an already created Quobyte volume by name.
   * @return volume
  **/
  @ApiModelProperty(required = true, value = "Volume is a string that references an already created Quobyte volume by name.")

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScanSpecQuobyte v1ScanSpecQuobyte = (V1ScanSpecQuobyte) o;
    return Objects.equals(this.group, v1ScanSpecQuobyte.group) &&
        Objects.equals(this.readOnly, v1ScanSpecQuobyte.readOnly) &&
        Objects.equals(this.registry, v1ScanSpecQuobyte.registry) &&
        Objects.equals(this.tenant, v1ScanSpecQuobyte.tenant) &&
        Objects.equals(this.user, v1ScanSpecQuobyte.user) &&
        Objects.equals(this.volume, v1ScanSpecQuobyte.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, readOnly, registry, tenant, user, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScanSpecQuobyte {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
