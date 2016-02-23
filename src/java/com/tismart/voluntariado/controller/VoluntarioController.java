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
public class VoluntarioController {

    @Autowired
    UsuarioService usuarioService = new UsuarioService();
    VolUsuario voluntario;

    @RequestMapping(value = "/web_registro_ver_1", method = RequestMethod.GET)
    public ModelAndView cargarDetalle1(HttpServletRequest request, HttpServletResponse response, VolUsuario usuario) {
        ModelAndView model = new ModelAndView("web_registro_ver_1");
        model.addObject("voluntarioBean", usuario);
        System.out.println("cargarDetalle1");
        voluntario = new VolUsuario();
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_1", method = RequestMethod.POST)
    public ModelAndView guardarDetalle1(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("voluntarioBean") VolUsuario usuario) {
        ModelAndView model = null;
        System.out.println("guardarDetalle1" + usuario.getNombre());
        model = new ModelAndView("web_registro_ver_2");
        voluntario = usuario;
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_2", method = RequestMethod.GET)
    public ModelAndView volverDetalle1(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("voluntarioBean") VolUsuario usuario) {
        ModelAndView model = new ModelAndView("web_registro_ver_1");
        usuario = voluntario;
        model.addObject("voluntarioBean", usuario);
        System.out.println("mostrarDetalle2" + usuario.getNombre());
        
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_2", method = RequestMethod.POST)
    public ModelAndView guardarDetalle2(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") VolUsuario usuario) {
        ModelAndView model = null;
        System.out.println("guardarDetalle2");
        model = new ModelAndView("web_registro_ver_3");

        return model;
    }

    @RequestMapping(value = "/web_registro_ver_3", method = RequestMethod.GET)
    public ModelAndView volverDetalle2(HttpServletRequest request, HttpServletResponse response, VolUsuario usuario) {
        ModelAndView model = new ModelAndView("web_registro_ver_3");
        model.addObject("usuarioBean", usuario);
        System.out.println("mostrarDetalle3");
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_3", method = RequestMethod.POST)
    public ModelAndView guardarDetalle3(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") VolUsuario usuario) {
        ModelAndView model = null;
        System.out.println("guardarDetalle3");
        model = new ModelAndView("web_terminos_legales_ver");

        return model;
    }

    @RequestMapping(value = "/web_terminos_legales_ver", method = RequestMethod.GET)
    public ModelAndView mostrarTerminosLegales(HttpServletRequest request, HttpServletResponse response, VolUsuario usuario) {
        ModelAndView model = new ModelAndView("web_terminos_legales_ver");
        model.addObject("usuarioBean", usuario);
        System.out.println("mostrarTerminosLegales");
        return model;
    }

    @RequestMapping(value = "/web_terminos_legales_ver", method = RequestMethod.POST)
    public ModelAndView aceptarTerminosLegales(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") VolUsuario usuario) {
        ModelAndView model = null;
        System.out.println("aceptarTerminosLegales");
        model = new ModelAndView("index");

        return model;
    }

}
