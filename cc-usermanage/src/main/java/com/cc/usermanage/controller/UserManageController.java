package com.cc.usermanage.controller;

import com.cc.common.pojo.User;
import com.cc.itemmanage.feign.ItemFeign;
import com.cc.usermanage.service.UserManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserManageController {

    Logger log = LoggerFactory.getLogger(UserManageController.class);

    @Autowired
    UserManageService userManageService;
    @Autowired
    private ItemFeign client;

    @GetMapping("queryUser")
    public String queryUser(String id) {
        log.info("当前查询的id为：" + id);
        return userManageService.queryUser(id);
    }

    @PostMapping("addUser")
    public String addUser(User user) {
        log.info("执行addUser");

        return userManageService.addUser(user);
    }

    @PostMapping("updateUser")
    public String updateUser(User user) {
        log.info("执行updateUser");
        return userManageService.updateUser(user);
    }

    @DeleteMapping("deleteUser")
    public String deleteUser(String id) {
        log.info("当前删除的id为：" + id);
        return userManageService.deleteUser(id);
    }

    @GetMapping("hahaha")
    public String hahaha(String id){

        return client.queryItem(id);
    }
}
