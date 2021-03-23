package com.business.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.business.entity.TravelOrder;

/**
 * <p>
 * 商旅订单 服务类
 * </p>
 *
 * @author llf
 * @since 2021-03-22
 */
public interface ITravelOrderService extends IService<TravelOrder> {

    void testInsert();
    void testBatchInsert();

}
