package com.business.controller;


import com.business.service.ITravelOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 商旅订单 前端控制器
 * </p>
 *
 * @author llf
 * @since 2021-03-22
 */
@RestController
@RequestMapping("/travel-order")
public class TravelOrderController {

    @Autowired
    private ITravelOrderService travelOrderService;

    /**
     * @Description: 测试新增单条数据
     * @Author: llf
     * @Date: 2021/3/23 11:31
     **/
    @PostMapping("/testInsert")
    public void testInsert(){
        travelOrderService.testInsert();
    }

    /**
     * @Description: 测试批量新增数据
     * @Author: llf
     * @Date: 2021/3/23 11:31
     **/
    @PostMapping("/testBatchInsert")
    public void testBatchInsert(){
        travelOrderService.testBatchInsert();
    }

    /**
     * @Description: 测试删除数据
     * @Author: llf
     * @Date: 2021/3/23 11:31
     **/
    @PostMapping("/testDelete")
    public void testDelete(){
        travelOrderService.removeById("534185043888365568");
    }

    /**
     * @Description: 测试批量删除数据
     * @Author: llf
     * @Date: 2021/3/23 11:31
     **/
    @PostMapping("/testBatchDelete")
    public void testBatchDelete(){
        List<String> idLis = new ArrayList<>();
        idLis.add("534180736640540672");
        idLis.add("534180737634328576");
        travelOrderService.removeByIds(idLis);
    }

}
