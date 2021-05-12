package com.cc.itemmanage.controller;

import com.cc.common.pojo.Item;
import com.cc.itemmanage.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("item")
public class ItemController{

    Logger log = LoggerFactory.getLogger(ItemController.class);

    @Autowired
    ItemService itemService;

    @GetMapping("queryItem")
    public String queryItem(String id){
        log.info("当前查询的商品id:"+id);
        return itemService.queryItem(id);
    }

    @PostMapping("addItem")
    public String addItem(Item item){

        return itemService.addItem(item);
    }

    @PostMapping("updateItem")
    public String updateItem(Item item){

        return itemService.updateItem(item);
    }

    @DeleteMapping("deleteItem")
    public String deleteItem(String id){

        return itemService.deleteItem(id);
    }
}
