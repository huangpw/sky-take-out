package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 员工分页查询条件
 * @author AlbertHPW
 */
@Data
@ApiModel("员工分页查询条件")
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    @ApiModelProperty("员工姓名")
    private String name;

    //页码
    @ApiModelProperty("页码")
    private int page;

    //每页显示记录数
    @ApiModelProperty("每页显示记录数")
    private int pageSize;

}
