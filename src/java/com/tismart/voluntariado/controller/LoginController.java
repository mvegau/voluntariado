/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.controller;

import com.tismart.voluntariado.bean.VolUsuario;
import com.tismart.voluntariado.bean.VolVoluntario;
import com.tismart.voluntariado.service.UsuarioService;
import com.tismart.voluntariado.service.VoluntarioService;
import java.util.List;
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
    VoluntarioService voluntarioService = new VoluntarioService();

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView desplegarLogin(HttpServletRequest request, HttpServletResponse response, VolUsuario usuario) {
        ModelAndView model = new ModelAndView("index");
        model.addObject("usuarioBean", usuario);
        return model;
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public ModelAndView ejecutarLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("usuarioBean") VolUsuario usuario) {

        ModelAndView model = null;
        try {
            boolean isValidUser = usuarioService.validarUsuario(usuario.getNumDocumento(), usuario.getPassword());

            if (isValidUser) {
                model = new ModelAndView("web_home_ver");
                List<VolVoluntario> listVoluntarios = voluntarioService.listarVoluntarios();
                model.addObject("voluntariosBean", listVoluntarios);
                VolUsuario usuarioBd = usuarioService.getNombreUsuario(usuario.getNumDocumento());
                String nombreUsuario = usuarioBd.getNombre() + " " + usuarioBd.getApellidos();
                model.addObject("nombreUsuario", nombreUsuario);
                model.addObject("usuarioBean", usuario);
                //aqui la parte de usuario inhabilitado 
                String indHabilitado = usuarioBd.getIndDesactivo().toString();
                if (indHabilitado.equals("0")) {
                    model = new ModelAndView("index");
                    //request.setAttribute("message", "El usuario se encuentra desactivado");
                    request.setAttribute("message", "Usuario desactivado");
                }
            } else {
                model = new ModelAndView("index");
                request.setAttribute("message", "Datos incorrectos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }

    @RequestMapping(value = "/web_home_ver", method = RequestMethod.GET)
    public ModelAndView recargarHome(HttpServletRequest request, HttpServletResponse response, VolUsuario usuario) {
        ModelAndView model = new ModelAndView("web_home_ver");
        model.addObject("usuarioBean", usuario);
        return model;
    }

    @RequestMapping(value = "/web_recuperar_contrasena", method = RequestMethod.GET)
    public ModelAndView recuperarContrasenia(HttpServletRequest request, HttpServletResponse response, VolUsuario usuario) {
        ModelAndView model = new ModelAndView("web_recuperar_contrasena");
        model.addObject("usuarioBean", usuario);
        return model;
    }
}
