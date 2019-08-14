package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author linjd
 * @create 2019-08-06 23:44
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.springcloud.service"})
@ComponentScan("com.springcloud")
public class Consumer_App_80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_App_80.class, args);
    }
}
