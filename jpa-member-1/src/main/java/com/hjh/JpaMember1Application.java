package com.hjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class JpaMember1Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaMember1Application.class, args);
	}

}
