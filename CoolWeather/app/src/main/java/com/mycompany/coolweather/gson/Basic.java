package com.mycompany.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sstek_mars on 2017/9/15.
 */

public class Basic {

    // 由于JSON中的一些字段可能不太适合直接作为 Java 字段来命名，因此这里使用了 @SerializedName 注解的方式来让JSON字段和Java字典之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
