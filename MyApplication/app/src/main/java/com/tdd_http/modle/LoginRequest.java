package com.tdd_http.modle;

/**
 * Created by jorryLiu on 2016/3/10.
 * liujiawei@puhuifinance.com
 */
public class LoginRequest {

    public LoginRequest(String reg_phone, String reg_pwd) {
        this.reg_phone = reg_phone;
        this.reg_pwd = reg_pwd;
    }

    String reg_phone;
    String reg_pwd;
}
