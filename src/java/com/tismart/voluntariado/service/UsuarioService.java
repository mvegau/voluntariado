/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.service;

import java.sql.SQLException;

/**
 *
 * @author manuel.vega
 */
public interface UsuarioService {

    public boolean validarUsuario(String username, String password) throws SQLException;
}
