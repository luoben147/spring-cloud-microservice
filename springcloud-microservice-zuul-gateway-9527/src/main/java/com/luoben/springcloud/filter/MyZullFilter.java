package com.luoben.springcloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class MyZullFilter extends ZuulFilter {

    /**
     * 指定过滤器类型：
     * pre ： 请求在被路由之前执行
     * route : 在路由请求时调用
     * post :  在route和 error之后调用
     * error ： 处理请求时发生错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 执行顺序，返回值越小，优先级越高
     * @return
     */
    @Override
    public int filterOrder() {
        return 10;
    }

    /**
     * 是否拦截
     * return true 才会执行run方法
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 执行拦截的逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        /*
        //zuul网关的上下文对象
        RequestContext context = RequestContext.getCurrentContext();
        //获取请求对象
        HttpServletRequest request = context.getRequest();
        //获取请求参数
        String xxx = request.getParameter("xxx");

        if(StringUtils.isEmpty(xxx)){
            //不再转发请求
            context.setSendZuulResponse(false);
            //设置响应码
            context.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
            //设置响应信息
            context.setResponseBody("request error");
        }
        */
        return null;   //什么都不做
    }
}
