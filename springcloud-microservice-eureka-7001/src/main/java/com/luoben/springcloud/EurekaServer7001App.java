package com.luoben.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
/**
 * 启用eureka服务,接收其他服务注册
 */
@EnableEurekaServer
public class EurekaServer7001App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001App.class,args);
    }
}
