package com.yk.ykerp.service;

import com.yk.ykerp.controller.vo.LoginReqVo;
import com.yk.ykerp.controller.vo.LoginResVo;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    /**
     * 登录
     * @param reqVo
     * @return
     */
    LoginResVo login(LoginReqVo reqVo, HttpServletRequest request);
}
