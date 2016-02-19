/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.service.impl;

import com.tismart.voluntariado.dao.UsuarioDao;
import com.tismart.voluntariado.service.UsuarioService;
import java.sql.SQLException;

/**
 *
 * @author manuel.vega
 */
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioDao usuarioDao;

    public UsuarioDao getUserDao() {
        return this.usuarioDao;
    }

    public void setUserDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

    @Override
    public boolean validarUsuario(String username, String password) throws SQLException {
        return usuarioDao.validarUsuario(username, password);
    }
}
