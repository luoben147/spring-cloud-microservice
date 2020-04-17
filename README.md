# spring-cloud-microservice
SpringCloud Finchley.SR2 版本的Demo

## 项目版本
- spring cloud版本：Finchley.SR2
- spring boot版本：2.0.6.RELEASE


##项目模块说明
```lua
spring-cloud-study
├── springcloud-microservice-api -- 构建公共子模块
├── springcloud-microservice-eureka-7001 -- Eureka集群
├── springcloud-microservice-eureka-7002 -- Eureka集群
├── springcloud-microservice-eureka-7003 -- Eureka集群
├── spring-cloud-microservice-provider-dept-8001 -- 构建服务提供者集群
├── spring-cloud-microservice-provider-dept-8002 -- 构建服务提供者集群
├── spring-cloud-microservice-provider-dept-8003 -- 构建服务提供者集群
├── springcloud-microservice-consumer-dept-80 -- 构建服务消费者 restTemplate
├── springcloud-microservice-consumer-dept-feign -- 构建服务消费者 fegin
├── spring-cloud-microservice-provider-dept-hystrix-8001 -- Hystrix服务熔断
├── springcloud-microservice-consumer-hystrix-dashboard -- Hystrix调用监控 
├── springcloud-microservice-zuul-gateway-9527 -- Zuul路由网关 
├── springcloud-microservice-config-3344 -- config服务端 关联git仓库
├── springcloud-microservice-config-client-3355 -- config客户端
├── springcloud-microservice-config-eureka-client-7001 --从config中加载eureka7001配置
└── springcloud-microservice-config-dept-client-8001 --从config中加载dept8001配置
```
