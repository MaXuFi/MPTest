package com.business.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.business.entity.TravelOrder;
import com.business.service.ITravelOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    /**
     * @Description: 根据字段值删除
     * @Author: llf
     * @Date: 2021/3/23 11:31
     **/
    @PostMapping("/testMapDelete")
    public void testMapDelete(){
        Map<String, Object> hashMap= new HashMap<>(1);
        hashMap.put("create_time", "2021-03-23 11:30:23");

        travelOrderService.removeByMap(hashMap);
    }

    /**
     * @Description: 根据queryWrapper删除
     * @Author: llf
     * @Date: 2021/3/23 11:31
     **/
    @PostMapping("/testWrapperDelete")
    public void testWrapperDelete(){
        //queryWrapper的具体使用细节在查询功能中
        QueryWrapper queryWrapper = new QueryWrapper();
        travelOrderService.remove(queryWrapper);
    }

    /**
     * @Description: 更新
     * @Author: llf
     * @Date: 2021/3/23 11:31
     **/
    @PostMapping("/testUpdate")
    public void testUpdate(){
        TravelOrder travelOrder = new TravelOrder();
        travelOrder.setOrderId(534225851186339840L);
        travelOrder.setOrderUserName("测试更新");
        travelOrderService.updateById(travelOrder);
    }

    /**
     * @Description: 测试saveOrUpdate
     * @Author: llf
     * @Date: 2021/3/23 11:31
     **/
    @PostMapping("/testSaveOrUpdate")
    public void testSaveOrUpdate(){
        TravelOrder travelOrder = new TravelOrder();
        travelOrder.setOrderId(534225851186339840L);
        travelOrder.setOrderUserName("要么更新要么删除");
        travelOrderService.saveOrUpdate(travelOrder);
    }

    /**
     * @Description: 测试查询
     * @Author: llf
     * @Date: 2021/3/23 11:31
     **/
    @PostMapping("/testQuery")
    public void testQuery(){
        travelOrderService.testQuery();
    }


}
