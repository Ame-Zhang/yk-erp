package com.yk.ykerp.controller.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yk.ykerp.common.CommonResponse;

public class TestResponseVo extends CommonResponse {

    @JsonProperty("EXSIT")
    public boolean exist;
}
