package com.example.botpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.logging.Logger;

//import static springfox.documentation.builders.PathSelectors.regex;


@SpringBootApplication
@EnableJpaAuditing
public class BotPocApplication {

    public static void main(String[] args) {
        SpringApplication.run(BotPocApplication.class, args);
    }

//    @Bean
//    public Docket SwaggerApiConfig(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .paths(regex("/api"))
//                .apis(RequestHandlerSelectors.basePackage("com.example.botpoc"))
//                .build();
//    }



}

