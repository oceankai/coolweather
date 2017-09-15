package com.mycompany.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sstek_mars on 2017/9/15.
 */

public class Forecast {

    public String date;
    public class Temperature {
        public String max;
        public String min;
    }
    public class More {
        @SerializedName("txt_d")
        public String info;
    }

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;
}
