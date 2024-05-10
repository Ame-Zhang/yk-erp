package com.yk.ykerp.common;

import com.yk.ykerp.constants.ErrorCodeEnum;
import com.yk.ykerp.exception.YkException;
import lombok.Data;

/**
 * description
 *
 * @author Ame.Zhang
 * @date: 2024/5/9 0:58
 * @since v1.0
 */
@Data
public class R<T extends CommonResponse> {

    private String code;

    private String msg;

    private T response;

    public R(String code, String msg, T response) {
        this.code = code;
        this.msg = msg;
        this.response = response;
    }

    /**
     * 响应1
     */
    private static <T extends CommonResponse> R<T> response(String code, String msg , T response) {
        return new R<>(code ,msg, response);
    }

    /**
     * 响应2
     */
    private static <T extends CommonResponse> R<T> response(ErrorCodeEnum errorCodeEnum , T response) {
        return new R<>(errorCodeEnum.getCode() ,errorCodeEnum.getMsg() , response);
    }

    /**
     * 成功
     */
    public static <T extends CommonResponse> R<T> success(T response) {
        return R.response(ErrorCodeEnum.SUCCESS, response);
    }

    /**
     * 失败1
     */
    public static R fail() {
        return R.response(ErrorCodeEnum.FAIL, null);
    }

    /**
     * 失败2
     */
    public static R fail(ErrorCodeEnum codeEnum) {
        return R.response(codeEnum, null);
    }

    /**
     * 失败3
     */
    public static R fail(String code , String msg) {
        return R.response(code ,msg , null);
    }

    /**
     * 失败4
     */
    public static R fail(YkException e) {
        return R.response(e.getCode() ,e.getMessage() , null);
    }
}
