package com.lyun.www.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/2/21.
 */

public class City extends DataSupport {

    // 每个实体类都应有的Id
    private int id;

    // 记录市的名字
    private String cityName;

    // 记录市的代号
    private int cityCode;

    // 记录当前市所属省的id值
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
