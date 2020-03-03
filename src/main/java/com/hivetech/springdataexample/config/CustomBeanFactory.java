package com.hivetech.springdataexample.config;

import com.hivetech.springdataexample.service.ProductLineService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomBeanFactory {
    @Bean
    public ProductLineService createProductLineService(){
        return new ProductLineService();
    }
}
