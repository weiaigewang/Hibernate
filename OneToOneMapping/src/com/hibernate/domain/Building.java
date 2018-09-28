package com.hibernate.domain;

import com.hibernate.bean.ValueObject;

/**
 * 房子类
 * Created by xiaofei on 2017/5/27.
 */
public class Building extends ValueObject {

    private String buildingNo;
    private String buildingType;
    private Citizen buildingHolder;

    public String getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public Citizen getBuildingHolder() {
        return buildingHolder;
    }

    public void setBuildingHolder(Citizen buildingHolder) {
        this.buildingHolder = buildingHolder;
    }
}
