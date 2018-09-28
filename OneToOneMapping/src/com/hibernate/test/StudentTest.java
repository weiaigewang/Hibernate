package com.hibernate.test;

import com.hibernate.bean.Card;
import com.hibernate.bean.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by xiaofei on 2017/5/27.
 */
public class StudentTest {

    private Session session = null;
    private Transaction trans = null;

    public Date getCurrentTime(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date time=null;
        try {
            time= sdf.parse(sdf.format(new Date()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    public void addStudent(){
        Student stu = new Student();
        stu.setStuId(5);
        stu.setStuName("费玉清");

        Card card = new Card();
        card.setCardIssueDate(getCurrentTime());

        stu.setCard(card);
        card.setCardHolder(stu);

        session = Connection.getSession();
        trans=session.beginTransaction();
        try{
            session.save(stu);
            trans.commit();
        }catch(HibernateException e) {
            trans.rollback();
            e.printStackTrace();
        }
        session.close();
        Connection.sessionFactoryClose();
    }
}
