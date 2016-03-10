package com.tdd_http.net;

import com.tdd_http.modle.RequestBody;

/**
 * Created by jorryLiu on 2016/3/10.
 * liujiawei@puhuifinance.com
 */
public class GithubFactory {
    protected static final Object monitor = new Object();
    static RequestBody sSingleton = null;

    public static RequestBody getSingleton() {
        synchronized (monitor) {
            if (sSingleton == null) {
                sSingleton = new GithubRetrofit().getService();
            }
            return sSingleton;
        }
    }
}
