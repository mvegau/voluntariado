/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.service;

import com.tismart.voluntariado.bean.VolUsuario;
import com.tismart.voluntariado.dao.UsuarioDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author manuel.vega
 */
public class UsuarioService {

    @Autowired
    UsuarioDao usuarioDao = new UsuarioDao();

    public boolean validarUsuario(String numDocumento, String password) {
        return usuarioDao.validarUsuario(numDocumento, password);
    }
    
    public VolUsuario getNombreUsuario(String numDocumento) {
        return usuarioDao.getNombreUsuario(numDocumento);
    }
}
