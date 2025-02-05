package com.maicon.aplicativo_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Anotações -> @Nome -> Servem para informao ao spring boot como lidar com cada classe feita no java
@SpringBootApplication
public class AplicativoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicativoSpringApplication.class, args);
	}

}
