package com.hibernate.bean;

/**
 *   学生类
 * Created by xiaofei on 2017/5/27.
 */
public class Student extends ValueObject{

    private Integer stuId;
    private String stuName;
    //学生证号
    private Card card;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
