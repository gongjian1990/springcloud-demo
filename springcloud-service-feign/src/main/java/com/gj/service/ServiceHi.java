package com.gj.service;

import com.gj.callback.ServiceCallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = ServiceCallback.class)
public interface ServiceHi {

    @GetMapping(value = "/hello")
    String sayHi(@RequestParam(value = "name") String name);
}
