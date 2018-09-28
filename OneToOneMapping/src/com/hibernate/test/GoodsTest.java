package com.hibernate.test;

import com.hibernate.many.Category;
import com.hibernate.many.Goods;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by xiaofei on 2017/5/27.
 */
public class GoodsTest {

    private Session session = null;
    private Transaction trans = null;

    public void addGoods(){

        Goods g1=new Goods();
        g1.setGoodsName("黄瓜");
        g1.setGoodsPrice(3.2);

        Goods g2=new Goods();
        g2.setGoodsName("苹果");
        g2.setGoodsPrice(8.0);

        Goods g3=new Goods();
        g3.setGoodsName("猪肉");
        g3.setGoodsPrice(18.0);

        Category ctg1 =new Category();
        ctg1.setCategoryName("火腿肠");
        ctg1.setCategoryMemo("火腿肠的价格便宜");

        Category ctg2 =new Category();
        ctg2.setCategoryName("火龙果");
        ctg2.setCategoryMemo("火龙果真的是好吃死了");

        g1.getCategories().add(ctg1);
        g1.getCategories().add(ctg2);
        g2.getCategories().add(ctg2);
        g3.getCategories().add(ctg2);

        session = Connection.getSession();
        try{
            trans= this.session.beginTransaction();
            this.session.save(g1);
            this.session.save(g2);
            this.session.save(g3);
            trans.commit();
        }catch(HibernateException e){
            trans.rollback();
            e.printStackTrace();
        }
         session.close();
         Connection.sessionFactoryClose();
    }


    public void loadGoodsByCategory(){

        session = Connection.getSession();
        try{
            trans= this.session.beginTransaction();
            Category ctg = (Category) this.session.get(Category.class, "40283f815c49ee41015c49ee45a40001");
            for(Goods goods:ctg.getGoodsList())
                System.out.println("goods id:"+goods.getGoodsId()+",name:"+goods.getGoodsName());
            trans.commit();
        }catch(HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        }
        this.session.close();
        Connection.sessionFactoryClose();
    }
}
