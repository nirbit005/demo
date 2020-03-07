package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(DemoApplication.class, args);
		TestContextExamp serv = app.getBean(TestContextExamp.class);
		System.out.println("Context Test- " + serv.getMsg());
		System.out.println("Shutting down application....");
		SpringApplication.exit(app, () -> 0);
	}

}
