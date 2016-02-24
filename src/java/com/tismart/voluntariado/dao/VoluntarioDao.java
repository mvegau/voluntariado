/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.dao;

import com.tismart.voluntariado.bean.VolProvincia;
import com.tismart.voluntariado.bean.VolVoluntario;
import com.tismart.voluntariado.util.HibernateUtil;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author manuel.vega
 */
public class VoluntarioDao {

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean guardarVoluntario(VolVoluntario voluntario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        //boolean voluntarioInsert = false;
        //session=HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = session.beginTransaction();
        session.save(voluntario);
        transaccion.commit();
        session.close();
        return true;
        //return voluntarioInsert;
    }
    
    public List<VolProvincia> listarVoluntarios(){
        List<VolProvincia> voluntarios = null;
        Session session = HibernateUtil.getSessionFactory().openSession(); 

        try {
           voluntarios = session.createQuery(" from VolProvincia").list();
           System.out.println("Cantidad de voluntarios encontrados :" + voluntarios.size());
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
         return voluntarios;
        
    }

}
