package com.simpleweather.android.db;
import org.litepal.crud.DataSupport;
/**
 * Created by otanesyl on 2017/8/16.
 */

public class Province extends  DataSupport {
    private int id;
    private  String provinceName;
    private  int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
