package com.example.deller.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by deller on 2017/10/15.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;

    }
    public void setId(int id){
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;

    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;

    }
    public int getProvinceId(){
        return getProvinceId();
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
}
