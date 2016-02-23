/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.service;

import com.tismart.voluntariado.bean.VolPais;
import com.tismart.voluntariado.dao.UbigeoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author manuel.vega
 */
public class UbigeoService {

    @Autowired
    UbigeoDao ubigeoDao = new UbigeoDao();

    public List<VolPais> obtenerPaises() {
        return ubigeoDao.obtenerPaises();
    }
}
