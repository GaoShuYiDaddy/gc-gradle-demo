package com.quzeng.gc_gradle_demo.bean.form;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @Auther: GC
 * @Date: 2018/7/12 20:34
 * @Description:
 */
@Data
public class TimeVendorShopIdForm {

    @Pattern(regexp = "^([1-5]|[1-9][0-9]{3}-(0[1-9]|1[0-2])-([0-2][1-9]|3[0-1]))$  ", message = "查询日期不符合规范")
    private String timeType = "3";

    @NotNull(message = "商户ID不得为空")
    private Long vendorId;

    @NotNull(message = "店铺ID不得为空")
    private Long shopId;

}
