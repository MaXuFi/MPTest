package com.business.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 商旅订单
 * </p>
 *
 * @author llf
 * @since 2021-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("travel_order")
@ApiModel(value="TravelOrder对象", description="商旅订单")
public class TravelOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单id （聚爱）")
    @TableId("order_id")
    private Long orderId;

    @NotNull(message = "订单号Id不能为空")
    @ApiModelProperty(value = "订单id（在路上）")
    @TableField("on_the_way_order")
    private Long onTheWayOrder;

    @ApiModelProperty(value = "行程单id （行程单：通过审批的申请单）")
    @TableField("application_id")
    private Long applicationId;

    @ApiModelProperty(value = "订单创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "订单修改时间")
    @TableField("modify_time")
    private Date modifyTime;

    @ApiModelProperty(value = "订单状态，默认为0 （0:未结束  1：已结束   2：已退款）")
    @TableField("order_state")
    private Integer orderState;

    @ApiModelProperty(value = "订单是否结算 默认为0 （0：未结算  1：已结算）")
    @TableField("settle_state")
    private Integer settleState;

    @ApiModelProperty(value = "订单金额（如果是退款订单，此值为服务费金额）")
    @TableField("order_amount")
    private BigDecimal orderAmount;

    @ApiModelProperty(value = "订单使用人工号（员工工号）")
    @TableField("order_user_num")
    private Integer orderUserNum;

    @ApiModelProperty(value = "订单使用人姓名（员工姓名）")
    @TableField("order_user_name")
    private String orderUserName;

    @ApiModelProperty(value = "订单使用人联系方式（员工电话）")
    @TableField("order_user_mobile")
    private String orderUserMobile;

    @ApiModelProperty(value = "订单类型 默认为0 （0:机票   1:酒店）")
    @TableField("order_type")
    private Integer orderType;

    @ApiModelProperty(value = "航班号或者酒店名称")
    @TableField("flight_or_hotel")
    private String flightOrHotel;

    @ApiModelProperty(value = "酒店入住地名称 或者 航班出发地名称")
    @TableField("travel_departure_name")
    private String travelDepartureName;

    @ApiModelProperty(value = "酒店入住地id 或者 航班出发地id")
    @TableField("travel_departure_id")
    private Integer travelDepartureId;

    @ApiModelProperty(value = "航班目的地 id （酒店订单可不填）")
    @TableField("travel_destination_id")
    private Integer travelDestinationId;

    @ApiModelProperty(value = "航班目的地名称 （酒店订单可不填）")
    @TableField("travel_destination_name")
    private String travelDestinationName;

    @ApiModelProperty(value = "航班出发时间  或者 酒店入住日期")
    @TableField("travel_departure_time")
    private Date travelDepartureTime;

    @ApiModelProperty(value = "航班到达时间 或者 酒店离店日期")
    @TableField("travel_destination_time")
    private Date travelDestinationTime;

    @ApiModelProperty(value = "酒店入住时长")
    @TableField("hotel_dates")
    private Integer hotelDates;

    @ApiModelProperty(value = "飞机舱位类型 酒店订单可不填 （0:经济舱  1:商务舱  2:头等舱）")
    @TableField("flight_type")
    private Integer flightType;

    @ApiModelProperty(value = "酒店客房类型 机票订单可不填 （0:单人间  1:大床房  2:双人间/标准间 3:三人间 4:套房(豪华套间/总统套间) 5:主题客房(时尚主题/环境主题/特殊群体)）")
    @TableField("hotel_type")
    private Integer hotelType;


    public static final String ORDER_ID = "order_id";

    public static final String ON_THE_WAY_ORDER = "on_the_way_order";

    public static final String APPLICATION_ID = "application_id";

    public static final String CREATE_TIME = "create_time";

    public static final String MODIFY_TIME = "modify_time";

    public static final String ORDER_STATE = "order_state";

    public static final String SETTLE_STATE = "settle_state";

    public static final String ORDER_AMOUNT = "order_amount";

    public static final String ORDER_USER_NUM = "order_user_num";

    public static final String ORDER_USER_NAME = "order_user_name";

    public static final String ORDER_USER_MOBILE = "order_user_mobile";

    public static final String ORDER_TYPE = "order_type";

    public static final String FLIGHT_OR_HOTEL = "flight_or_hotel";

    public static final String TRAVEL_DEPARTURE_NAME = "travel_departure_name";

    public static final String TRAVEL_DEPARTURE_ID = "travel_departure_id";

    public static final String TRAVEL_DESTINATION_ID = "travel_destination_id";

    public static final String TRAVEL_DESTINATION_NAME = "travel_destination_name";

    public static final String TRAVEL_DEPARTURE_TIME = "travel_departure_time";

    public static final String TRAVEL_DESTINATION_TIME = "travel_destination_time";

    public static final String HOTEL_DATES = "hotel_dates";

    public static final String FLIGHT_TYPE = "flight_type";

    public static final String HOTEL_TYPE = "hotel_type";

}
