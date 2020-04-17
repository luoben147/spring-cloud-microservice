package com.luoben.springcloud.service;


import com.luoben.springcloud.entities.DeptEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface DeptServiceApi {

   @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
   public boolean addDept(DeptEntity deptEntity);

   @RequestMapping(value = "/dept/get/{deptNo}",method = RequestMethod.GET)
   public DeptEntity findById(@PathVariable("deptNo") Long deptNo);

   @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
   public List<DeptEntity> list();

}
