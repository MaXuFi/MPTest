package com.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.business.entity.TravelOrder;
import com.business.mapper.TravelOrderMapper;
import com.business.service.ITravelOrderService;
import com.business.util.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
* <p>
    * 商旅订单 服务实现类
    * </p>
*
* @author llf
* @since 2021-03-22
*/
@Repository
public class TravelOrderServiceImpl extends ServiceImpl<TravelOrderMapper, TravelOrder>  implements ITravelOrderService {

    @Autowired
    private TravelOrderMapper travelOrderMapper;
    @Autowired
    SnowflakeIdWorker snowflakeIdWorker;

    @Override
    public void testInsert() {
        //LambdaQueryWrapper lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //Page<TravelOrder> travelOrderPage = new Page<>(1, 20);
        //Page<TravelOrder> travelOrderPage1 = travelOrderMapper.selectPage(travelOrderPage, null);
        for(int i =0 ; i< 50 ; i++){

            TravelOrder travelOrder = new TravelOrder();
            Random random = new Random();
            travelOrder.setOrderId(Long.valueOf(snowflakeIdWorker.nextId()));
            travelOrder.setOnTheWayOrder(Long.valueOf(snowflakeIdWorker.nextId()));
            travelOrder.setApplicationId(Long.valueOf(snowflakeIdWorker.nextId()));
            travelOrder.setCreateTime(new Date());
            travelOrder.setModifyTime(new Date());
            travelOrder.setSettleState(random.nextInt(2));
            travelOrder.setOrderAmount(BigDecimal.TEN);
            travelOrder.setOrderUserNum(111112 + i);
            travelOrder.setOrderUserName("测试" + i);
            travelOrder.setOrderUserMobile("1923498" + i);
            travelOrder.setOrderType(random.nextInt(2));
            travelOrder.setFlightOrHotel("F12398140");
            travelOrder.setTravelDepartureName("郑州");
            travelOrder.setTravelDepartureId(1231);
            travelOrder.setTravelDestinationId(1231+ i);
            travelOrder.setTravelDestinationName("南阳");
            travelOrder.setTravelDepartureTime(new Date());
            travelOrder.setTravelDestinationTime(new Date());
            travelOrder.setHotelDates(2);
            travelOrder.setFlightType(2);
            travelOrder.setHotelType(2);
            save(travelOrder);
        }
    }

    @Override
    public void testBatchInsert() {
        List<TravelOrder> orderList = new ArrayList<>();

        TravelOrder travelOrder = new TravelOrder();
        Random random = new Random();
        travelOrder.setOrderId(Long.valueOf(snowflakeIdWorker.nextId()));
        travelOrder.setOnTheWayOrder(Long.valueOf(snowflakeIdWorker.nextId()));
        travelOrder.setApplicationId(Long.valueOf(snowflakeIdWorker.nextId()));
        travelOrder.setCreateTime(new Date());
        travelOrder.setModifyTime(new Date());
        travelOrder.setSettleState(random.nextInt(2));
        travelOrder.setOrderAmount(BigDecimal.TEN);
        travelOrder.setOrderUserNum(111112 + 00);
        travelOrder.setOrderUserName("批量测试" + 00);
        travelOrder.setOrderUserMobile("1923498" + 00);
        travelOrder.setOrderType(random.nextInt(2));
        travelOrder.setFlightOrHotel("F12398140");
        travelOrder.setTravelDepartureName("郑州");
        travelOrder.setTravelDepartureId(1231);
        travelOrder.setTravelDestinationId(1231+ 00);
        travelOrder.setTravelDestinationName("南阳");
        travelOrder.setTravelDepartureTime(new Date());
        travelOrder.setTravelDestinationTime(new Date());
        travelOrder.setHotelDates(2);
        travelOrder.setFlightType(2);
        travelOrder.setHotelType(2);

        orderList.add(travelOrder);

        TravelOrder travelOrder2 = new TravelOrder();
        Random random2 = new Random();
        travelOrder2.setOrderId(Long.valueOf(snowflakeIdWorker.nextId()));
        travelOrder2.setOnTheWayOrder(Long.valueOf(snowflakeIdWorker.nextId()));
        travelOrder2.setApplicationId(Long.valueOf(snowflakeIdWorker.nextId()));
        travelOrder2.setCreateTime(new Date());
        travelOrder2.setModifyTime(new Date());
        travelOrder2.setSettleState(random.nextInt(2));
        travelOrder2.setOrderAmount(BigDecimal.TEN);
        travelOrder2.setOrderUserNum(111112 + 11);
        travelOrder2.setOrderUserName("批量测试" + 11);
        travelOrder2.setOrderUserMobile("1923498" + 11);
        travelOrder2.setOrderType(random.nextInt(2));
        travelOrder2.setFlightOrHotel("F12398140");
        travelOrder2.setTravelDepartureName("郑州");
        travelOrder2.setTravelDepartureId(1231);
        travelOrder2.setTravelDestinationId(1231+ 11);
        travelOrder2.setTravelDestinationName("南阳");
        travelOrder2.setTravelDepartureTime(new Date());
        travelOrder2.setTravelDestinationTime(new Date());
        travelOrder2.setHotelDates(2);
        travelOrder2.setFlightType(2);
        travelOrder2.setHotelType(2);

        orderList.add(travelOrder2);

        saveBatch(orderList);
    }
}
