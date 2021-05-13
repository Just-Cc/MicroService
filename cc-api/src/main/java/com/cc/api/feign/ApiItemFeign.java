package com.cc.api.feign;

import com.cc.common.pojo.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "item-service-provider")
public interface ApiItemFeign {

    @RequestMapping(value = "/item/queryItem", method = RequestMethod.GET)
    @ResponseBody
    String queryItem(@RequestParam(value = "id") String id);

    @RequestMapping(value = "/item/addItem", method = RequestMethod.POST)
    @ResponseBody
    String addItem(@RequestParam(value = "item") Item item);

    @RequestMapping(value = "/item/updateItem", method = RequestMethod.POST)
    @ResponseBody
    String updateItem(@RequestParam(value = "item")Item item);

    @RequestMapping(value = "/item/deleteItem", method = RequestMethod.DELETE)
    @ResponseBody
    String deleteItem(@RequestParam(value = "id")String id);
}
