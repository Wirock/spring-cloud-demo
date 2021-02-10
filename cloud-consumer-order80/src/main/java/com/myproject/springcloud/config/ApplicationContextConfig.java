package com.myproject.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenzw
 * @date 2021/2/10
 */
//用注解的形式创建bean，相当于ApplicationContext.xml的<bean id="" class="">
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
