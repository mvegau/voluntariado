/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.dao;

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
//        Session session = sessionFactory.openSession();
//        boolean userFound = false;
//        //Query using Hibernate Query Language
//        String SQL_QUERY = " from Users as o where o.userName=? and o.userPassword=?";
//        Query query = session.createQuery(SQL_QUERY);
//        query.setParameter(0, username);
//        query.setParameter(1, password);
//        List list = query.list();
//
//        if ((list != null) && (list.size() > 0)) {
//            userFound = true;
//        }
//
//        session.close();
//        return userFound;
        return true;
    }

}
