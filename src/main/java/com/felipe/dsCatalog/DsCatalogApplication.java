package com.felipe.dsCatalog;

import com.felipe.dsCatalog.services.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DsCatalogApplication.class, args);
	}

}
