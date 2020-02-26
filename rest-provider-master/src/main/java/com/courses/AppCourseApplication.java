package com.courses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.courses.*")
@EnableJpaRepositories(basePackages = "com.courses.*")
@EntityScan(basePackages = "com.courses.*")
public class AppCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppCourseApplication.class, args);
	}

}
