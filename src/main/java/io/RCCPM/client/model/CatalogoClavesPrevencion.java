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
 * &lt;table&gt; &lt;thead&gt; &lt;tr&gt; &lt;th&gt;Clave&lt;/th&gt; &lt;th&gt;Descripción&lt;/th&gt; &lt;/tr&gt; &lt;/thead&gt; &lt;tr&gt; &lt;td&gt;78&lt;/td&gt; &lt;td&gt;Negocio receptor de tarjetas de crédito que ocasionó pérdida al Usuario&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;79&lt;/td&gt; &lt;td&gt;Persona relacionada con la empresa o con Persona Física con Actividad Empresarial con clave de prevención&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;80&lt;/td&gt; &lt;td&gt;Cliente declarado en quiebra, suspensión de pagos o en concurso mercantil&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;81&lt;/td&gt; &lt;td&gt;Cliente en trámite judicial&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;82&lt;/td&gt; &lt;td&gt;Cliente que propició pérdida al Otorgante por fraude comprobado, declarado conforme a sentencia judicial&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;83&lt;/td&gt; &lt;td&gt;Cliente que solicitó y/o acordó con el Otorgante liquidación del crédito con pago menor a la deuda total&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;84&lt;/td&gt; &lt;td&gt;El usuario no ha podido localizar al Cliente, titular de la cuenta&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;85&lt;/td&gt; &lt;td&gt;Cliente desvió recursos a fines distintos a los pactados, debidamente comprobado&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;86&lt;/td&gt; &lt;td&gt;Cliente que dispuso de las garantías que respaldan el crédito sin autorización del Otorgante&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;87&lt;/td&gt; &lt;td&gt;Cliente que enajena o cambia régimen de propiedad de sus bienes o permite gravámenes sobre los mismos&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;88&lt;/td&gt; &lt;td&gt;Cliente que dispuso de las retenciones de sus trabajadores, no enterando a la Institución correspondiente&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;92&lt;/td&gt; &lt;td&gt;Cliente que propició pérdida total al Otorgante&lt;/td&gt; &lt;/tr&gt; &lt;/table&gt;
 */
@JsonAdapter(CatalogoClavesPrevencion.Adapter.class)
public enum CatalogoClavesPrevencion {
  @SerializedName("78")
  _78("78"),
  @SerializedName("79")
  _79("79"),
  @SerializedName("80")
  _80("80"),
  @SerializedName("81")
  _81("81"),
  @SerializedName("82")
  _82("82"),
  @SerializedName("83")
  _83("83"),
  @SerializedName("84")
  _84("84"),
  @SerializedName("85")
  _85("85"),
  @SerializedName("86")
  _86("86"),
  @SerializedName("87")
  _87("87"),
  @SerializedName("88")
  _88("88"),
  @SerializedName("92")
  _92("92");

  private String value;

  CatalogoClavesPrevencion(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CatalogoClavesPrevencion fromValue(String input) {
    for (CatalogoClavesPrevencion b : CatalogoClavesPrevencion.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CatalogoClavesPrevencion> {
    @Override
    public void write(final JsonWriter jsonWriter, final CatalogoClavesPrevencion enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public CatalogoClavesPrevencion read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return CatalogoClavesPrevencion.fromValue((String)(value));
    }
  }
}
