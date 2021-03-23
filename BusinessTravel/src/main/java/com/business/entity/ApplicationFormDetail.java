package com.business.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 申请单明细
 * </p>
 *
 * @author llf
 * @since 2021-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("application_form_detail")
@ApiModel(value="ApplicationFormDetail对象", description="申请单明细")
public class ApplicationFormDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "申请单明细表主键id")
    @TableId("detail_id")
    private String detailId;

    @ApiModelProperty(value = "申请单id（application_form 表主键id）")
    @TableField("application_id")
    private String applicationId;

    @ApiModelProperty(value = "出差申请  出行人员工号")
    @TableField("traveler_num")
    private Integer travelerNum;

    @ApiModelProperty(value = "出差申请  出行人员姓名")
    @TableField("traveler_name")
    private String travelerName;

    @ApiModelProperty(value = "出差申请  出行人员 联系方式")
    @TableField("travel_mobile")
    private String travelMobile;

    @ApiModelProperty(value = "行程花费金额")
    @TableField("travel_money")
    private BigDecimal travelMoney;

    @ApiModelProperty(value = "申请明细创建时间")
    @TableField("create_time")
    private String createTime;

    @ApiModelProperty(value = "申请明细修改时间")
    @TableField("modify_time")
    private String modifyTime;

    @ApiModelProperty(value = "员工级别 默认三类")
    @TableField("traveler_level")
    private Integer travelerLevel;

    @ApiModelProperty(value = "费用承担公司id")
    @TableField("cost_company_id")
    private Integer costCompanyId;

    @ApiModelProperty(value = "费用承担公司名称")
    @TableField("cost_company_name")
    private String costCompanyName;

    @ApiModelProperty(value = "费用承担部门id")
    @TableField("cost_department_id")
    private Integer costDepartmentId;

    @ApiModelProperty(value = "费用承担部门名称")
    @TableField("cost_department_name")
    private String costDepartmentName;

    @ApiModelProperty(value = "场次id（与具体部门相关，可不填）")
    @TableField("cost-sessions_id")
    private Integer costSessionsId;

    @ApiModelProperty(value = "场次名称（与具体部门相关，可不填）")
    @TableField("cost_sessions_name")
    private String costSessionsName;

    @ApiModelProperty(value = "产品明细id（与具体部门相关，可不填）")
    @TableField("product_detail_id")
    private Integer productDetailId;

    @ApiModelProperty(value = "产品明细名称（与具体部门相关，可不填）")
    @TableField("product_detail_name")
    private String productDetailName;

    @ApiModelProperty(value = "项目档案id （与具体部门相关，可不填）")
    @TableField("project_files_id")
    private Integer projectFilesId;

    @ApiModelProperty(value = "项目档案名称 （与具体部门相关，可不填）")
    @TableField("project_files_name")
    private String projectFilesName;


    public static final String DETAIL_ID = "detail_id";

    public static final String APPLICATION_ID = "application_id";

    public static final String TRAVELER_NUM = "traveler_num";

    public static final String TRAVELER_NAME = "traveler_name";

    public static final String TRAVEL_MOBILE = "travel_mobile";

    public static final String TRAVEL_MONEY = "travel_money";

    public static final String CREATE_TIME = "create_time";

    public static final String MODIFY_TIME = "modify_time";

    public static final String TRAVELER_LEVEL = "traveler_level";

    public static final String COST_COMPANY_ID = "cost_company_id";

    public static final String COST_COMPANY_NAME = "cost_company_name";

    public static final String COST_DEPARTMENT_ID = "cost_department_id";

    public static final String COST_DEPARTMENT_NAME = "cost_department_name";

    public static final String COSTSESSIONS_ID = "cost_sessions_id";

    public static final String COST_SESSIONS_NAME = "cost_sessions_name";

    public static final String PRODUCT_DETAIL_ID = "product_detail_id";

    public static final String PRODUCT_DETAIL_NAME = "product_detail_name";

    public static final String PROJECT_FILES_ID = "project_files_id";

    public static final String PROJECT_FILES_NAME = "project_files_name";

}
