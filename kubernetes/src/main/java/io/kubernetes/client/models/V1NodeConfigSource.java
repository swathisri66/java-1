/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.14.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.models.V1ConfigMapNodeConfigSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil.
 */
@ApiModel(description = "NodeConfigSource specifies a source of node configuration. Exactly one subfield (excluding metadata) must be non-nil.")

public class V1NodeConfigSource {
  @SerializedName("configMap")
  private V1ConfigMapNodeConfigSource configMap = null;

  public V1NodeConfigSource configMap(V1ConfigMapNodeConfigSource configMap) {
    this.configMap = configMap;
    return this;
  }

   /**
   * ConfigMap is a reference to a Node&#39;s ConfigMap
   * @return configMap
  **/
  @ApiModelProperty(value = "ConfigMap is a reference to a Node's ConfigMap")
  public V1ConfigMapNodeConfigSource getConfigMap() {
    return configMap;
  }

  public void setConfigMap(V1ConfigMapNodeConfigSource configMap) {
    this.configMap = configMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeConfigSource v1NodeConfigSource = (V1NodeConfigSource) o;
    return Objects.equals(this.configMap, v1NodeConfigSource.configMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeConfigSource {\n");
    
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
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

