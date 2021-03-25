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
            travelOrder.setOrderAmount(BigDecimal.valueOf(random.nextInt(100)));
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
        travelOrder.setOrderAmount(BigDecimal.valueOf(random.nextInt(100)));
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

    @Override
    public void testQuery() {
        //根据id查询
        //TravelOrder travelOrder = travelOrderMapper.selectById("534225851186339840");
        //System.out.println(travelOrder);

        //根据id批量查询
        //List<String> idList = new ArrayList<>();
        //idList.add("534225851311644672");
        //idList.add("534225851333271552");
        //List<TravelOrder> orderList = travelOrderMapper.selectBatchIds(idList);
        //orderList.forEach(order -> System.out.println(order));

        ////查询字段值为 XX 的实体集合
        //Map map = new HashMap();
        //map.put("create_time" , "2021-03-23 14:29:39");
        //List<TravelOrder> list = travelOrderMapper.selectByMap(map);

        //分页查询
        //Page page = new Page(1, 20);
        //QueryWrapper<TravelOrder> queryWrapper = new QueryWrapper<>();
        //查询创建时间为2021-03-23 14:29:39的数据
        //queryWrapper.eq("create_time" , "2021-03-23 14:29:39");
        //Page selectPage = travelOrderMapper.selectPage(page, queryWrapper);
        //System.out.println(selectPage.getTotal());
        //System.out.println(selectPage.getSize());
        //System.out.println(selectPage.getRecords());

        //查询符合条件的数量
        //Integer integer = travelOrderMapper.selectCount(queryWrapper);
        //System.out.println(integer);

        //查询创建时间不为2021-03-23 14:29:39的数据
        //queryWrapper.ne("create_time" , "2021-03-23 14:29:39");
        //List<TravelOrder> orders = travelOrderMapper.selectList(queryWrapper);
        //System.out.println("时间不等于2021-03-23 14:29:39 的数据：" + orders);

        //查询金额大于90的数据
        // 此外还有 ge:大于等于    lt:小于   le:小于等于
        //queryWrapper.gt("order_amount", 90);
        //List<TravelOrder> orders1 = travelOrderMapper.selectList(queryWrapper);
        //System.out.println("金额大于90的数据：" + orders1);

        //查询金额在30 到 50之间的数据
        //queryWrapper.between("order_amount", 30, 50);
        //List<TravelOrder> orders2 = travelOrderMapper.selectList(queryWrapper);
        //System.out.println(orders2);




        //lambda表达式查询数据
        //travelOrderMapper.selectList(new QueryWrapper<TravelOrder>().lambda().eq(TravelOrder::getApplicationId, 131342423L));


        //多参数可为空查询(实体类接收前端参数，map形式传参SQL查询)
        //TravelOrder travelOrder = new TravelOrder();
        //travelOrder.setOrderId(534225852389580800L);
        //travelOrder.setOnTheWayOrder(534225852390367233L);
        //travelOrder.setApplicationId(534225852390105090L);
        //Map<String, Object> paramMap = new HashMap<>(5);
        //paramMap.put("order_id", travelOrder.getOrderId());
        //paramMap.put("flight_type", travelOrder.getFlightType());
        //paramMap.put("xxx", travelOrder.getFlightType());
        //paramMap.put("xxx", travelOrder.getFlightType());
        //paramMap.put("xxx", travelOrder.getFlightType());
        //List<TravelOrder> orders = travelOrderMapper.selectList(new QueryWrapper<TravelOrder>().allEq(paramMap, false));

        //查询时间段内数据
        //List<TravelOrder> orders = travelOrderMapper.selectList(new QueryWrapper<TravelOrder>().between("create_time", "2021-03-23 00:00:00", "2021-03-23 23:59:59"));

        //查询时间段内数据
        //List<TravelOrder> orders = travelOrderMapper.selectList(new QueryWrapper<TravelOrder>().le("create_time", "2021-03-24").ge("create_time", "2021-03-23"));

       //Like左匹配查询
        //List<TravelOrder> orders = travelOrderMapper.selectList(query().getWrapper().likeLeft("order_id", 53422));

        //不确定字段查询
        //List<TravelOrder> orders = travelOrderMapper.selectList(
        //                                                    query().getWrapper().like("order_id", 5128).
        //                                                                    or().like("application_id", 5128));
        //System.out.println(orders);
    }
}
