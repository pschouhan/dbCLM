package com.dbCLM.controller;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@Configuration
@EnableSwagger2
@Component

public class SwaggerConfig {

	@Bean
	public GroupedOpenApi swaggerApiConfig() {
		return GroupedOpenApi.builder().build();
	}
}
