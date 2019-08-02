package com.gj.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @Version: 0.1.3
 * @description: 服务过滤
 * @author: 赵云
 * @create: 2019-08-02
 */

@Component
public class Myfilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String name = request.getParameter("name");
            if("AAA".equals(name)){

                System.out.println("结果正确");
            }else {
                // 不对其进行路由
                context.setSendZuulResponse(false);
                System.out.println("结果错误");
            }
        return false;
    }
}
