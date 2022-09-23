package br.com.carraria.careersuggestions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("br.com.carraria.careersuggestions")
@EnableJpaRepositories(basePackages = "br.com.carraria.careersuggestions")
public class CareersSuggestionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CareersSuggestionsApplication.class, args);
	}

}
