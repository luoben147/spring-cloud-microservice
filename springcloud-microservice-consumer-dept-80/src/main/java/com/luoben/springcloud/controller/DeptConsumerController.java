package com.luoben.springcloud.controller;

import com.luoben.springcloud.entities.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    //private static final String REST_URL_PREFIX="http://localhost:8001";

    /**
     * 注册再EurekaServer中的微服务名称
     */
    private static final String REST_URL_PREFIX="http://SPRINGCLOUD-MICROSERVICE-DEPT";

    /**
     * 使用restTemplate访问restful接口
     * 三个参数：url,requestMap ResponseBean.class
     * REST请求地址，请求参数，HTTP响应转换被转换成的对象类型。
     */

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/consumer/dept/add")
    public boolean add( DeptEntity deptEntity){

        return  restTemplate.postForObject(
                    REST_URL_PREFIX+"/dept/add",
                    deptEntity,
                    Boolean.class);
    }

    @RequestMapping("/consumer/dept/get/{deptNo}")
    public DeptEntity findById(@PathVariable("deptNo") Long deptNo){
        return  restTemplate.getForObject(
                REST_URL_PREFIX+"/dept/get/"+deptNo,
                DeptEntity.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<DeptEntity> list(){
        return  restTemplate.getForObject(
                REST_URL_PREFIX+"/dept/list",
                List.class);
    }

    /**
     * 测试服务提供者的服务发现 @EnableDiscoveryClient
     * 消费端可以调用服务发现 获取服务提供者的服务信息
     * @return
     */
    @RequestMapping(value = "/consumer/dept/discovery")
    public List<ServiceInstance> discovery(){
        return  restTemplate.getForObject(
                REST_URL_PREFIX+"/dept/discovery",
                List.class);
    }


}
