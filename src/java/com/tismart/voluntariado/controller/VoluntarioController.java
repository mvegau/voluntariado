/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.controller;

import com.tismart.voluntariado.bean.VolVoluntario;
import com.tismart.voluntariado.service.VoluntarioService;
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
    VoluntarioService voluntarioService = new VoluntarioService();
    VolVoluntario volVoluntario;

    @RequestMapping(value = "/web_registro_ver_1", method = RequestMethod.POST)
    public ModelAndView guardarDetalle1(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("voluntarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_registro_ver_2");
        System.out.println("guardarDetalle1");
        volVoluntario = voluntario;
        model.addObject("voluntarioBean", volVoluntario);
        return model;
    }
    @RequestMapping(value = "/web_registro_ver_1", method = RequestMethod.GET)
    public ModelAndView cargarDetalle1(HttpServletRequest request, HttpServletResponse response, VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_registro_ver_1");
        model.addObject("voluntarioBean", voluntario);
        System.out.println("cargarDetalle1");
        volVoluntario = new VolVoluntario();
        return model;
    }



    @RequestMapping(value = "/web_registro_ver_2", method = RequestMethod.GET)
    public ModelAndView volverDetalle1(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("voluntarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_registro_ver_1");
        voluntario = volVoluntario;
        model.addObject("voluntarioBean", voluntario);
        System.out.println("volverDetalle1");
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_2", method = RequestMethod.POST)
    public ModelAndView guardarDetalle2(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("usuarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_registro_ver_3");
        String enlace = null;
        //request.setAttribute(enlace, "Datos incorrectos");
        //enlace = (String) request.getAttribute(enlace);
        System.out.println("guardarDetalle2" + enlace);
        //volVoluntario = voluntario;
        model.addObject("voluntarioBean", volVoluntario);
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_3", method = RequestMethod.GET)
    public ModelAndView volverDetalle2(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("voluntarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_registro_ver_2");
        voluntario = volVoluntario;
        model.addObject("voluntarioBean", voluntario);
        System.out.println("volverDetalle2");
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_3", method = RequestMethod.POST)
    public ModelAndView guardarDetalle3(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("usuarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_terminos_legales_ver");
        System.out.println("guardarDetalle3");
        //volVoluntario = voluntario;
        volVoluntario.setApreciacion(voluntario.getApreciacion());
        model.addObject("voluntarioBean", volVoluntario);
        return model;
    }

    @RequestMapping(value = "/web_terminos_legales_ver", method = RequestMethod.GET)
    public ModelAndView mostrarTerminosLegales(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("voluntarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_terminos_legales_ver");
        voluntario = volVoluntario;
        model.addObject("voluntarioBean", voluntario);
        System.out.println("mostrarTerminosLegales");
        return model;
    }

    @RequestMapping(value = "/web_terminos_legales_ver", method = RequestMethod.POST)
    public ModelAndView aceptarTerminosLegales(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("usuarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("index");
        System.out.println("aceptarTerminosLegales" + voluntario.getNombres());
        //volVoluntario = voluntario;
        //model.addObject("voluntarioBean", volVoluntario);
        boolean isOk = voluntarioService.guardarVoluntario(volVoluntario);
        try {
            if (isOk) {
                model = new ModelAndView("index");
            } else {
                model = new ModelAndView("error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;
    }
}
