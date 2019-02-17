package es.salesianos.SpringTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "es.salesianos.*" })
@SpringBootApplication
public class SpringTestApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApp.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringTestApp.class);
	}
}