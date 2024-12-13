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
 * ConsultasInstitucionalesRCE
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-10T17:56:34.445680493Z[GMT]")

public class ConsultasInstitucionalesRCE {
  @SerializedName("consultas")
  private ConsultasRCE consultas = null;

  @SerializedName("financieras")
  private Financieras financieras = null;

  @SerializedName("comerciales")
  private Comerciales comerciales = null;

  public ConsultasInstitucionalesRCE consultas(ConsultasRCE consultas) {
    this.consultas = consultas;
    return this;
  }

   /**
   * Get consultas
   * @return consultas
  **/
  @ApiModelProperty()
  public ConsultasRCE getConsultas() {
    return consultas;
  }

  public void setConsultas(ConsultasRCE consultas) {
    this.consultas = consultas;
  }

  public ConsultasInstitucionalesRCE financieras(Financieras financieras) {
    this.financieras = financieras;
    return this;
  }

   /**
   * Get financieras
   * @return financieras
  **/
  @ApiModelProperty()
  public Financieras getFinancieras() {
    return financieras;
  }

  public void setFinancieras(Financieras financieras) {
    this.financieras = financieras;
  }

  public ConsultasInstitucionalesRCE comerciales(Comerciales comerciales) {
    this.comerciales = comerciales;
    return this;
  }

   /**
   * Get comerciales
   * @return comerciales
  **/
  @ApiModelProperty()
  public Comerciales getComerciales() {
    return comerciales;
  }

  public void setComerciales(Comerciales comerciales) {
    this.comerciales = comerciales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultasInstitucionalesRCE consultasInstitucionalesRCE = (ConsultasInstitucionalesRCE) o;
    return Objects.equals(this.consultas, consultasInstitucionalesRCE.consultas) &&
        Objects.equals(this.financieras, consultasInstitucionalesRCE.financieras) &&
        Objects.equals(this.comerciales, consultasInstitucionalesRCE.comerciales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultas, financieras, comerciales);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultasInstitucionalesRCE {\n");
    
    sb.append("    consultas: ").append(toIndentedString(consultas)).append("\n");
    sb.append("    financieras: ").append(toIndentedString(financieras)).append("\n");
    sb.append("    comerciales: ").append(toIndentedString(comerciales)).append("\n");
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