package com.yk.ykerp.controller;

import com.yk.ykerp.common.R;
import com.yk.ykerp.controller.vo.LoginReqVo;
import com.yk.ykerp.controller.vo.LoginResVo;
import com.yk.ykerp.controller.vo.TestRequestVo;
import com.yk.ykerp.controller.vo.TestResponseVo;
import com.yk.ykerp.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * 登录
     * @param reqVo
     * @param request
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/login")
    public R<LoginResVo> login(@RequestBody LoginReqVo reqVo, HttpServletRequest request) throws Exception{
        LoginResVo resVo = userService.login(reqVo, request);
        return R.success(resVo);
    }
}
