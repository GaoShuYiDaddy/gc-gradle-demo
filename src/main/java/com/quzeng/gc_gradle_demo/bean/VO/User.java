package com.quzeng.gc_gradle_demo.bean.VO;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(value = "响应数据用户信息",description = "用户信息")
@Builder
public class User {

    @ApiModelProperty("编码")
    private Long id;

    @ApiModelProperty("用户编码")
    private Long userId;

    @ApiModelProperty("用户姓名")
    private String name;

}
