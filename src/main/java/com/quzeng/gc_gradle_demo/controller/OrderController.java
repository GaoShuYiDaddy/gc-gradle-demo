package com.quzeng.gc_gradle_demo.controller;


import com.quzeng.gc_gradle_demo.bean.VO.GetPaymentListVO;
import com.quzeng.gc_gradle_demo.bean.VO.Response;
import com.quzeng.gc_gradle_demo.bean.VO.ResultVO;
import com.quzeng.gc_gradle_demo.bean.VO.User;
import com.quzeng.gc_gradle_demo.bean.enums.ExceptionCodeEnum;
import com.quzeng.gc_gradle_demo.bean.form.SaveOrderForm;
import com.quzeng.gc_gradle_demo.bean.form.TimeVendorShopIdForm;
import com.quzeng.gc_gradle_demo.core.util.ResultUtil;
import com.quzeng.gc_gradle_demo.handler.exception.ParamException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: PaymentController
 * @program: finance
 * @description: 收款接口
 * @author: GC
 * @create: 2018-08-10 15:10
 */
@Api(tags = "Demo接口")
@Slf4j
@Controller
@RequestMapping(value = "/order")
public class OrderController {

    @ApiOperation(value = "获取订单信息", tags = {"获取订单信息copy"}, notes = "注意问题点")
    @GetMapping("/getUserInfo")
    @ResponseBody
    public Response<User> getUserInfo(@RequestParam @ApiParam( value = "编码", required = true) Long id,@RequestParam @ApiParam( value = "用户编码") Long userId) {
        User user = User.builder().id(id).name("刘铁柱").userId(userId).build();
        Response<User> result = new Response<>();
        result.setCode(200);
        result.setDescription("SUCCESS");
        result.setUser(user);
        return result;
    }


    @ApiOperation("新增已完成订单信息")
    @PostMapping(value = "/saveOrder", consumes = "application/json")
    @ResponseBody
    public ResultVO saveOrder(
            @RequestBody @ApiParam(name = "已完成订单信息", value = "传入json格式 ", required = true) SaveOrderForm saveOrderForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("【新增已完成订单信息】参数不正确，GetPaymentListByConditionForm = {}", saveOrderForm);
            throw new ParamException(ExceptionCodeEnum.PARAM_ERROR_CODE.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }
        return ResultUtil.success(saveOrderForm.getOrderId());
    }


    @ApiOperation("新增已完成订单信息")
    @PostMapping(value = "/getIncomeList", consumes = "application/json")
    @ResponseBody
    public ResultVO getIncomeList(
            @RequestBody @ApiParam(name = "微信付款的OPENID:\n {\"openId\": \"24g345fg6unjf456\"}", value = "传入json格式 ", required = true) Map<String, String> map) {
        return ResultUtil.success(map);
    }


    @ApiOperation("查询商户收款统计-C")
    @PostMapping(value = "/info", consumes = "application/json")
    @ResponseBody
    public ResultVO getInfo(
            @RequestBody @ApiParam(name = "商户收款统计", value = "传入json格式", required = true) TimeVendorShopIdForm timeVendorShopIdForm,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("【查询商户收款统计】参数不正确，TimeVendorShopIdForm = {}", timeVendorShopIdForm);
            throw new ParamException(ExceptionCodeEnum.PARAM_ERROR_CODE.getCode(), bindingResult.getFieldError().getDefaultMessage());
        }
        GetPaymentListVO getPaymentListVO = new GetPaymentListVO();
        return ResultUtil.success(getPaymentListVO);
    }

}
