package com.PgFinder.Pgfind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@ComponentScans(value = {
		@ComponentScan("com.PgFinder.Pgfind"),
		@ComponentScan("com.PgFinder.Pgfind.model"),
		@ComponentScan("com.PgFinder.Pgfind.Controller"),
		@ComponentScan("com.PgFinder.Pgfind.PgDao"),
		@ComponentScan("com.PgFinder.Pgfind.PgFeatures"),
		@ComponentScan("com.PgFinder.Pgfind.PgService")
})
@SpringBootApplication
public class PgfindApplication {

	public static void main(String[] args) {
		SpringApplication.run(PgfindApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			
			}
		};
	}
}
