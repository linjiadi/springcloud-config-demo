package com.springcloud;

/**
 * @author linjd
 * @create 2019-08-06 23:23
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器端启动类,接受其它微服务注册进来
public class EurkaApplication_App {
    public static void main(String[] args) {
        SpringApplication.run(EurkaApplication_App.class, args);
    }
}
