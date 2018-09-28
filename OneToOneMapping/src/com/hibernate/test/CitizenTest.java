package com.hibernate.test;

import com.hibernate.domain.Building;
import com.hibernate.domain.Citizen;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by xiaofei on 2017/5/27.
 */
public class CitizenTest{

    private Session session = null;
    private Transaction trans = null;

    public void addCitizen(){

        Citizen citizen = new Citizen();
        citizen.setIdcard("00000004");
        citizen.setCitizenName("小小马哥");

        Building building = new Building();
        building.setBuildingType("总统住宅");

        citizen.setBuilding(building);
        building.setBuildingHolder(citizen);
        session = Connection.getSession();
        try{
            trans=session.beginTransaction();
            session.save(citizen);
            trans.commit();
        }catch(HibernateException e)
        {
            trans.rollback();
            e.printStackTrace();
        }
        session.close();
        Connection.sessionFactoryClose();
    }
}
