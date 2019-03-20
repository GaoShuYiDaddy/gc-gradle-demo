package com.quzeng.gc_gradle_demo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 全局异常处理
 * @author GC
 * @date 2018年6月29日
 */
//@ControllerAdvice
public class GlobalExceptionHandler {

/*    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    private Map<String,Object> exceptionHandler(HttpServletRequest request, HttpServletResponse response, Exception e){
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",false);
        modelMap.put("errMsg",e.getMessage());
        return  modelMap;
    }*/


    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //@ExceptionHandler(value = {RuntimeException.class})
    //@ResponseBody
/*    public Result exceptionHandler(Exception e){
        log.error(e.toString());
        return Result.error(e.getMessage());
    }*/

}
