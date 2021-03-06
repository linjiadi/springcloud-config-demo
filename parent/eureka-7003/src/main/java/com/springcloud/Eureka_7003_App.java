package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author linjd
 * @create 2019-08-03 10:22
 */
@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class Eureka_7003_App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7003_App.class, args);
    }
}
