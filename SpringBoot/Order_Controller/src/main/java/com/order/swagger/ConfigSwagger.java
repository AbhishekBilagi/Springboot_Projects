package com.order.swagger;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Documentation;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Component
@EnableSwagger2
public class ConfigSwagger {

	public Docket getDocket() { 
		return new Docket (DocumentationType.SWAGGER_2)
				.groupName("public-apis")
				.apiInfo(gatApiInfo())
				.select()
				//.apis(RequestHandlerSelectors.basePackage("com.order.controller"))
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.build();
	}
	public ApiInfo gatApiInfo() {
		 return new ApiInfoBuilder().title("Code decode Apis")
				 .description("Apis created by code decode ").version("1").build();
	}
}
