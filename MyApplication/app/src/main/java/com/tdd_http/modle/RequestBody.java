package com.tdd_http.modle;

import com.tdd_http.ResponseMode.Entity;

import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by jorryLiu on 2016/3/10.
 * liujiawei@puhuifinance.com
 */

public interface RequestBody {

    @POST("/consumer_login.action")
    Entity postjson(@Body LoginRequest bdoy);
}
