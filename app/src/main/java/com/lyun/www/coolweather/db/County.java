package com.lyun.www.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/2/21.
 */

public class County extends DataSupport {

    // 每个类都应该有的字段
    private int id;

    // 记录县的名字
    private String countyName;

    // 记录县所对应的天气id
    private String weatherId;

    // 记录当前县所属市的id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
