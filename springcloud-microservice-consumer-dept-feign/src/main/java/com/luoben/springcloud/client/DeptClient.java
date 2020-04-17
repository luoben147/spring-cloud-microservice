package com.luoben.springcloud.client;

import com.luoben.springcloud.service.DeptServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 服务降级在消费方 服务熔断在服务提供方
 * 根据已有的DeptServiceApi接口新建一个实现了FallbackFactory接口的类DeptClientFallBackFactory
 * fallbackFactory：集成Hystrix服务降级，还要记得在depte-feign模块 yml开启hystrix（因为fallbackFactory是在注解@FeignClient使用的）
 *
 * 当服务出现故障时，在消费方自己准备一个本地的fallback，返回一个缺省值
 */
@FeignClient(value = "SPRINGCLOUD-MICROSERVICE-DEPT",fallbackFactory = DeptClientFallbackFactory.class)
public interface DeptClient extends DeptServiceApi {
}
