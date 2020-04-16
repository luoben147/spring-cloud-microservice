package com.luoben.springcloud.controller;

import com.luoben.springcloud.entities.DeptEntity;
import com.luoben.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;


    @Autowired
    private DiscoveryClient discoveryClient;


    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean addDept(@RequestBody DeptEntity deptEntity) {
        return   deptService.addDept(deptEntity);
    }

    @RequestMapping(value = "/dept/get/{deptNo}",method = RequestMethod.GET)
    public DeptEntity getById(@PathVariable("deptNo") Long deptNo) {
        return  deptService.findById(deptNo);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<DeptEntity> list() {
        return deptService.findAll();
    }


    /**
     * 增加自己服务描述的接口
     * @return
     */
    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public List<ServiceInstance> discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("总共有"+list.size()+"个微服务");
        System.out.println("*****"+list);

        //查询SPRINGCLOUD-MICROSERVICE-DEPT 服务
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-MICROSERVICE-DEPT");

        //打印SPRINGCLOUD-MICROSERVICE-DEPT服务信息
        for (ServiceInstance element :instances){
            System.out.println(element.getServiceId());
            System.out.println(element.getHost());
            System.out.println(element.getPort());
            System.out.println(element.getUri());
        }
        return instances;

    }

}
