package com.luoben.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/**
 * 启用eureka服务,接收其他服务注册
 */
@EnableEurekaServer
public class Config_Git_EurekaServer7001App {
    public static void main(String[] args) {
        SpringApplication.run(Config_Git_EurekaServer7001App.class,args);
    }
}
