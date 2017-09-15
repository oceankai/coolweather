package com.mycompany.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sstek_mars on 2017/9/15.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    public class More {
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("cond")
    public More more;
}
