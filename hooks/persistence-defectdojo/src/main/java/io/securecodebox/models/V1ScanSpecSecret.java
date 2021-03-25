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
import io.securecodebox.models.V1ScanSpecConfigMapItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
 */
@ApiModel(description = "Secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-18T15:41:43.082Z[Etc/UTC]")
public class V1ScanSpecSecret {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1ScanSpecConfigMapItems> items = null;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;


  public V1ScanSpecSecret defaultMode(Integer defaultMode) {
    
    this.defaultMode = defaultMode;
    return this;
  }

   /**
   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return defaultMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")

  public Integer getDefaultMode() {
    return defaultMode;
  }


  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }


  public V1ScanSpecSecret items(List<V1ScanSpecConfigMapItems> items) {
    
    this.items = items;
    return this;
  }

  public V1ScanSpecSecret addItemsItem(V1ScanSpecConfigMapItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<V1ScanSpecConfigMapItems>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If unspecified, each key-value pair in the Data field of the referenced Secret will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the Secret, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")

  public List<V1ScanSpecConfigMapItems> getItems() {
    return items;
  }


  public void setItems(List<V1ScanSpecConfigMapItems> items) {
    this.items = items;
  }


  public V1ScanSpecSecret optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Specify whether the Secret or its keys must be defined
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the Secret or its keys must be defined")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  public V1ScanSpecSecret secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * Name of the secret in the pod&#39;s namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
   * @return secretName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the secret in the pod's namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")

  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScanSpecSecret v1ScanSpecSecret = (V1ScanSpecSecret) o;
    return Objects.equals(this.defaultMode, v1ScanSpecSecret.defaultMode) &&
        Objects.equals(this.items, v1ScanSpecSecret.items) &&
        Objects.equals(this.optional, v1ScanSpecSecret.optional) &&
        Objects.equals(this.secretName, v1ScanSpecSecret.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, items, optional, secretName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScanSpecSecret {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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
