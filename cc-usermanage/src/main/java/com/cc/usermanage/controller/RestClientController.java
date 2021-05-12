package com.cc.usermanage.controller;

import com.cc.itemmanage.feign.ItemFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("item-service-provider")
@RestController
public class RestClientController {

    @Autowired
    ItemFeign client;

    @RequestMapping(value = "/feign/queryItem",method = RequestMethod.GET)
    public String feignClient(String id){

        System.out.println("啊啊");
        System.out.println("啊啊");
        System.out.println("啊啊");

        String result = client.queryItem(id);
        return result;
    }
}
