package com.example.deller.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by deller on 2017/10/25.
 */

public class Basic {

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
