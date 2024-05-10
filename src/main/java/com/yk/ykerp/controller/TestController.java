package com.yk.ykerp.controller;

import com.yk.ykerp.common.R;
import com.yk.ykerp.controller.vo.TestRequestVo;
import com.yk.ykerp.controller.vo.TestResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {


    @PostMapping(value = "/example")
    public R<TestResponseVo> example(@RequestBody TestRequestVo requestVo, HttpServletRequest request) throws Exception{
        TestResponseVo testResponseVo = new TestResponseVo();
        testResponseVo.exist = true;
        return R.success(testResponseVo);
    }
}
