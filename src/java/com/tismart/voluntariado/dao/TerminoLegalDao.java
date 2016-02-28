/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.dao;

import com.tismart.voluntariado.bean.VolTermlegal;
import com.tismart.voluntariado.util.HibernateUtil;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author manuel.vega
 */
public class TerminoLegalDao {

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }

    public List<VolTermlegal> obtenerTerminosLegales() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL_QUERY = " from VolTermlegal order by ideTerminolegal ";
        Query query = session.createQuery(SQL_QUERY);
        List<VolTermlegal> listaTermLeg = query.list();
        session.close();
        return listaTermLeg;
    }

}
