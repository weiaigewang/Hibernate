package com.hibernate.many;

import java.util.HashSet;
import java.util.Set;

/**
 * 物品类型
 * Created by xiaofei on 2017/5/27.
 */
public class Category {

    private String categoryId;
    private String categoryName;
    private String categoryMemo;
    private Set<Goods> goodsList = new HashSet<Goods>();

    public Set<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(Set<Goods> goodsList) {
        this.goodsList = goodsList;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryMemo() {
        return categoryMemo;
    }

    public void setCategoryMemo(String categoryMemo) {
        this.categoryMemo = categoryMemo;
    }
}
