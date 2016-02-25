/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.dao;

import com.tismart.voluntariado.bean.VolGradoacade;
import com.tismart.voluntariado.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author jean.ayvar
 */
public class GradoAcadeDAO {
    
        public boolean guardarGradoAcade(VolGradoacade gradocade) {
        boolean insertGradoAcade = false;
        Session session = HibernateUtil.getSessionFactory().openSession();
            try {
             session.save(gradocade);
             session.beginTransaction().commit();
             insertGradoAcade = true;
             System.out.println("Se inserto correctamente insertGradoAcade");
         } catch (Exception e) {
             e.printStackTrace();
            }finally{
            session.close();
            }
        session.close();
        return insertGradoAcade;
        //return voluntarioInsert;
    }
//         public List<VolGradoacade> listarGradoAcademicos(){
//        List<VolGradoacade> listgrad = null;
//        Session session = HibernateUtil.getSessionFactory().openSession(); 
//
//        try {
//           listgrad = session.createQuery(" from VolGradoacade").list();
//           System.out.println("Cantidad de VolGradoacade encontrados :" + listgrad.size());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally{
//            session.close();
//        }
//         return listgrad;
//        
//    }   
         
         
        
        
    
}
