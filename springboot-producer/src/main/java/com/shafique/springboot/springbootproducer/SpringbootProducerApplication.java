package com.shafique.springboot.springbootproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.shafique.*")
public class SpringbootProducerApplication {

	public static void main(String[] args) {
		System.out.println("*******Started Producer App**************");
		SpringApplication.run(SpringbootProducerApplication.class, args);
	}

}

