package com.luoben.springcloud.service.impl;

import com.luoben.springcloud.dao.DeptDao;
import com.luoben.springcloud.entities.DeptEntity;
import com.luoben.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;


    @Override
    public boolean addDept(DeptEntity deptEntity) {
        return deptDao.addDept(deptEntity);
    }

    @Override
    public DeptEntity findById(Long deptNo) {
        return deptDao.findById(deptNo);
    }

    @Override
    public List<DeptEntity> findAll() {
        return deptDao.findAll();
    }
}
