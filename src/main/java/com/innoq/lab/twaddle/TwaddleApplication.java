package com.innoq.lab.twaddle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.innoq.lab.twaddle.repository")
public class TwaddleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwaddleApplication.class, args);
	}
}