/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.service;

import com.tismart.voluntariado.bean.VolGradoacade;
import com.tismart.voluntariado.bean.VolGsanguineo;
import com.tismart.voluntariado.bean.VolProfesion;
import com.tismart.voluntariado.bean.VolTipdocum;
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

    public String guardarVoluntario(VolVoluntario voluntario) {
        return voluntarioDao.guardarVoluntario(voluntario);
    }

    public List<VolTipdocum> obtenerDocumentos() {
        return voluntarioDao.obtenerDocumentos();
    }

    public List<VolProfesion> obtenerProfesiones() {
        return voluntarioDao.obtenerProfesiones();
    }

    public List<VolGsanguineo> obtenerGruposSanguineos() {
        return voluntarioDao.obtenerGruposSanguineos();
    }

    public Integer damePosicionIdentificador() {
        return voluntarioDao.damePosicionIdentificador();

    }

    public List<VolVoluntario> listarVoluntarios() {
        return voluntarioDao.listarVoluntarios();
    }

    public List<VolGradoacade> listarGradoAcademicos() {
        return voluntarioDao.listarGradoAcademicos();
    }

}
