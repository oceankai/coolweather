package com.mycompany.coolweather.gson;

import android.app.ApplicationErrorReport;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sstek_mars on 2017/9/15.
 */

public class Suggestion {

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;
}
