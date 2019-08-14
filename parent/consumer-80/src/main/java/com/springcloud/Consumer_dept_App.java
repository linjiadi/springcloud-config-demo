package com.springcloud;

import com.rulebean.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author linjd
 * @create 2019-08-01 20:59
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.springcloud.service"})
@ComponentScan("com.springcloud")
@RibbonClient(name="SPRINGCLOUD-DEPT",configuration=MySelfRule.class)
public class Consumer_dept_App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_dept_App.class, args);
    }
}
