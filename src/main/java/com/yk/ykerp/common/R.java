package com.yk.ykerp.common;

import com.yk.ykerp.constants.ErrorCodeEnum;
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

    public R(ErrorCodeEnum codeEnum, T response) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
        this.response = response;
    }

    public R(ErrorCodeEnum codeEnum) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMsg();
    }

    /**
     * 成功
     */
    public static R<CommonResponse> success(CommonResponse response) {
        return new R<>(ErrorCodeEnum.SUCCESS, response);
    }

    /**
     * 失败
     */
    public static R fail() {
        return new R<>(ErrorCodeEnum.FAIL);
    }

    /**
     * 失败
     */
    public static R fail(ErrorCodeEnum codeEnum) {
        return new R<>(codeEnum);
    }
}
