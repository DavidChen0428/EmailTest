package com.project.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailTestApplication {

	public static void main(String[] args) {
		System.setProperty("https.protocols", "TLSv1.2");
		SpringApplication.run(EmailTestApplication.class, args);
	}

}
