package com.rulebean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author linjd
 * @create 2019-08-03 11:15
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();// Ribbon默认是轮询，我自定义为随机
//        return new RoundRobinRule();// Ribbon默认是轮询，我自定义为随机
    }
}
