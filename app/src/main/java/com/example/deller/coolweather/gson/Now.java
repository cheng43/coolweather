package com.example.deller.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by deller on 2017/10/25.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
