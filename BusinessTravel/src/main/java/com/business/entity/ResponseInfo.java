package com.business.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: 前后端交互，API接口返回实体类
 * @projectName: CentralKitchenSecondPhase
 * @packageName: com.business.entity
 * @author: llf
 * @createTime: 2021/3/22 9:42
 * @version: 1.0
 */
@Data
@AllArgsConstructor
public class ResponseInfo<T> {

    /**
     * @Description: 接口返回code值
     * @Author: llf
     * @Date: 2021/3/22 9:44
     **/
    private int code;

    /**
     * @Description: 接口返回提示信息
     * @Author: llf
     * @Date: 2021/3/22 9:44
     **/
    private String msg;

    /**
     * @Description: 业务请求处理结果
     * @Author: llf
     * @Date: 2021/3/22 9:44
     **/
    private boolean success;

    /**
     * @Description: 接口返回数据体
     * object：数据
     * list：数据集合，无数据时，便于前端处理要返回空集合，不能为null。
     * pageIndex：页码
     * pageSize：页大小
     * totalCount：数据总数
     * @Author: llf
     * @Date: 2021/3/22 9:44
     **/
    private T data;
    
}
