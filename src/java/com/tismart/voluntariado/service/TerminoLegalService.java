/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.service;

import com.tismart.voluntariado.bean.VolTermlegal;
import com.tismart.voluntariado.dao.TerminoLegalDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author manuel.vega
 */
public class TerminoLegalService {

    @Autowired
    TerminoLegalDao terminoLegalDao = new TerminoLegalDao();

    public List<VolTermlegal> obtenerTerminosLegales() {
        return terminoLegalDao.obtenerTerminosLegales();
    }

}
