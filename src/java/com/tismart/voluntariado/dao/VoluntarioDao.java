/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.dao;

import com.tismart.voluntariado.bean.VolGradoacade;
import com.tismart.voluntariado.bean.VolGsanguineo;
import com.tismart.voluntariado.bean.VolProfesion;
import com.tismart.voluntariado.bean.VolTipdocum;
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
    
    public List<VolVoluntario> listarVoluntarios(){
        List<VolVoluntario> voluntarios = null;
        Session session = HibernateUtil.getSessionFactory().openSession(); 

        try {
           voluntarios = session.createQuery(" from VolVoluntario").list();
           System.out.println("Cantidad de voluntarios encontrados :" + voluntarios.size());
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
         return voluntarios;
        
    }

    public List<VolTipdocum> obtenerDocumentos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL_QUERY = " from VolTipdocum ";
        Query query = session.createQuery(SQL_QUERY);
        List<VolTipdocum> listaDocumentos = query.list();
        session.close();
        return listaDocumentos;
    }

    public List<VolProfesion> obtenerProfesiones() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL_QUERY = " from VolProfesion ";
        Query query = session.createQuery(SQL_QUERY);
        List<VolProfesion> listaProfesiones = query.list();
        session.close();
        return listaProfesiones;
    }

    public List<VolGsanguineo> obtenerGruposSanguineos() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String SQL_QUERY = " from VolGsanguineo ";
        Query query = session.createQuery(SQL_QUERY);
        List<VolGsanguineo> listaGrupoSanguineo = query.list();
        session.close();
        return listaGrupoSanguineo;
    }

    public Integer damePosicionIdentificador(){
                Session session = HibernateUtil.getSessionFactory().openSession(); 
                List<VolVoluntario> list = session.createQuery(" from VolVoluntario").list();
                System.out.println("posicion : "+ list.size());
                return list.size();
    }
     public List<VolGradoacade> listarGradoAcademicos(){
        List<VolGradoacade> listgrad = null;
        Session session = HibernateUtil.getSessionFactory().openSession(); 

        try {
           listgrad = session.createQuery(" from VolGradoacade").list();
           System.out.println("Cantidad de VolGradoacade encontrados :" + listgrad.size());
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
         return listgrad;
        
    }   }
