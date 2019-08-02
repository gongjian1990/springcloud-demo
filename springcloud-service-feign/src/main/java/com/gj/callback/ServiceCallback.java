package com.gj.callback;

import com.gj.service.ServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Version: 0.1.3
 * @description:
 * @author: 赵云
 * @create: 2019-08-02
 */
@Component
public class ServiceCallback implements ServiceHi {
    @Override
    public String sayHi(String name) {
        return "出错了。。。";
    }
}
