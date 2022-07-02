package com.example.reedit.app.clone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class ReeditAppCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReeditAppCloneApplication.class, args);
	}

}
