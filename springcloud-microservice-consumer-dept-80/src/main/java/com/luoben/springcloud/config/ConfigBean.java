package com.luoben.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    /**
     * 配置RestTemplate
     * 通过RestTemplate调用提供者服务 ，发送rest请求
     * 提供了多种访问http服务的方法，
     * 针对于访问restful服务的模板类,
     * 是Spring提供的用于访问Rest服务的 客户端模板工具集
     * @return
     */
    @Bean
    @LoadBalanced  //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力 默认轮询
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
