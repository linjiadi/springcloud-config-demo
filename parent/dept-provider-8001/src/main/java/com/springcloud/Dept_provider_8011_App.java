package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author linjd
 * @create 2019-07-30 23:47
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableCircuitBreaker//对hystrixR熔断机制的支持
@EnableDiscoveryClient //服务发现
public class Dept_provider_8011_App {
    public static void main(String[] args) {
        SpringApplication.run(Dept_provider_8011_App.class, args);
    }
}
