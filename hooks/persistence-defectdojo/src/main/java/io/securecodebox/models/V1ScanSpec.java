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
import io.securecodebox.models.V1ScanSpecCascades;
import io.securecodebox.models.V1ScanSpecEnv;
import io.securecodebox.models.V1ScanSpecVolumeMounts;
import io.securecodebox.models.V1ScanSpecVolumes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ScanSpec defines the desired state of Scan
 */
@ApiModel(description = "ScanSpec defines the desired state of Scan")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-18T15:41:43.082Z[Etc/UTC]")
public class V1ScanSpec {
  public static final String SERIALIZED_NAME_CASCADES = "cascades";
  @SerializedName(SERIALIZED_NAME_CASCADES)
  private V1ScanSpecCascades cascades;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1ScanSpecEnv> env = null;

  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<String> parameters = null;

  public static final String SERIALIZED_NAME_SCAN_TYPE = "scanType";
  @SerializedName(SERIALIZED_NAME_SCAN_TYPE)
  private String scanType;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1ScanSpecVolumeMounts> volumeMounts = null;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<V1ScanSpecVolumes> volumes = null;


  public V1ScanSpec cascades(V1ScanSpecCascades cascades) {
    
    this.cascades = cascades;
    return this;
  }

   /**
   * Get cascades
   * @return cascades
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ScanSpecCascades getCascades() {
    return cascades;
  }


  public void setCascades(V1ScanSpecCascades cascades) {
    this.cascades = cascades;
  }


  public V1ScanSpec env(List<V1ScanSpecEnv> env) {
    
    this.env = env;
    return this;
  }

  public V1ScanSpec addEnvItem(V1ScanSpecEnv envItem) {
    if (this.env == null) {
      this.env = new ArrayList<V1ScanSpecEnv>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Env allows to specify environment vars for the scanner container. These will be merged will the env vars specified for the first container of the pod defined in the ScanType
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Env allows to specify environment vars for the scanner container. These will be merged will the env vars specified for the first container of the pod defined in the ScanType")

  public List<V1ScanSpecEnv> getEnv() {
    return env;
  }


  public void setEnv(List<V1ScanSpecEnv> env) {
    this.env = env;
  }


  public V1ScanSpec parameters(List<String> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public V1ScanSpec addParametersItem(String parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<String>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * All CLI parameters to configure the scan container.
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All CLI parameters to configure the scan container.")

  public List<String> getParameters() {
    return parameters;
  }


  public void setParameters(List<String> parameters) {
    this.parameters = parameters;
  }


  public V1ScanSpec scanType(String scanType) {
    
    this.scanType = scanType;
    return this;
  }

   /**
   * The name of the scanType which should be started.
   * @return scanType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the scanType which should be started.")

  public String getScanType() {
    return scanType;
  }


  public void setScanType(String scanType) {
    this.scanType = scanType;
  }


  public V1ScanSpec volumeMounts(List<V1ScanSpecVolumeMounts> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1ScanSpec addVolumeMountsItem(V1ScanSpecVolumeMounts volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<V1ScanSpecVolumeMounts>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * VolumeMounts allows to specify volume mounts for the scan container.
   * @return volumeMounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VolumeMounts allows to specify volume mounts for the scan container.")

  public List<V1ScanSpecVolumeMounts> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1ScanSpecVolumeMounts> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  public V1ScanSpec volumes(List<V1ScanSpecVolumes> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public V1ScanSpec addVolumesItem(V1ScanSpecVolumes volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<V1ScanSpecVolumes>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Volumes allows to specify volumes for the scan container.
   * @return volumes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volumes allows to specify volumes for the scan container.")

  public List<V1ScanSpecVolumes> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<V1ScanSpecVolumes> volumes) {
    this.volumes = volumes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScanSpec v1ScanSpec = (V1ScanSpec) o;
    return Objects.equals(this.cascades, v1ScanSpec.cascades) &&
        Objects.equals(this.env, v1ScanSpec.env) &&
        Objects.equals(this.parameters, v1ScanSpec.parameters) &&
        Objects.equals(this.scanType, v1ScanSpec.scanType) &&
        Objects.equals(this.volumeMounts, v1ScanSpec.volumeMounts) &&
        Objects.equals(this.volumes, v1ScanSpec.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascades, env, parameters, scanType, volumeMounts, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScanSpec {\n");
    sb.append("    cascades: ").append(toIndentedString(cascades)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
