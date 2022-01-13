package com.dio.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {
	
	private String driverClassName;
	private String url;
	private String username;
	private String password;
	
	@Profile("dev")
	@Bean
	public String testDataBaseConnection() {
		System.out.println("DB Connection for DEV - H2");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection to H2_TEST - Test instance";
	}
	
	
	@Profile("prod")
	@Bean
	public String productionDataBaseConnection() {
		System.out.println("DB Connection for Production - MySQL");
		System.out.println(driverClassName);
		System.out.println(url);
		return "DB Connection to MySQL_PROD - Test instance";
	}
}
