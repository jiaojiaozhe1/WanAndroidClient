package com.fengyongge.wanandroidclient.api

import com.fengyongge.rxhttp.core.RetrofitFactory
import com.fengyongge.basecomponent.constant.Const
import com.fengyongge.basecomponent.interceptor.AddCookiesInterceptor
import com.fengyongge.basecomponent.interceptor.HeaderInterceptor
import com.fengyongge.basecomponent.interceptor.SaveCookiesInterceptor
import okhttp3.Interceptor

/**
 * describe
 *
 * @author fengyongge(fengyongge98@gmail.com)
 * @version V1.0
 * @date 2020/09/08
 */
object WanAndroidRetrofit : RetrofitFactory<WanandroidApi>() {

    override fun baseUrl(): String {
        return Const.BASE_URL
    }

    override fun getService(): Class<WanandroidApi> {
        return WanandroidApi::class.java
    }

    override fun getInterceptorList(): MutableList<Interceptor> {
        var interceptorList = mutableListOf<Interceptor>()
        interceptorList.add(SaveCookiesInterceptor())
        interceptorList.add(AddCookiesInterceptor())
        interceptorList.add(HeaderInterceptor())
        return interceptorList
    }


}