package com.example.user_management.demo_user_management;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class DemoUserManagementApplication {

	public static void main(String[] args) {
		run(DemoUserManagementApplication.class, args);
	}

}
