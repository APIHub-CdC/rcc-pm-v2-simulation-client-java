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
 * RespuestaRCCV2CalificacionCartera
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-10T17:56:34.445680493Z[GMT]")

public class RespuestaRCCV2CalificacionCartera {
  @SerializedName("calificacion")
  private String calificacion = null;

  @SerializedName("nombreOtorgante")
  private String nombreOtorgante = null;

  public RespuestaRCCV2CalificacionCartera calificacion(String calificacion) {
    this.calificacion = calificacion;
    return this;
  }

   /**
   * Get calificacion
   * @return calificacion
  **/
  @ApiModelProperty()
  public String getCalificacion() {
    return calificacion;
  }

  public void setCalificacion(String calificacion) {
    this.calificacion = calificacion;
  }

  public RespuestaRCCV2CalificacionCartera nombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
    return this;
  }

   /**
   * Nombre del otorgante que envían la calificacio.
   * @return nombreOtorgante
  **/
  @ApiModelProperty(example = "BANCO")
  public String getNombreOtorgante() {
    return nombreOtorgante;
  }

  public void setNombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RespuestaRCCV2CalificacionCartera respuestaRCCV2CalificacionCartera = (RespuestaRCCV2CalificacionCartera) o;
    return Objects.equals(this.calificacion, respuestaRCCV2CalificacionCartera.calificacion) &&
        Objects.equals(this.nombreOtorgante, respuestaRCCV2CalificacionCartera.nombreOtorgante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calificacion, nombreOtorgante);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespuestaRCCV2CalificacionCartera {\n");
    
    sb.append("    calificacion: ").append(toIndentedString(calificacion)).append("\n");
    sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
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
