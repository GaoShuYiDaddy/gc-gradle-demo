package com.quzeng.gc_gradle_demo.bean.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @Auther: GC
 * @Date: 2018/7/12 09:16
 * @Description:
 */
@Data
@ApiModel(value = "SaveOrderForm",description = "新增完成订单信息参数")
public class SaveOrderForm {


/*  @ApiModelProperty()用于方法，字段； 表示对model属性的说明或者数据操作更改
    value–字段说明
    name–重写属性名字
    dataType–重写属性类型
    required–是否必填
    example–举例说明
    hidden–隐藏*/
    @NotNull(message = "商户ID不得为空")
    @ApiModelProperty(value = "商户编号",dataType = "Integer",required = true,example = "500359")
    private Long vendorId;

    @NotNull(message = "店铺ID不得为空")
    @ApiModelProperty(value = "店铺编号",dataType = "Integer",required = true,example = "300589")
    private Long shopId;

    @NotNull(message = "订单ID不得为空")
    @ApiModelProperty(value = "订单编号",dataType = "Integer",required = true,example = "201903054")
    private Long orderId;

    @NotNull(message = "用户ID不得为空")
    @ApiModelProperty(value = "用户编号",dataType = "Integer",required = true,example = "8009856")
    private Long userId;

    @NotNull(message = "订单金额不得为空")
    @ApiModelProperty(value = "订单金额",dataType = "number",required = true,example = "50.50")
    private BigDecimal amount;

}
