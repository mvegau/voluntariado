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
public class LoginController {

    @Autowired
    UsuarioService usuarioService = new UsuarioService();
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView desplegarLogin(HttpServletRequest request, HttpServletResponse response, Usuario usuario) {
        ModelAndView model = new ModelAndView("index");
        model.addObject("usuarioBean", usuario);
        return model;
    }

    @RequestMapping(value = "/web_home_ver", method = RequestMethod.POST)
    public ModelAndView ejecutarLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") Usuario usuario) {
        ModelAndView model = null;
        //model.addObject("message", "Datos incorrectos");
        try {
            
            boolean isValidUser = usuarioService.validarUsuario(usuario.getUsername(), usuario.getPassword());
            if (isValidUser) {
                //request.setAttribute("loggedInUser", loginBean.getUsername());
                model = new ModelAndView("web_home_ver");
            } else {
                model = new ModelAndView("index");
                request.setAttribute("message", "Datos incorrectos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;
    }
}
