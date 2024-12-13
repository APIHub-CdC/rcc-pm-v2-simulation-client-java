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
 * Datos del domicilio de la persona a consultar.
 */
@ApiModel(description = "Datos del domicilio de la persona a consultar.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-10T17:56:34.445680493Z[GMT]")

public class RequestDomicilio {
  @SerializedName("direccion")
  private String direccion = null;

  @SerializedName("coloniaPoblacion")
  private String coloniaPoblacion = null;

  @SerializedName("delegacionMunicipio")
  private String delegacionMunicipio = null;

  @SerializedName("ciudad")
  private String ciudad = null;

  @SerializedName("estado")
  private CatalogoEstados estado = null;

  @SerializedName("CP")
  private String CP = null;

  @SerializedName("estadoExtranjero")
  private String estadoExtranjero = null;

  @SerializedName("pais")
  private CatalogoPaisNacionalidad pais = null;

  public RequestDomicilio direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

   /**
   * Reportar el nombre de la calle, número exterior, número interior. Deben considerarse avenida,cerrada, manzana, lote, edificio,departamento etc. Debe contener por lo menos dos cadenas de caracteres para que el registro sea válido, de lo contrario el registro será rechazado.
   * @return direccion
  **/
  @ApiModelProperty(example = "CENTENO 14", required = true)
  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public RequestDomicilio coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }

   /**
   * Reportar la colonia a la cual pertenece la dirección contenida en el elemento dirección.
   * @return coloniaPoblacion
  **/
  @ApiModelProperty(example = "GRANADA", required = true)
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }

  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }

  public RequestDomicilio delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }

   /**
   * Reportar la delegación o municipio a la cual pertenece la dirección contenida en el elemento Dirección.
   * @return delegacionMunicipio
  **/
  @ApiModelProperty(example = "MIGUEL HIDALGO", required = true)
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }

  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }

  public RequestDomicilio ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }

   /**
   * Reportar la ciudad a la cual pertenece la dirección contenida en el elemento Dirección.
   * @return ciudad
  **/
  @ApiModelProperty(example = "MÉXICO", required = true)
  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public RequestDomicilio estado(CatalogoEstados estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Get estado
   * @return estado
  **/
  @ApiModelProperty(required = true)
  public CatalogoEstados getEstado() {
    return estado;
  }

  public void setEstado(CatalogoEstados estado) {
    this.estado = estado;
  }

  public RequestDomicilio CP(String CP) {
    this.CP = CP;
    return this;
  }

   /**
   * El código postal reportado debe estar compuesto por 5 dígitos. Para que el código postal sea válido deberá corresponder al estado reportado.
   * @return CP
  **/
  @ApiModelProperty(example = "05210", required = true)
  public String getCP() {
    return CP;
  }

  public void setCP(String CP) {
    this.CP = CP;
  }

  public RequestDomicilio estadoExtranjero(String estadoExtranjero) {
    this.estadoExtranjero = estadoExtranjero;
    return this;
  }

   /**
   * Debe de reportarse la fecha desde cuando el consumidor vive en la  dirección reportada.
   * @return estadoExtranjero
  **/
  @ApiModelProperty(example = "ALB")
  public String getEstadoExtranjero() {
    return estadoExtranjero;
  }

  public void setEstadoExtranjero(String estadoExtranjero) {
    this.estadoExtranjero = estadoExtranjero;
  }

  public RequestDomicilio pais(CatalogoPaisNacionalidad pais) {
    this.pais = pais;
    return this;
  }

   /**
   * Get pais
   * @return pais
  **/
  @ApiModelProperty(required = true)
  public CatalogoPaisNacionalidad getPais() {
    return pais;
  }

  public void setPais(CatalogoPaisNacionalidad pais) {
    this.pais = pais;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDomicilio requestDomicilio = (RequestDomicilio) o;
    return Objects.equals(this.direccion, requestDomicilio.direccion) &&
        Objects.equals(this.coloniaPoblacion, requestDomicilio.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, requestDomicilio.delegacionMunicipio) &&
        Objects.equals(this.ciudad, requestDomicilio.ciudad) &&
        Objects.equals(this.estado, requestDomicilio.estado) &&
        Objects.equals(this.CP, requestDomicilio.CP) &&
        Objects.equals(this.estadoExtranjero, requestDomicilio.estadoExtranjero) &&
        Objects.equals(this.pais, requestDomicilio.pais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, estadoExtranjero, pais);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDomicilio {\n");
    
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    estadoExtranjero: ").append(toIndentedString(estadoExtranjero)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
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