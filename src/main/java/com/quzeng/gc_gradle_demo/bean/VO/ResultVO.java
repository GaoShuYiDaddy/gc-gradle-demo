package com.quzeng.gc_gradle_demo.bean.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResultVO<T> {

    /*错误码*/
    private Integer code;

    /*提示信息 */
    @JsonProperty("description")
    private String description;

    /*具体内容*/
    private T data;

}
