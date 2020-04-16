package com.luoben.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 这是一个eureka客户端 提供服务Dept
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient  //开启服务发现 让该服务放入注册中心进行注册和从注册中心获取其他服务
public class DeptProvider8003App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003App.class,args);
    }
}
