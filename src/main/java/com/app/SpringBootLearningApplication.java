package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootLearningApplication {

	public static void main(String[] args) {
	ApplicationContext app = SpringApplication.run(SpringBootLearningApplication.class, args);
	for(String s : app.getBeanDefinitionNames()){
		System.out.println("Bean Name = " + s);

	}
	}



}
