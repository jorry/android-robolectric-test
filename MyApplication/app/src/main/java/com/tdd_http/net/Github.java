package com.tdd_http.net;

/**
 * Created by jorryLiu on 2016/3/10.
 * liujiawei@puhuifinance.com
 */
import java.util.List;
import retrofit.http.GET;
import retrofit.http.Path;
import rx.Observable;

/**
 * Created by devinshine on 15/9/4.
 * github api
 */
public interface Github {

    @GET("/users/{user}/repos")
    public List<Repo> listRepos(@Path("user") String user);

    @GET("/users/{user}/repos")
    public Observable<List<Repo>> listRepos2Observable(@Path("user") String user);
}