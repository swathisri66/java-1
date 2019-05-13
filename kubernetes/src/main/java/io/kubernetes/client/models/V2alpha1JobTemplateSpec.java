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
import io.kubernetes.client.models.V1JobSpec;
import io.kubernetes.client.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * JobTemplateSpec describes the data a Job should have when created from a template
 */
@ApiModel(description = "JobTemplateSpec describes the data a Job should have when created from a template")

public class V2alpha1JobTemplateSpec {
  @SerializedName("metadata")
  private V1ObjectMeta metadata = null;

  @SerializedName("spec")
  private V1JobSpec spec = null;

  public V2alpha1JobTemplateSpec metadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Standard object&#39;s metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "Standard object's metadata of the jobs created from this template. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V2alpha1JobTemplateSpec spec(V1JobSpec spec) {
    this.spec = spec;
    return this;
  }

   /**
   * Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
   * @return spec
  **/
  @ApiModelProperty(value = "Specification of the desired behavior of the job. More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status")
  public V1JobSpec getSpec() {
    return spec;
  }

  public void setSpec(V1JobSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2alpha1JobTemplateSpec v2alpha1JobTemplateSpec = (V2alpha1JobTemplateSpec) o;
    return Objects.equals(this.metadata, v2alpha1JobTemplateSpec.metadata) &&
        Objects.equals(this.spec, v2alpha1JobTemplateSpec.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2alpha1JobTemplateSpec {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

