package com.marcopc.restfulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//El flujo de acceso a los datos es: Repository (acceso a datos en la db) -> Service (reglas de negocio) -> Controller (endpoint)

//Inversion de dependencias es basicamente utilizar las funcionalidades del framework, como se usa JPA en vez de JPQL en el metodo findByName...

@SpringBootApplication
public class RestfulapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulapiApplication.class, args);
	}

}
