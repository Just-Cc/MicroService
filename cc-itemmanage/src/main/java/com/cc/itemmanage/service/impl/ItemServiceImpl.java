package com.cc.itemmanage.service.impl;

import com.cc.common.pojo.Item;
import com.cc.itemmanage.mapper.ItemMapper;
import com.cc.itemmanage.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    Logger log = LoggerFactory.getLogger(ItemServiceImpl.class);

    @Autowired
    ItemMapper itemMapper;

    @Override
    public String queryItem(String id) {
        StringBuilder sb = new StringBuilder();
        try {
            Item item = itemMapper.queryItem(Integer.valueOf(id));
            if(null!=item){
                sb.append(item.getItemId()).append(item.getItemName()).append(item.getDescription()).append(item.getMark());
            }
        } catch (Exception e) {
            log.error("查询失败",e);
        }
        return sb.toString();
    }

    @Override
    public String addItem(Item item) {
        String result = "成功";
        try {
            itemMapper.addItem(item);
        } catch (Exception e) {
            result = "失败";
        }
        return result;
    }

    @Override
    public String updateItem(Item item) {
        String result = "成功";
        try {
            itemMapper.updateItem(item);
        } catch (Exception e) {
            result = "失败";
        }
        return result;
    }

    @Override
    public String deleteItem(String id) {
        String result = "成功";
        try {
            itemMapper.deleteItem(Integer.valueOf(id));
        } catch (Exception e) {
            result = "失败";
        }
        return result;
    }
}
