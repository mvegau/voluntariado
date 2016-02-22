/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.dao;

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
public class UsuarioDao {

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }

    public boolean validarUsuario(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean userFound = false;
        //Query using Hibernate Query Language
        System.out.println("dfdfdfdffffffffffffffffffff");
        String SQL_QUERY = " from VolUsuario as o where o.nombre=? and o.password=?";
          System.out.println("dfdfdfdffffffffffffffffffff");
        Query query = session.createQuery(SQL_QUERY);
        System.out.println("dfdfdfdffffffffffffffffffff");
        query.setParameter(0, username);
        query.setParameter(1, password);
          System.out.println("dfdfdfdffffffffffffffffffff");
        List list = query.list();
        System.out.print("username "+ username);
        System.out.print("password "+ password);
        System.out.print("list "+ list);
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }

        session.close();
        return userFound;
    }

}
