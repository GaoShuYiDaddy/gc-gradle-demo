package com.quzeng.gc_gradle_demo.bean.VO;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Auther: GC
 * @Date: 2018/7/14 14:35
 * @Description:
 */
@Data
public class GetPaymentListVO {

    private List list;

    private BigDecimal income;

    private Integer count;

}
