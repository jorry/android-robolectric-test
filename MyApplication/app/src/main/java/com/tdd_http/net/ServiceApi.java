package com.tdd_http.net;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by jorryLiu on 2016/3/10.
 * liujiawei@puhuifinance.com
 */
public class ServiceApi {

    public static final String API_BASE_URL = "http://123.57.16.66:8080/ShopStore/consumerInfo/";

    private static RestAdapter.Builder builder = new RestAdapter.Builder()
            .setEndpoint(API_BASE_URL)
            .setClient(new OkClient(new OkHttpClient()));

    public static <S> S createService(Class<S> serviceClass) {
        RestAdapter adapter = builder.build();
        return adapter.create(serviceClass);
    }

}
