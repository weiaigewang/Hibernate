package com.hibernate.bean;

import java.util.Date;

/**
 *   学生证
 * Created by xiaofei on 2017/5/27.
 */
public class Card extends ValueObject {

    private String cardNo;
    private Date cardIssueDate;
    //学生
    private Student cardHolder;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getCardIssueDate() {
        return cardIssueDate;
    }

    public void setCardIssueDate(Date cardIssueDate) {
        this.cardIssueDate = cardIssueDate;
    }

    public Student getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(Student cardHolder) {
        this.cardHolder = cardHolder;
    }
}
