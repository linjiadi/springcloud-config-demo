package com.springclou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author linjd
 * @create 2019-08-06 23:52
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_Application_App {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_Application_App.class, args);
    }
}
