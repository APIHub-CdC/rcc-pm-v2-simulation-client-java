/*
 * Reporte de Crédito Consolidado Personas Morales
 * <p>PI Reporte de Crédito Consolidado de Personas Morales. <br/><br><img src='https://developer.circulodecredito.com.mx/sites/default/files/2024-01/Logo-Swaggers.png' height='70' width='270'/></p><br/>
 *
 * OpenAPI spec version: 1.0.0
 * Contact: api@circulodecredito.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * RequestRCCV2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-10T17:56:34.445680493Z[GMT]")

public class RequestRCCV2 {
  @SerializedName("folioOtorgante")
  private String folioOtorgante = null;

  @SerializedName("persona")
  private Persona persona = null;

  public RequestRCCV2 folioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
    return this;
  }

   /**
   * Get folioOtorgante
   * @return folioOtorgante
  **/
  @ApiModelProperty(example = "CC87989-123", required = true)
  public String getFolioOtorgante() {
    return folioOtorgante;
  }

  public void setFolioOtorgante(String folioOtorgante) {
    this.folioOtorgante = folioOtorgante;
  }

  public RequestRCCV2 persona(Persona persona) {
    this.persona = persona;
    return this;
  }

   /**
   * Get persona
   * @return persona
  **/
  @ApiModelProperty(required = true)
  public Persona getPersona() {
    return persona;
  }

  public void setPersona(Persona persona) {
    this.persona = persona;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestRCCV2 requestRCCV2 = (RequestRCCV2) o;
    return Objects.equals(this.folioOtorgante, requestRCCV2.folioOtorgante) &&
        Objects.equals(this.persona, requestRCCV2.persona);
  }

  @Override
  public int hashCode() {
    return Objects.hash(folioOtorgante, persona);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestRCCV2 {\n");
    
    sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
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
