package com.ecomSpringBoot.ecomSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class EcomSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomSpringProjectApplication.class, args);
	}

}
