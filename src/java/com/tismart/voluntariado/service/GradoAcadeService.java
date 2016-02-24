/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.service;

import com.tismart.voluntariado.bean.VolGradoacade;
import com.tismart.voluntariado.dao.GradoAcadeDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


/**
 *
 * @author jean.ayvar
 */
public class GradoAcadeService {
        @Autowired
        GradoAcadeDAO gradoacadeDao = new GradoAcadeDAO();
        
        public List<VolGradoacade> listarGradoAcademicos(){
        return gradoacadeDao.listarGradoAcademicos();
    }
    
}
