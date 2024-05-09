package com.yk.ykerp.constants;


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
    SUCCESS("000000", "操作成功"),
    FAIL("100000", "操作失败"),
    DB_FAIL("100001", "数据库操作失败"),
    SYSTEM_ERROR("999999", "系统异常"),



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
