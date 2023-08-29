package com.example.simplejavaapi;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleJavaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleJavaApiApplication.class, args);
	}
	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI()
				.info(new Info()
						.title("SIMPLE JAVA API")
						.version("0.1")
						.description("A simple Java API docs")
						.contact(new Contact().name("Mateo").url("https://github.com/chuttmateo")));
	}
}
