package com.luoben.springcloud.client;

import com.luoben.springcloud.service.DeptServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("springcloud-microservice-dept")
public interface DeptClient extends DeptServiceApi {
}
