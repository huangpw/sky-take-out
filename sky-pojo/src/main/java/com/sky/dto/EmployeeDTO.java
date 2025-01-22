package com.sky.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("员工DTO")
public class EmployeeDTO implements Serializable {

    //主键
    @ApiModelProperty("主键Id")
    private Long id;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("姓名")
    private String name;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("性别 0 女 1 男")
    private String sex;

    @ApiModelProperty("身份证号")
    private String idNumber;

}
