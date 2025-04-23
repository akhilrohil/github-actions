package com.githubactions.testGithub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestGithubApplication {

	public static void main(String[] args) {
		System.out.println("Hello world Two");
		SpringApplication.run(TestGithubApplication.class, args);
	}

}
