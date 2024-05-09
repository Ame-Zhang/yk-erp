package com.yk.ykerp.exception;

import com.yk.ykerp.constants.ErrorCodeEnum;
import lombok.Data;

@Data
public class YkException extends RuntimeException {

    private String code;

    public YkException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public YkException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMsg());
        this.code = errorCodeEnum.getCode();
    }
}
