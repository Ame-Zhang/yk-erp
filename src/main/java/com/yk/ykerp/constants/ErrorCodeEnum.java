package com.yk.ykerp.constants;


import lombok.Data;

/**
 * description
 *
 * @author Ame.Zhang
 * @date: 2024/5/9 1:06
 * @since v1.0
 */
public enum ErrorCodeEnum {

    /**
     * 操作类
     */
    SUCCESS("000000", "操作成功!"),
    FAIL("100000", "操作失败!"),



    ;

    private String code;

    private String msg;

    ErrorCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
