package com.apirest.lojascentro.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Marcos Rosa
 *
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.apirest.lojascentro"))
                .paths(regex("/lojasCentro.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
    	
    	 List<VendorExtension> vendorExtensions = new ArrayList<>();

        ApiInfo apiInfo = new ApiInfo(
                "Produtos LojasCentro API REST",
                "API REST Produtos.",
                "1.0",
                "Terms of Service",
                new Contact("Marcos Rosa", "https://www.youtube.com/mrosa2004br", "mrosa2004br@gmail.com"),
                "Apache License Version 2.0",
                "https://www.apache.org/licesen.html", vendorExtensions );

        return apiInfo;
    }
	
}
