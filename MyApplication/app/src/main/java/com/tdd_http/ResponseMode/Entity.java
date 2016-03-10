package com.tdd_http.ResponseMode;

/**
 * Created by jorryLiu on 2016/3/10.
 * liujiawei@puhuifinance.com
 */
public class Entity {


    /**
     * success : false
     * message : 用户名或密码不正确
     */

    private boolean success;
    private String message;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
