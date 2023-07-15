package com.upao.clean_now;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CleanNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanNowApplication.class, args);
	}

}
