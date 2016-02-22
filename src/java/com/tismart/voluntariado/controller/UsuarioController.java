/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.controller;

import com.tismart.voluntariado.bean.Usuario;
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

    @RequestMapping(value = "/web_registro_ver_1", method = RequestMethod.GET)
    public ModelAndView mostrarDetalle1(HttpServletRequest request, HttpServletResponse response, Usuario usuario) {
        ModelAndView model = new ModelAndView("web_registro_ver_1");
        model.addObject("usuarioBean", usuario);
        System.out.println("mostrarDetalle1");
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_1", method = RequestMethod.POST)
    public ModelAndView guardarDetalle1(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") Usuario usuario) {
        ModelAndView model = null;
        System.out.println("guardarDetalle1");
        model = new ModelAndView("web_registro_ver_2");

        return model;
    }

    @RequestMapping(value = "/web_registro_ver_2", method = RequestMethod.GET)
    public ModelAndView mostrarDetalle2(HttpServletRequest request, HttpServletResponse response, Usuario usuario) {
        ModelAndView model = new ModelAndView("web_registro_ver_2");
        model.addObject("usuarioBean", usuario);
        System.out.println("mostrarDetalle2");
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_2", method = RequestMethod.POST)
    public ModelAndView guardarDetalle2(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") Usuario usuario) {
        ModelAndView model = null;
        System.out.println("guardarDetalle2");
        model = new ModelAndView("web_registro_ver_3");

        return model;
    }

    @RequestMapping(value = "/web_registro_ver_3", method = RequestMethod.GET)
    public ModelAndView mostrarDetalle3(HttpServletRequest request, HttpServletResponse response, Usuario usuario) {
        ModelAndView model = new ModelAndView("web_registro_ver_3");
        model.addObject("usuarioBean", usuario);
        System.out.println("mostrarDetalle3");
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_3", method = RequestMethod.POST)
    public ModelAndView guardarDetalle3(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") Usuario usuario) {
        ModelAndView model = null;
        System.out.println("guardarDetalle3");
        model = new ModelAndView("index");

        return model;
    }

    @RequestMapping(value = "/web_terminos_legales_ver", method = RequestMethod.GET)
    public ModelAndView mostrarTerminosLegales(HttpServletRequest request, HttpServletResponse response, Usuario usuario) {
        ModelAndView model = new ModelAndView("web_terminos_legales_ver");
        model.addObject("usuarioBean", usuario);
        System.out.println("mostrarTerminosLegales");
        return model;
    }

    @RequestMapping(value = "/web_terminos_legales_ver", method = RequestMethod.POST)
    public ModelAndView aceptarTerminosLegales(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") Usuario usuario) {
        ModelAndView model = null;
        System.out.println("aceptarTerminosLegales");
        model = new ModelAndView("index");

        return model;
    }

    @RequestMapping(value = "/web_detalles_ver_2", method = RequestMethod.GET)
    public ModelAndView mostrarDetalle(HttpServletRequest request, HttpServletResponse response, Usuario usuario) {
        ModelAndView model = new ModelAndView("web_detalles_ver_2");
        model.addObject("usuarioBean", usuario);
        System.out.println("mostrarDetalle");
        return model;
    }

    @RequestMapping(value = "/web_detalles_ver_2", method = RequestMethod.POST)
    public ModelAndView modificarDetalle(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") Usuario usuario) {
        ModelAndView model = null;
        System.out.println("modificarDetalle");
        model = new ModelAndView("index");

        return model;
    }
}
