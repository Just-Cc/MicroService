package com.cc.itemmanage.mapper;

import com.cc.common.pojo.Item;
import org.springframework.stereotype.Component;

@Component
public interface ItemMapper {

    Item queryItem(Integer id);

    void addItem(Item item);

    void updateItem(Item item);

    void deleteItem(Integer id);

    Item likeItem(String value);
}
