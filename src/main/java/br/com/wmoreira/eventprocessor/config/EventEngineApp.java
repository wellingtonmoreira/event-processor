package br.com.wmoreira.eventprocessor.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;

@SpringBootApplication
public class EventEngineApp extends WebMvcAutoConfiguration {

	public static void main(String... args) {
		SpringApplication.run(EventEngineApp.class, args);
	}
}