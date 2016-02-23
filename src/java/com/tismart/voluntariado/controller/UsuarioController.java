/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.controller;

import com.tismart.voluntariado.bean.VolUsuario;
import com.tismart.voluntariado.service.UsuarioService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author manuel.vega
 */
@Controller
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService = new UsuarioService();

    @RequestMapping(value = "/web_detalles_ver_2", method = RequestMethod.GET)
    public ModelAndView mostrarDetalle(HttpServletRequest request, HttpServletResponse response, VolUsuario usuario) {
        ModelAndView model = new ModelAndView("web_detalles_ver_2");
        model.addObject("usuarioBean", usuario);
        System.out.println("mostrarDetalle");
        return model;
    }

    @RequestMapping(value = "/web_detalles_ver_2", method = RequestMethod.POST)
    public ModelAndView modificarDetalle(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") VolUsuario usuario) {
        ModelAndView model = null;
        System.out.println("modificarDetalle");
        model = new ModelAndView("index");

        return model;
    }
}
