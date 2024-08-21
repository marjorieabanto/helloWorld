package com.example.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	static {
		try {
		//	System.loadLibrary("libzkfp"); // Nombre sin la extensión .dll
			System.out.println("Biblioteca nativa cargada correctamente.");
		} catch (UnsatisfiedLinkError e) {
			System.err.println("No se pudo cargar la biblioteca nativa: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println(System.getProperty("java.library.path"));
	}

}
