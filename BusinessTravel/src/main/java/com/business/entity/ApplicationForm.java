package com.business.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Blob;

/**
 * <p>
 * 申请单表
 * </p>
 *
 * @author llf
 * @since 2021-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("application_form")
@ApiModel(value="ApplicationForm对象", description="申请单表")
public class ApplicationForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "申请单号")
    @TableId("application_id")
    private String applicationId;

    @ApiModelProperty(value = "申请人姓名")
    @TableField("applicant")
    private String applicant;

    @ApiModelProperty(value = "申请人工号")
    @TableField("applicant_num")
    private Integer applicantNum;

    @ApiModelProperty(value = "申请时间")
    @TableField("application_time")
    private String applicationTime;

    @ApiModelProperty(value = "修改时间")
    @TableField("modify_time")
    private String modifyTime;

    @ApiModelProperty(value = "申请单类型  1:出差申请   2:招待申请")
    @TableField("application_type")
    private Integer applicationType;

    @ApiModelProperty(value = "出发地code值")
    @TableField("departure_code")
    private Integer departureCode;

    @ApiModelProperty(value = "出发地名称")
    @TableField("departure_name")
    private String departureName;

    @ApiModelProperty(value = "目的地code值")
    @TableField("destination_code")
    private Integer destinationCode;

    @ApiModelProperty(value = "目的地名称")
    @TableField("destination_name")
    private String destinationName;

    @ApiModelProperty(value = "行程开始日期")
    @TableField("start_time")
    private String startTime;

    @ApiModelProperty(value = "行程结束日期")
    @TableField("end_time")
    private String endTime;

    @ApiModelProperty(value = "出行天数")
    @TableField("travel_days")
    private Integer travelDays;

    @ApiModelProperty(value = "业务事项（申请理由）")
    @TableField("application_reason")
    private String applicationReason;

    @ApiModelProperty(value = "审批人姓名")
    @TableField("approval")
    private String approval;

    @ApiModelProperty(value = "审批人工号")
    @TableField("approval_num")
    private Integer approvalNum;

    @ApiModelProperty(value = "申请备注")
    @TableField("application_remark")
    private String applicationRemark;

    @ApiModelProperty(value = "申请附件")
    @TableField("application_enclosure")
    private Blob applicationEnclosure;

    @ApiModelProperty(value = "费用归属公司id（招待申请单需要，出差申请单可不填）")
    @TableField("cost_company_id")
    private Integer costCompanyId;

    @ApiModelProperty(value = "费用归属公司名称 (招待申请单需要，出差申请单可不填)")
    @TableField("cost_company_name")
    private String costCompanyName;

    @ApiModelProperty(value = "费用归属部门id(招待申请单需要，出差申请单可不填)")
    @TableField("cost_department_id")
    private Integer costDepartmentId;

    @ApiModelProperty(value = "费用归属部门名称 （招待申请单需要，出差申请单可不填）")
    @TableField("cost_department_name")
    private String costDepartmentName;

    @ApiModelProperty(value = "招待日期 （招待申请单需要，出差申请单可不填）")
    @TableField("entertain_time")
    private String entertainTime;

    @ApiModelProperty(value = "招待人数 （招待申请单需要， 出差申请可不填）")
    @TableField("entertain_num")
    private Integer entertainNum;

    @ApiModelProperty(value = "招待外部人员信息 （招待申请单需要，出差申请单可不填）")
    @TableField("entertain_person_info")
    private String entertainPersonInfo;

    @ApiModelProperty(value = "招待级别 (招待申请单需要，出差申请单可不填)")
    @TableField("entertain_level")
    private Integer entertainLevel;

    @ApiModelProperty(value = "场次id (招待申请单需要，与具体部门相关，出差申请可不填)")
    @TableField("cost_sessions_id")
    private Integer costSessionsId;

    @ApiModelProperty(value = "场次名称（招待申请单需要，与具体部门相关， 出差申请可不填）")
    @TableField("cost_sessions_name")
    private String costSessionsName;

    @ApiModelProperty(value = "产品明细id (招待申请单需要，与具体部门相关，出差申请可不填)")
    @TableField("product_detail_id")
    private Integer productDetailId;

    @ApiModelProperty(value = "产品明细名称(招待申请单需要，与具体部门相关，出差申请可不填)")
    @TableField("product_detail_name")
    private String productDetailName;

    @ApiModelProperty(value = "项目档案id (招待申请单需要，与具体部门相关，出差申请可不填)")
    @TableField("project_files_id")
    private Integer projectFilesId;

    @ApiModelProperty(value = "项目档案名称 (招待申请单需要，与具体部门相关，出差申请可不填)")
    @TableField("project_files_name")
    private String projectFilesName;

    @ApiModelProperty(value = "申请单审批状态 默认为0 （0:待审批  1:审批通过  2：审批驳回）")
    @TableField("approval_state")
    private Integer approvalState;

    @ApiModelProperty(value = "驳回理由（申请单被OA驳回）")
    @TableField("rejection_reason")
    private String rejectionReason;

    @ApiModelProperty(value = "申请单状态 默认为0 （0：未开始  1:已结束）")
    @TableField("application_state")
    private Integer applicationState;


    public static final String APPLICATION_ID = "application_id";

    public static final String APPLICANT = "applicant";

    public static final String APPLICANT_NUM = "applicant_num";

    public static final String APPLICATION_TIME = "application_time";

    public static final String MODIFY_TIME = "modify_time";

    public static final String APPLICATION_TYPE = "application_type";

    public static final String DEPARTURE_CODE = "departure_code";

    public static final String DEPARTURE_NAME = "departure_name";

    public static final String DESTINATION_CODE = "destination_code";

    public static final String DESTINATION_NAME = "destination_name";

    public static final String START_TIME = "start_time";

    public static final String END_TIME = "end_time";

    public static final String TRAVEL_DAYS = "travel_days";

    public static final String APPLICATION_REASON = "application_reason";

    public static final String APPROVAL = "approval";

    public static final String APPROVAL_NUM = "approval_num";

    public static final String APPLICATION_REMARK = "application_remark";

    public static final String APPLICATION_ENCLOSURE = "application_enclosure";

    public static final String COST_COMPANY_ID = "cost_company_id";

    public static final String COST_COMPANY_NAME = "cost_company_name";

    public static final String COST_DEPARTMENT_ID = "cost_department_id";

    public static final String COST_DEPARTMENT_NAME = "cost_department_name";

    public static final String ENTERTAIN_TIME = "entertain_time";

    public static final String ENTERTAIN_NUM = "entertain_num";

    public static final String ENTERTAIN_PERSON_INFO = "entertain_person_info";

    public static final String ENTERTAIN_LEVEL = "entertain_level";

    public static final String COST_SESSIONS_ID = "cost_sessions_id";

    public static final String COST_SESSIONS_NAME = "cost_sessions_name";

    public static final String PRODUCT_DETAIL_ID = "product_detail_id";

    public static final String PRODUCT_DETAIL_NAME = "product_detail_name";

    public static final String PROJECT_FILES_ID = "project_files_id";

    public static final String PROJECT_FILES_NAME = "project_files_name";

    public static final String APPROVAL_STATE = "approval_state";

    public static final String REJECTION_REASON = "rejection_reason";

    public static final String APPLICATION_STATE = "application_state";

}
