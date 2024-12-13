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
 * Domicilio
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-12-10T17:56:34.445680493Z[GMT]")

public class Domicilio {
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

  @SerializedName("pais")
  private CatalogoPaisNacionalidad pais = null;

  @SerializedName("telefono")
  private String telefono = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("fax")
  private String fax = null;

  public Domicilio direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }

   /**
   * Es el nombre de la calle, número exterior, número interior. Deben considerarse avenida,cerrada, manzana, lote, edificio,departamento etc.
   * @return direccion
  **/
  @ApiModelProperty(example = "PASADISO ENCONTRADO 58")
  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Domicilio coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }

   /**
   * Colonia a la cual pertenece la dirección contenida en el elemento dirección.
   * @return coloniaPoblacion
  **/
  @ApiModelProperty(example = "MONTEVIDEO")
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }

  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }

  public Domicilio delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }

   /**
   * La delegación o municipio a la cual pertenece la dirección contenida en el elemento Dirección.
   * @return delegacionMunicipio
  **/
  @ApiModelProperty(example = "GUSTAVO A MADERO")
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }

  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }

  public Domicilio ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }

   /**
   * La ciudad a la cual pertenece la dirección contenida en el elemento Dirección.
   * @return ciudad
  **/
  @ApiModelProperty(example = "CIUDAD DE MÉXICO")
  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public Domicilio estado(CatalogoEstados estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Get estado
   * @return estado
  **/
  @ApiModelProperty()
  public CatalogoEstados getEstado() {
    return estado;
  }

  public void setEstado(CatalogoEstados estado) {
    this.estado = estado;
  }

  public Domicilio CP(String CP) {
    this.CP = CP;
    return this;
  }

   /**
   * Para domicilios en México se validará la correcta correspondencia del código postal contra el estado ingresado. En el caso de domicilios en el extranjero debe reportarse un dato válido. No rellenar espacio.
   * @return CP
  **/
  @ApiModelProperty(example = "07730")
  public String getCP() {
    return CP;
  }

  public void setCP(String CP) {
    this.CP = CP;
  }

  public Domicilio pais(CatalogoPaisNacionalidad pais) {
    this.pais = pais;
    return this;
  }

   /**
   * Get pais
   * @return pais
  **/
  @ApiModelProperty()
  public CatalogoPaisNacionalidad getPais() {
    return pais;
  }

  public void setPais(CatalogoPaisNacionalidad pais) {
    this.pais = pais;
  }

  public Domicilio telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }

   /**
   * Número de Teléfono.
   * @return telefono
  **/
  @ApiModelProperty(example = "5616635814")
  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public Domicilio extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Número de extension.
   * @return extension
  **/
  @ApiModelProperty(example = "244")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public Domicilio fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Número de fax.
   * @return fax
  **/
  @ApiModelProperty(example = "255555544")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domicilio domicilio = (Domicilio) o;
    return Objects.equals(this.direccion, domicilio.direccion) &&
        Objects.equals(this.coloniaPoblacion, domicilio.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, domicilio.delegacionMunicipio) &&
        Objects.equals(this.ciudad, domicilio.ciudad) &&
        Objects.equals(this.estado, domicilio.estado) &&
        Objects.equals(this.CP, domicilio.CP) &&
        Objects.equals(this.pais, domicilio.pais) &&
        Objects.equals(this.telefono, domicilio.telefono) &&
        Objects.equals(this.extension, domicilio.extension) &&
        Objects.equals(this.fax, domicilio.fax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, pais, telefono, extension, fax);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domicilio {\n");
    
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
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
