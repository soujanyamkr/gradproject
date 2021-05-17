package edu.missouristate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class GradprojectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GradprojectApplication.class, args);
	}
	 @Override
	    protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
	        return builder.sources(GradprojectApplication.class);
	    }

}
