/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.dao;

import com.tismart.voluntariado.bean.VolDepartamento;
import com.tismart.voluntariado.bean.VolDistrito;
import com.tismart.voluntariado.bean.VolPais;
import com.tismart.voluntariado.bean.VolProvincia;
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
public class UbigeoDao {

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.openSession();
    }

    public List<VolPais> obtenerPaises() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL_QUERY = " from VolPais ";
        Query query = session.createQuery(SQL_QUERY);
        List<VolPais> listaPais = query.list();
        session.close();
        return listaPais;
    }

    public List<VolDepartamento> obtenerDepartamentos(String codPais) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL_QUERY = " from VolDepartamento ";
        //String SQL_QUERY = " from VolDepartamento where VolPais.codPais = " + codPais + " ";
        Query query = session.createQuery(SQL_QUERY);
        List<VolDepartamento> listaDepartamentos = query.list();
        session.close();
        return listaDepartamentos;
    }

    public List<VolProvincia> obtenerProvincias(String codDep) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL_QUERY = " from VolProvincia ";
        //String SQL_QUERY = " from VolProvincia where codDepartamento = " + codDep + " ";
        Query query = session.createQuery(SQL_QUERY);
        List<VolProvincia> listaProvincias = query.list();
        session.close();
        return listaProvincias;
    }

    public List<VolDistrito> obtenerDistritos(String codProv) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL_QUERY = " from VolDistrito ";
        //String SQL_QUERY = " from VolDistrito where codProvincia = " + codProv + " ";
        Query query = session.createQuery(SQL_QUERY);
        List<VolDistrito> listaDistritos = query.list();
        session.close();
        return listaDistritos;
    }
}
