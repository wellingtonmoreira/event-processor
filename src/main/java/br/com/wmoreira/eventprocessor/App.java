package br.com.wmoreira.eventprocessor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;

@SpringBootApplication
public class App extends WebMvcAutoConfiguration {

	public static void main(String... args) {
		SpringApplication.run(App.class, args);
	}
}