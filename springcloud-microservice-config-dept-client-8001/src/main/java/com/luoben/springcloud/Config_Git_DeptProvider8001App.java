package com.luoben.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 这是一个eureka客户端 提供服务Dept
 */
@SpringBootApplication
@EnableDiscoveryClient  //开启服务发现 让该服务放入注册中心进行注册和从注册中心获取其他服务
public class Config_Git_DeptProvider8001App {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_DeptProvider8001App.class,args);
    }
}
