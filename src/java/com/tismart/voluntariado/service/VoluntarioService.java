/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.service;

import com.tismart.voluntariado.bean.VolProvincia;
import com.tismart.voluntariado.bean.VolVoluntario;
import com.tismart.voluntariado.dao.VoluntarioDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author manuel.vega
 */
public class VoluntarioService {

    @Autowired
    VoluntarioDao voluntarioDao = new VoluntarioDao();

    public boolean guardarVoluntario(VolVoluntario voluntario) {
        return voluntarioDao.guardarVoluntario(voluntario);
    }
    
    public List<VolProvincia> listarVoluntarios(){
        return voluntarioDao.listarVoluntarios();
    }
    
    
}
