/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.dao.impl;

import com.tismart.voluntariado.dao.UsuarioDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

/**
 *
 * @author manuel.vega
 */
public class UsuarioDaoImpl implements UsuarioDao {

    DataSource dataSource;

    public DataSource getDataSource() {
        return this.dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public boolean validarUsuario(String username, String password) throws SQLException {
        String query = "Select count(1) from Vol_Usuario where Num_Documento = ? and Password = ?";
        PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet resultSet = pstmt.executeQuery();
        if (resultSet.next()) {
            return (resultSet.getInt(1) > 0);
        } else {
            return false;
        }
    }

}
