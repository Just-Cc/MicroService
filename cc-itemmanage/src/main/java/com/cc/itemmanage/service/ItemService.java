package com.cc.itemmanage.service;

import com.cc.common.pojo.Item;

public interface ItemService {

    String queryItem(String id);

    String addItem(Item item);

    String updateItem(Item item);

    String deleteItem(String id);
}
