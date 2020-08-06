package com.example.JavaTestStefan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.JavaTestStefan"})
@EnableJpaRepositories("com.example.JavaTestStefan")
@EntityScan(basePackages = {"model"})
public class JavaTestStefanApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JavaTestStefanApplication.class, args);
	}

}
