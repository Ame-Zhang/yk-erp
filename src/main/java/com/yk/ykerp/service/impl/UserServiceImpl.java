package com.yk.ykerp.service.impl;

import com.yk.ykerp.controller.vo.LoginReqVo;
import com.yk.ykerp.controller.vo.LoginResVo;
import com.yk.ykerp.service.UserService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;



@Service
public class UserServiceImpl implements UserService {
    @Override
    public LoginResVo login(LoginReqVo reqVo, HttpServletRequest request) {

        return null;
    }
}
