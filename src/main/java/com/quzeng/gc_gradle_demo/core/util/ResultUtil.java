package com.quzeng.gc_gradle_demo.core.util;

import com.quzeng.gc_gradle_demo.bean.VO.ResultVO;

public class ResultUtil {
    /**
     * 请求成功返回
     * @param object
     * @return
     */
    public static ResultVO success(Object object){
        ResultVO msg=new ResultVO();
        msg.setCode(200);
        msg.setDescription("请求成功");
        msg.setData(object);
        return msg;
    }
    public static ResultVO success(){
        return success(null);
    }
 
    public static ResultVO error(Integer code, String description){
        ResultVO msg=new ResultVO();
        msg.setCode(code);
        msg.setDescription(description);
        return msg;
    }
 
 
}
