/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.dao;

import com.tismart.voluntariado.bean.VolCargo;
import com.tismart.voluntariado.bean.VolDepartamento;
import com.tismart.voluntariado.bean.VolDistrito;
import com.tismart.voluntariado.bean.VolPais;
import com.tismart.voluntariado.bean.VolProvincia;
import com.tismart.voluntariado.bean.VolVoluntario;
import com.tismart.voluntariado.util.HibernateUtil;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Hibernate;
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
        Session session =  HibernateUtil.getSessionFactory().openSession();
       // session.beginTransaction();
        System.out.println("SAVE");
        VolPais pais = new VolPais(BigDecimal.ONE);
        VolDepartamento departamento = new VolDepartamento(BigDecimal.ONE);
        VolDistrito distrito = new VolDistrito();
        VolProvincia provincia = new VolProvincia();
        try {
            provincia.setCodProvincia(BigDecimal.ONE);
            provincia.setNombrepro("lima");
            provincia.setVolDepartamento(departamento);
            distrito.setCodDistrito(BigDecimal.ZERO);
            distrito.setNombredis("Miraflores0");
            distrito.setVolProvincia(vol);
            /*pais.setCodPais(BigDecimal.valueOf(2));
        departamento.setVolPais(pais);
        departamento.setCodDepartamento(BigDecimal.valueOf(4));
        departamento.setNombredep("Arequipa");
        
        VolVoluntario vol = new VolVoluntario();
        vol.setAceptaterminos(BigDecimal.ZERO);
        vol.set
        //voluntario.set("Granda");
       /* voluntario.setIdeCargo(BigDecimal.valueOf(2));
        voluntario.setNombre("cargo2");
        voluntario.setUsucreacion("usuario2");*/
        session.save(distrito);
        session.beginTransaction().commit();
        boolean userFound = false;
           } catch (Exception e) {
               e.printStackTrace();
        }finally{session.close();
            System.out.println("Se cierra Conexion");
        }
        //Query using Hibernate Query Language
        /*String SQL_QUERY = " from VolUsuario as o where o.nombre=? and o.password=?";
        Query query = session.createQuery(SQL_QUERY);
        query.setParameter(0, username);
        query.setParameter(1, password);
        List list = query.list();
        if ((list != null) && (list.size() > 0)) {
            userFound = true;
        }

        session.close();*/
        return true;
    }

}
