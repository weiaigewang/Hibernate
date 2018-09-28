package com.hibernate.domain;

import com.hibernate.bean.ValueObject;

/**
 * 市民类
 * Created by xiaofei on 2017/5/27.
 */
public class Citizen extends ValueObject {

    private String idcard;
    private String citizenName;
    private Building building;

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public void setCitizenName(String citizenName) {
        this.citizenName = citizenName;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }
}
