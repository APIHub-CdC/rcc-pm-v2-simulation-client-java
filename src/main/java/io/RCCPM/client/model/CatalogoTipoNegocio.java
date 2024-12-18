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

import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Lista de objetos con tipo de negocio.&lt;/table&gt;&lt;table&gt;&lt;thead&gt;&lt;tr&gt;&lt;th&gt;Id&lt;/th&gt;&lt;th&gt;Descripcion&lt;/th&gt;&lt;/tr&gt;&lt;/thead&gt;&lt;tbody&gt;&lt;tr&gt;&lt;td&gt;001&lt;/td&gt;&lt;td&gt;ADMINISTRADORAS DE CARTERA&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;002&lt;/td&gt;&lt;td&gt;ALMACENES DE DEPOSITO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;003&lt;/td&gt;&lt;td&gt;ARRENDADORAS FINANCIERAS&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;004&lt;/td&gt;&lt;td&gt;ARRENDADORAS NO FINANCIERAS&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;005&lt;/td&gt;&lt;td&gt;ATENCION AL CONSUMIDOR&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;006&lt;/td&gt;&lt;td&gt;AUTOMOTRIZ&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;007&lt;/td&gt;&lt;td&gt;AUTORIDADES&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;008&lt;/td&gt;&lt;td&gt;BANCOS&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;009&lt;/td&gt;&lt;td&gt;BIENES RAICES&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;010&lt;/td&gt;&lt;td&gt;CAJAS DE AHORRO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;011&lt;/td&gt;&lt;td&gt;CAMARAS Y ASOCIACIONES&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;012&lt;/td&gt;&lt;td&gt;CASA DE BOLSA&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;013&lt;/td&gt;&lt;td&gt;CASA DE CAMBIO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;014&lt;/td&gt;&lt;td&gt;CIRCULO DE CREDITO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;015&lt;/td&gt;&lt;td&gt;COMPAÑIA DE FINANCIAMIENTO AUTOMOTRIZ&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;016&lt;/td&gt;&lt;td&gt;COMPAÑIA DE PRESTAMO PERSONAL&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;017&lt;/td&gt;&lt;td&gt;COMUNICACIONES&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;018&lt;/td&gt;&lt;td&gt;EDITORIAL&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;019&lt;/td&gt;&lt;td&gt;FACTORAJE&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;020&lt;/td&gt;&lt;td&gt;FONDOS Y FIDEICOMISOS&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;021&lt;/td&gt;&lt;td&gt;GOBIERNO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;022&lt;/td&gt;&lt;td&gt;HIPOTECARIO NO BANCARIO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;023&lt;/td&gt;&lt;td&gt;MERCANCIA PARA HOGAR Y OFICINA&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;024&lt;/td&gt;&lt;td&gt;MERCANCIA PARA LA CONSTRUCCION&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;025&lt;/td&gt;&lt;td&gt;MONITOREO DE CREDITO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;026&lt;/td&gt;&lt;td&gt;SALUD Y SERVICIOS MEDICOS&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;027&lt;/td&gt;&lt;td&gt;SEGUROS Y FIANZAS&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;028&lt;/td&gt;&lt;td&gt;SERVICIOS&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;029&lt;/td&gt;&lt;td&gt;SOFOL AUTOMOTRIZ&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;030&lt;/td&gt;&lt;td&gt;SOFOL HIPOTECARIA&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;031&lt;/td&gt;&lt;td&gt;SOFOL PRESTAMO PERSONAL&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;032&lt;/td&gt;&lt;td&gt;TIENDA DE AUTOSERVICIO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;033&lt;/td&gt;&lt;td&gt;TIENDA DE ROPA&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;051&lt;/td&gt;&lt;td&gt;INSUMOS&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;035&lt;/td&gt;&lt;td&gt;UNION DE CREDITO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;036&lt;/td&gt;&lt;td&gt;VENTA POR CORREO / TELEFONO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;038&lt;/td&gt;&lt;td&gt;PRUEBA DE CONSULTAS&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;039&lt;/td&gt;&lt;td&gt;CASA DE EMPEÑO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;040&lt;/td&gt;&lt;td&gt;COOPERATIVA DE AHORRO Y CREDITO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;041&lt;/td&gt;&lt;td&gt;TELEFONÍA CELULAR&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;042&lt;/td&gt;&lt;td&gt;SERVICIO DE TELEVISION DE PAGA&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;043&lt;/td&gt;&lt;td&gt;AUTOFINANCIAMIENTO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;044&lt;/td&gt;&lt;td&gt;TELEFONIA LOCAL Y DE LARGA DISTANCIA&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;045&lt;/td&gt;&lt;td&gt;MICROFINANCIERA&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;046&lt;/td&gt;&lt;td&gt;SOCIEDADES FINANCIERAS POPULARES&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;047&lt;/td&gt;&lt;td&gt;SOFOL EMPRESARIAL&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;034&lt;/td&gt;&lt;td&gt;TIENDA DEPARTAMENTAL&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;050&lt;/td&gt;&lt;td&gt;SIC&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;048&lt;/td&gt;&lt;td&gt;VENTA POR CATALOGO&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;049&lt;/td&gt;&lt;td&gt;SOCIEDAD FINANCIERA DE OBJETO MULTIPLE&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;054&lt;/td&gt;&lt;td&gt;EDUCACIÓN&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;056&lt;/td&gt;&lt;td&gt;EMPRESA PETROLERA&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;057&lt;/td&gt;&lt;td&gt;SERVICIOS FIDUCIARIOS&lt;/td&gt;&lt;/tr&gt;&lt;tr&gt;&lt;td&gt;052&lt;/td&gt;&lt;td&gt;SOCIEDAD FINANCIERA COMUNITARIA&lt;/td&gt;&lt;/tr&gt;&lt;/tbody&gt;&lt;/table&gt;
 */
@JsonAdapter(CatalogoTipoNegocio.Adapter.class)
public enum CatalogoTipoNegocio {
  @SerializedName("01")
  _01("01"),
  @SerializedName("02")
  _02("02"),
  @SerializedName("03")
  _03("03"),
  @SerializedName("04")
  _04("04"),
  @SerializedName("05")
  _05("05"),
  @SerializedName("06")
  _06("06"),
  @SerializedName("07")
  _07("07"),
  @SerializedName("08")
  _08("08"),
  @SerializedName("09")
  _09("09"),
  @SerializedName("010")
  _010("010"),
  @SerializedName("011")
  _011("011"),
  @SerializedName("012")
  _012("012"),
  @SerializedName("013")
  _013("013"),
  @SerializedName("014")
  _014("014"),
  @SerializedName("015")
  _015("015"),
  @SerializedName("016")
  _016("016"),
  @SerializedName("017")
  _017("017"),
  @SerializedName("018")
  _018("018"),
  @SerializedName("019")
  _019("019"),
  @SerializedName("020")
  _020("020"),
  @SerializedName("021")
  _021("021"),
  @SerializedName("022")
  _022("022"),
  @SerializedName("023")
  _023("023"),
  @SerializedName("024")
  _024("024"),
  @SerializedName("025")
  _025("025"),
  @SerializedName("026")
  _026("026"),
  @SerializedName("027")
  _027("027"),
  @SerializedName("028")
  _028("028"),
  @SerializedName("029")
  _029("029"),
  @SerializedName("030")
  _030("030"),
  @SerializedName("031")
  _031("031"),
  @SerializedName("032")
  _032("032"),
  @SerializedName("033")
  _033("033"),
  @SerializedName("051")
  _051("051"),
  @SerializedName("035")
  _035("035"),
  @SerializedName("036")
  _036("036"),
  @SerializedName("038")
  _038("038"),
  @SerializedName("039")
  _039("039"),
  @SerializedName("040")
  _040("040"),
  @SerializedName("041")
  _041("041"),
  @SerializedName("042")
  _042("042"),
  @SerializedName("043")
  _043("043"),
  @SerializedName("044")
  _044("044"),
  @SerializedName("045")
  _045("045"),
  @SerializedName("046")
  _046("046"),
  @SerializedName("047")
  _047("047"),
  @SerializedName("034")
  _034("034"),
  @SerializedName("050")
  _050("050"),
  @SerializedName("048")
  _048("048"),
  @SerializedName("049")
  _049("049"),
  @SerializedName("054")
  _054("054"),
  @SerializedName("056")
  _056("056"),
  @SerializedName("057")
  _057("057"),
  @SerializedName("052")
  _052("052");

  private String value;

  CatalogoTipoNegocio(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogoTipoNegocio fromValue(String input) {
    for (CatalogoTipoNegocio b : CatalogoTipoNegocio.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CatalogoTipoNegocio> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoTipoNegocio enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CatalogoTipoNegocio read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return CatalogoTipoNegocio.fromValue((String)(value));
    }
  }
}
