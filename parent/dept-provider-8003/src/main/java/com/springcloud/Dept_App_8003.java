package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author linjd
 * @create 2019-08-03 10:11
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中`
public class Dept_App_8003 {
    public static void main(String[] args) {
        SpringApplication.run(Dept_App_8003.class, args);
    }
}
