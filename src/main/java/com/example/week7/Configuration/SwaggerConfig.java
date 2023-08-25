package com.example.week7.Configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SwaggerConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
