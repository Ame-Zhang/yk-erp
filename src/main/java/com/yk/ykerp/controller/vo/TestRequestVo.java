package com.yk.ykerp.controller.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.yk.ykerp.common.CommonRequest;

public class TestRequestVo extends CommonRequest {

    @JsonProperty("USERID")
    public String userId;

    @JsonProperty("USERNAME")
    public String userName;
}
