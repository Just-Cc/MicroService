package com.cc.usermanage.controller;

import com.cc.api.feign.ApiItemFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("prov")
@RestController
public class RestClientController {

    @Autowired
    ApiItemFeign client;

    @RequestMapping(value = "/feign/queryItem",method = RequestMethod.GET)
    public String feignClient(String id){

        System.out.println("我进来了");
        System.out.println("我进来了");
        System.out.println("我进来了");

        String result = client.queryItem(id);
        return result;
    }
}
