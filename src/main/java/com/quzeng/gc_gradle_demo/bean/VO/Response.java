package com.quzeng.gc_gradle_demo.bean.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "响应数据",description = "响应信息")
@Data
public class Response<User> {
    @ApiModelProperty("响应码")
    private Integer code;
    @ApiModelProperty("响应信息")
    private String description;
    @ApiModelProperty("响应数据")
    private  User user;
}