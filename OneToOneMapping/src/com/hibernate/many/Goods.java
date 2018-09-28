package com.hibernate.many;

import java.util.HashSet;
import java.util.Set;

/**
 * 物品类
 *  多对多关系映射
 * Created by xiaofei on 2017/5/27.
 */
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Double goodsPrice;
    private Set<Category> categories=new HashSet<Category>();

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }
}
