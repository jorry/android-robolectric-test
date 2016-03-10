package com.tdd_http;

import com.tdd_http.ResponseMode.Entity;
import com.tdd_http.modle.LoginRequest;
import com.tdd_http.modle.RequestBody;
import com.tdd_http.net.ServiceApi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;


/**
 *
 * Created by jorryLiu on 2016/3/10.
 * liujiawei@puhuifinance.com
 */


@RunWith(RobolectricGradleTestRunner.class)

@Config( constants = BuildConfig.class, manifest="app/src/main/AndroidManifest.xml", sdk = 21 )
public class HttpTDDDemo {


    @Before
    public void setUp(){

    }


    @Test
    public void    test(){
        RequestBody requestBody =
                ServiceApi.createService(RequestBody.class);
        Entity enddy = requestBody.postjson(new LoginRequest("1", "2"));
        Assert.assertEquals(false,enddy.getSuccess());
    }
}
