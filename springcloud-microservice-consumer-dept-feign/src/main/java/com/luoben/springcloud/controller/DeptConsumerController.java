package com.luoben.springcloud.controller;

import com.luoben.springcloud.client.DeptClient;
import com.luoben.springcloud.entities.DeptEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptConsumerController {

    @Resource
    private DeptClient deptClient;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add( DeptEntity deptEntity){

        return  deptClient.addDept(deptEntity);
    }

    @RequestMapping("/consumer/dept/get/{deptNo}")
    public DeptEntity findById(@PathVariable("deptNo") Long deptNo){
        return  deptClient.findById(deptNo);
    }

    @RequestMapping("/consumer/dept/list")
    public List<DeptEntity> list(){
        return  deptClient.list();
    }

}
