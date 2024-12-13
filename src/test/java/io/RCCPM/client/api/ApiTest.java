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

package io.RCCPM.client.api;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.RCCPM.client.ApiClient;
import io.RCCPM.client.model.CatalogoEstados;
import io.RCCPM.client.model.CatalogoPaisNacionalidad;
import io.RCCPM.client.model.Persona;
import io.RCCPM.client.model.RequestDomicilio;
import io.RCCPM.client.model.RequestRCCV2;
import io.RCCPM.client.model.RespuestaRCCV2;
import okhttp3.OkHttpClient;


import org.junit.Assert;
import org.junit.Before;


public class ApiTest {
	
	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());

    private final ReporteDeCrditoConsolidadoDePersonasMoralesV2Api api = new ReporteDeCrditoConsolidadoDePersonasMoralesV2Api();
    
    private ApiClient apiClient = null;
    
    private String xApiKey = "xApiKey";
    
    @Before
    public void setUp() {
    	this.apiClient = api.getApiClient();
    	this.apiClient.setBasePath("urlApi");
    	OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
    	apiClient.setHttpClient(okHttpClient);
    }
    
    @Test
    public void getRccPmV2() throws Exception {
    	
        String xApiKey = this.xApiKey;
        
        RequestRCCV2 body = new RequestRCCV2();
        Persona persona = new Persona();
        RequestDomicilio domicilio = new RequestDomicilio();
        
        domicilio.setDireccion("MOTOLINIA 47");
        domicilio.setCP("49900");
        domicilio.setColoniaPoblacion("CENTRO");
        domicilio.setDelegacionMunicipio("TECALITLAN");
        domicilio.setCiudad("TECALITLAN");
        domicilio.setEstado(CatalogoEstados.JAL);
        domicilio.setPais(CatalogoPaisNacionalidad.MX);
        
        persona.setNombre("VIVERO LA JIRAFA SPR DE RL");
        persona.setRFC("VJS231120T20");
        persona.setDomicilio(domicilio);
        
        
        body.setFolioOtorgante("3930");
        body.setPersona(persona);
        
        logger.info(body.toString());
        
        
        RespuestaRCCV2 response = api.v2rccPm(body, xApiKey);
        
        
        logger.info(response.toString());
        
        Assert.assertNotNull(response);
        

    }
}