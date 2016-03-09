package com.spring.learning.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.learning.java.based.configuration.MyColor;
import com.spring.learning.java.based.configuration.RedColor;
 

 
@Configuration
public class MyAppConfig {
 
    @Bean(name="myColorBean")
    public MyColor getMyColors(){
        return new RedColor();
    }
}

