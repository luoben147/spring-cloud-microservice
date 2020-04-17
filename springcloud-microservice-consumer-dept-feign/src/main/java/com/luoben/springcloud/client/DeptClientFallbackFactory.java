package com.luoben.springcloud.client;

import com.luoben.springcloud.entities.DeptEntity;
import com.luoben.springcloud.service.DeptServiceApi;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 统一处理DeptServiceApi这个类中的熔断，主业务与熔断方法解耦
 */
@Component
public class DeptClientFallbackFactory implements FallbackFactory<DeptServiceApi> {
    @Override
    public DeptServiceApi create(Throwable throwable) {
        return new DeptServiceApi() {
            @Override
            public boolean addDept(DeptEntity deptEntity) {
                return false;
            }

            @Override
            public DeptEntity findById(Long deptNo) {
                return new DeptEntity().setDeptNo(deptNo)
                        .setDeptName("该："+deptNo+"没有对应的信息，Consumer客户端提供的降级信息，此刻服务provider已经关闭")
                        .setDbSource("没有这个数据库");
            }

            @Override
            public List<DeptEntity> list() {
                return null;
            }
        };
    }
}
