package com.yk.ykerp.exception;

import com.yk.ykerp.common.R;
import com.yk.ykerp.constants.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.sql.SQLException;

@Slf4j
@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(IllegalArgumentException.class)
    public R illegalArgumentException(IllegalArgumentException e) {
        log.error("IllegalArgumentException:{}",String.valueOf(e));
        return R.fail(ErrorCodeEnum.FAIL.getCode(), e.getMessage());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(YkException.class)
    public R ykException(YkException e) {
        log.error("code:{} , msg:{}",e.getCode() , e.getMessage());
        return R.fail(e);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(SQLException.class)
    public R sqlException(SQLException e) {
        log.error("msg:{}", e.getMessage());
        return R.fail(ErrorCodeEnum.DB_FAIL);
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public R exception(Exception e) {
        log.error("msg:{}", e.getMessage());
        return R.fail(ErrorCodeEnum.SYSTEM_ERROR);
    }
}
