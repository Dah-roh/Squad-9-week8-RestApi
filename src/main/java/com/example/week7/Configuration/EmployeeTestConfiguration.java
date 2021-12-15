package com.example.week7.Configuration;

import com.example.week7.ServiceImpl.EmployeeServiceImpl;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class EmployeeTestConfiguration {

    @Bean
    @Primary
    public EmployeeServiceImpl employeeServiceImpl(){
        return Mockito.mock(EmployeeServiceImpl.class);
    }
}
