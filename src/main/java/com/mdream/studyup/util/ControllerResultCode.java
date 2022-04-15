package com.mdream.studyup.util;

/**
 * @author smn
 * @Description:
 * @date 2022/4/13 0013 22:31
 */
public enum ControllerResultCode {

    //通用成功
    SUCCESS(200, "SUCCESS"),

    //通用失败
    FAIL(10000, "fail"),

    //--------------  账户相关错误码----------------//
    //账户名已存在
    ACCOUNT_NAME_IS_EXIT(10001, "ACCOUNT_NAME_IS_EXIT"),

    //账户昵称已存在
    ACCOUNT_NICK_NAME_IS_EXIT(10002, "ACCOUNT_NICK_NAME_IS_EXIT"),

    //邀请码非法
    INVITATION_CODE_ERROR(10003, "INVITATION_CODE_ERROR")
    ;

    private Integer code;

    private String message;

    ControllerResultCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
