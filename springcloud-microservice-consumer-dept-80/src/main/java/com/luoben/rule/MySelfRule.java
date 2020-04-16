package com.luoben.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //指定LoadBalanced的算法 用我们自定义的规则算法
        return new MyRandomRule();
    }

}
