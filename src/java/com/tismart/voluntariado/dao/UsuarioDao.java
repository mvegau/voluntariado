/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.dao;

import com.tismart.voluntariado.bean.VolUsuario;
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

    public boolean validarUsuario(String numDocumento, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        boolean userFound = false;
        String SQL_QUERY = " from VolUsuario as o where o.numDocumento=? and o.password=?";
        Query query = session.createQuery(SQL_QUERY);
        query.setParameter(0, numDocumento);
        query.setParameter(1, password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }

        session.close();
        return userFound;
    }

    public VolUsuario getNombreUsuario(String numDocumento) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL_QUERY = " from VolUsuario where numDocumento = '"+numDocumento+"' ";
        Query query = session.createQuery(SQL_QUERY);
        List<VolUsuario> listaUsuario = query.list();
        session.close();
        VolUsuario usuario = listaUsuario.get(0);
        return usuario;
    }

}
