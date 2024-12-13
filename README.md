# rcc-pm-v2-simulation-client-java


Esta API simula el Reporte de Crédito Consolidado de Persona Moral v2.

## Requisitos

1. Java >= 1.8
2. Maven >= 3.3

## Instalación

Para la instalación de las dependencias se deberá ejecutar el siguiente comando:

```shell
mvn install -Dmaven.test.skip=true
```

> **NOTA:** Este fragmento del comando *-Dmaven.test.skip=true* evitará que se lance la prueba unitaria.


## Guía de inicio

### Paso 1. Agregar el producto a la aplicación

Al iniciar sesión seguir los siguientes pasos:

 1. Dar clic en la sección "**Mis aplicaciones**".
 2. Seleccionar la aplicación.
 3. Ir a la pestaña de "**Editar '@tuApp**' ".
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/edit_applications.jpg" width="900">
    </p>
 4. Al abrirse la ventana emergente, seleccionar el producto.
 5. Dar clic en el botón "**Guardar App**":
    <p align="center">
      <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/selected_product.jpg" width="400">
    </p>

### Paso 2. Capturar los datos de la petición

Los siguientes datos a modificar se encuentran en ***src/test/java/io/RCCPM/test/ApiTest.java***

Es importante contar con el setUp() que se encargará de inicializar la petición. Por tanto, se debe modificar la URL (**urlApi**); y la API KEY (**xApiKey**), como se muestra en el siguiente fragmento de código:

```java
@Before()
public void setUp() {
    this.apiClient = api.getApiClient();
    this.apiClient.setBasePath("urlApi");
    OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
    apiClient.setHttpClient(okHttpClient);
}
```

La petición se deberá modificar el siguiente fragmento de código con los datos correspondientes:

> **NOTA:** Para más ejemplos de simulación, consulte la colección de Postman.

```java
@Test
    public void getRccPmV2() throws Exception {
    	
        String xApiKey = "xApiKey";
        
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
```

### Paso 3. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:

```shell
mvn test -Dmaven.install.skip=true
```
---
[CONDICIONES DE USO, REPRODUCCIÓN Y DISTRIBUCIÓN](https://github.com/APIHub-CdC/licencias-cdc)

[1]: https://getcomposer.org/doc/00-intro.md#installation-linux-unix-macos