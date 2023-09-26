<h1>TravelWiz Backend</h1>
TravelWiz is an application that manages trips, users and content.

<h2>General info</h2>
The application has been built with Java 17 using SpringBoot Framework. The design follows the REST architecture.  Package specification:
<br>- entity -> Model definition
<br>- repository -> Controller manager (uses JPA)
<br>- service -> External view (REST API)

<h2>Database</h2>
The application uses MySQL as data source, the repository does not include the database configuration file. Your .yml file should look something like this:

```java
spring:
  datasource:
    hikari:
      driver-class-name: com.mysql.cj.jdbc.Driver
      jdbc-url: jdbc:mysql://localhost:3306/travel_wiz?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
      password: yourPassword
      username: yourUsername
  jpa:
    show-sql: true
```
The following dependency should be added to your pom.xml file:

```xml
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>
```
<h2>HTTP Paths for testing</h2>
<h3>Administrador</h3>
<br>HTTP Methods for entity Administrador
<br>GET:
<br>http://localhost:8080/administrador/buscar
<br>POST:
<br>http://localhost:8080/administrador/guardar

<br>Body (JSON):
```json
{
"usuario": String,
"password": String,
"universidad": String,
"nombre": String,
"carnet": String,
"curso": String
}
```

<br>DELETE:
<br>http://localhost:8080/administrador/eliminar/usuario (String)

<h3>Anuncio</h3>
<br>HTTP Methods for entity Anuncio
<br>GET:
<br>http://localhost:8080/anuncio/buscar
<br>POST:
<br>http://localhost:8080/anuncio/guardar

<br>Body (JSON):
```json
{
"texto": "Sample Txt 1",
"imagen": "Sample Img 2",
"fechaInicio": Date -> Ex: "2023-09-28",
"fechaFin": Date -> Ex: "2023-09-30"
}
```

<br>DELETE:
<br>http://localhost:8080/anuncio/eliminar/idanuncio (Integer)

<h3>Estado</h3>
<br>HTTP Methods for entity Estado
<br>GET:
<br>http://localhost:8080/estado/buscar
<br>POST:
<br>http://localhost:8080/estado/guardar

<br>Body (JSON):
```json
{
"valor": String,
"tabla": String,
"campo": String
}
```

<br>DELETE:
<br>http://localhost:8080/estado/eliminar/idestado (Integer)

<h3>Lugar</h3>
<br>HTTP Methods for entity Lugar
<br>GET:
<br>http://localhost:8080/lugar/buscar
<br>POST:
<br>http://localhost:8080/lugar/guardar

<br>Body (JSON):
```json
{
"nombre": String,
"descripcion": String,
"imagen": String
}
```

<br>DELETE:
<br>http://localhost:8080/lugar/eliminar/idlugar (Integer)

<h3>Usuario</h3>
<br>HTTP Methods for entity Usuario
<br>GET:
<br>http://localhost:8080/usuario/buscar
<br>POST:
<br>http://localhost:8080/usuario/guardar

<br>Body (JSON):
```json
{
"correo": String,
"nombre": String,
"apellido": String,
"password": String,
"telefono": String
}
```

<br>DELETE:
<br>http://localhost:8080/usuario/eliminar/correo (String)

<h3>Viaje</h3>
<br>HTTP Methods for entity Viaje
<br>GET:
<br>http://localhost:8080/viaje/buscar
<br>POST:
<br>http://localhost:8080/viaje/guardar

Body (JSON):
```json
{
"fechaPartida": Date -> Ex: "2023-09-28",
"fechaRegreso": Date -> Ex: "2023-09-30",
"cupo": Integer,
"descripcion": String,
"idestado": int -> FK estado,
"origen": int -> FK lugar,
"destino": int -> FK lugar
}
```

<br>DELETE:
<br>http://localhost:8080/viaje/eliminar/idviaje (Integer)

<h3>Reservación</h3>
<br>HTTP Methods for entity Reservación
<br>GET:
<br>http://localhost:8080/reservacion/buscar
<br>POST:
<br>http://localhost:8080/reservacion/guardar

<br>Body (JSON):
```json
{
"cantidadPasajeros": int,
"observaciones": String,
"correo": String -> FK usuario,
"idestado": int -> FK estado,
"idviaje": int -> FK viaje
}
```

<br>DELETE:
<br>http://localhost:8080/reservacion/eliminar/idreservacion (Integer)







