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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ServiceReference holds a reference to Service.legacy.k8s.io
 */
@ApiModel(description = "ServiceReference holds a reference to Service.legacy.k8s.io")

public class ApiregistrationV1beta1ServiceReference {
  @SerializedName("name")
  private String name = null;

  @SerializedName("namespace")
  private String namespace = null;

  public ApiregistrationV1beta1ServiceReference name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name is the name of the service
   * @return name
  **/
  @ApiModelProperty(value = "Name is the name of the service")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiregistrationV1beta1ServiceReference namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace is the namespace of the service
   * @return namespace
  **/
  @ApiModelProperty(value = "Namespace is the namespace of the service")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiregistrationV1beta1ServiceReference apiregistrationV1beta1ServiceReference = (ApiregistrationV1beta1ServiceReference) o;
    return Objects.equals(this.name, apiregistrationV1beta1ServiceReference.name) &&
        Objects.equals(this.namespace, apiregistrationV1beta1ServiceReference.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiregistrationV1beta1ServiceReference {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

