package com.gj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Version: 0.1.3
 * @description:
 * @author: 赵云
 * @create: 2019-08-02
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello1")
    public String hello(String name){
        return helloService.hiService(name);
    }
}
