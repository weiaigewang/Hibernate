package com.hibernate.test;

/**
 * Created by xiaofei on 2017/5/27.
 */
public class Main {

    public static void main(final String[] args) {

        StudentTest studentTest = new StudentTest();
        //studentTest.addStudent();
        CitizenTest citizenTest = new CitizenTest();
        //citizenTest.addCitizen();

        GoodsTest goodsTest = new GoodsTest();
        //goodsTest.addGoods();
        goodsTest.loadGoodsByCategory();
    }
}