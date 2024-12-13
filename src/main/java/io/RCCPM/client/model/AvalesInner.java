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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Datos de avales.
 */
@ApiModel(description = "Datos de avales.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-10T17:56:34.445680493Z[GMT]")

public class AvalesInner {
  @SerializedName("RFC")
  private String RFC = null;

  @SerializedName("CURP")
  private String CURP = null;

  @SerializedName("nombre")
  private String nombre = null;

  @SerializedName("segundoNombre")
  private String segundoNombre = null;

  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;

  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;

  @SerializedName("domicilio")
  private Domicilio domicilio = null;

  @SerializedName("cantidad")
  private Integer cantidad = null;

  public AvalesInner RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }

   /**
   * En caso de Accionista o Aval con domicilio en el Extranjero podría no presentarse el dato.
   * @return RFC
  **/
  @ApiModelProperty(example = "MMA060515IKA")
  public String getRFC() {
    return RFC;
  }

  public void setRFC(String RFC) {
    this.RFC = RFC;
  }

  public AvalesInner CURP(String CURP) {
    this.CURP = CURP;
    return this;
  }

   /**
   * Código Único de Registro de Población.
   * @return CURP
  **/
  @ApiModelProperty(example = "MMA060515IKAPESD9")
  public String getCURP() {
    return CURP;
  }

  public void setCURP(String CURP) {
    this.CURP = CURP;
  }

  public AvalesInner nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Nombre de la persona.
   * @return nombre
  **/
  @ApiModelProperty(example = "ARTURO")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public AvalesInner segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }

   /**
   * Segundo nombre de la persona.
   * @return segundoNombre
  **/
  @ApiModelProperty(example = "KLEIN")
  public String getSegundoNombre() {
    return segundoNombre;
  }

  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }

  public AvalesInner apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }

   /**
   * Apellido paterno de la persona.
   * @return apellidoPaterno
  **/
  @ApiModelProperty(example = "VAZQUEZ")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public AvalesInner apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }

   /**
   * Apellido materno de la persona.
   * @return apellidoMaterno
  **/
  @ApiModelProperty(example = "GARRIDO")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public AvalesInner domicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
    return this;
  }

   /**
   * Get domicilio
   * @return domicilio
  **/
  @ApiModelProperty()
  public Domicilio getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(Domicilio domicilio) {
    this.domicilio = domicilio;
  }

  public AvalesInner cantidad(Integer cantidad) {
    this.cantidad = cantidad;
    return this;
  }

   /**
   * Cantidad por la cual fue avalado, sólo para Avales.
   * @return cantidad
  **/
  @ApiModelProperty(example = "124111")
  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvalesInner avalesInner = (AvalesInner) o;
    return Objects.equals(this.RFC, avalesInner.RFC) &&
        Objects.equals(this.CURP, avalesInner.CURP) &&
        Objects.equals(this.nombre, avalesInner.nombre) &&
        Objects.equals(this.segundoNombre, avalesInner.segundoNombre) &&
        Objects.equals(this.apellidoPaterno, avalesInner.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, avalesInner.apellidoMaterno) &&
        Objects.equals(this.domicilio, avalesInner.domicilio) &&
        Objects.equals(this.cantidad, avalesInner.cantidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(RFC, CURP, nombre, segundoNombre, apellidoPaterno, apellidoMaterno, domicilio, cantidad);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvalesInner {\n");
    
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    CURP: ").append(toIndentedString(CURP)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
    sb.append("    cantidad: ").append(toIndentedString(cantidad)).append("\n");
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
