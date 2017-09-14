package com.mycompany.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by sstek_mars on 2017/9/14.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        // 传入请求地址，并注册一个回调来处理服务器响应
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
