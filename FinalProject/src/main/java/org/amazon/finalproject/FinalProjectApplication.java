package org.amazon.finalproject;

import org.amazon.finalproject.Model.Role;
import org.amazon.finalproject.Model.User;
import org.amazon.finalproject.Service.RoleService;
import org.amazon.finalproject.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.factory.PasswordEncoderFactories;
//import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class FinalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalProjectApplication.class, args);
	}
	// To centralize configuration and allow to use it through dependency injection in our application
	@Bean
	PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	// To have some data to start with, it's executed automatically
	@Bean
	CommandLineRunner run(UserService userService, RoleService roleService) {
		return args -> {

			roleService.saveRole(new Role(null, "BUYER"));
			roleService.saveRole(new Role(null, "SELLER"));


//			userService.saveUser(new User(null, "Williams Avila", "Will", "3456", new ArrayList<>()));
//			userService.saveUser(new User(null, "Marlon Hidalgo", "Mar", "3456", new ArrayList<>()));
//
//			roleService.addRoleToUser("Will", "BUYER");
//			roleService.addRoleToUser("Mar", "SELLER");

		};
	}


}
