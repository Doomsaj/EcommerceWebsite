package ir.doomsaj.ecommercewebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcommerceWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceWebsiteApplication.class, args);
	}

}
