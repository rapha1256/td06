package colva.td.TD06;

import colva.td.TD06.service.BibliothequeService;
import jakarta.persistence.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "colva.td.TD06.repository")
@EntityScan("colva.td.TD06.entity")
public class Td06Application {

	public static void main(String[] args) {
		SpringApplication.run(Td06Application.class, args);
		BibliothequeService.testApp();
	}

}
