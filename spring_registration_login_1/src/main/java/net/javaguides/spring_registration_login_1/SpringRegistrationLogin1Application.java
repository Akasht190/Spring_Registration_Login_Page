package net.javaguides.spring_registration_login_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class SpringRegistrationLogin1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringRegistrationLogin1Application.class, args);
	}

}
