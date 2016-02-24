/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.controller;

import com.tismart.voluntariado.bean.VolDepartamento;
import com.tismart.voluntariado.bean.VolDistrito;
import com.tismart.voluntariado.bean.VolPais;
import com.tismart.voluntariado.bean.VolProvincia;
import com.tismart.voluntariado.bean.VolVoluntario;
import com.tismart.voluntariado.service.UbigeoService;
import com.tismart.voluntariado.service.VoluntarioService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
    UbigeoService ubigeoService = new UbigeoService();
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
        //VolPais volpais = new VolPais();
        //model.addObject("paisBean", volpais);
        System.out.println("cargarDetalle1");
        volVoluntario = new VolVoluntario();
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_1", method = RequestMethod.POST)
    public ModelAndView guardarDetalle1(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("voluntarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_registro_ver_2");
        System.out.println("guardarDetalle1" + voluntario.getVolPais().getCodPais());
        volVoluntario = voluntario;
        model.addObject("voluntarioBean", volVoluntario);
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

    @ModelAttribute("paises")
    public Map<String, String> listaPaises() {

        Map<String, String> paises = new LinkedHashMap<String, String>();
        List listaPaises = ubigeoService.obtenerPaises();
        for (int i = 0; i < listaPaises.size(); i++) {
            VolPais pais = (VolPais) listaPaises.get(i);
            //paises.put((VolPais) listaPaises.get(i).get);
            paises.put(pais.getCodPais().toString(), pais.getNombrepa());
        }
        return paises;
    }

    @ModelAttribute("departamentos")
    public Map<String, String> listaDepartamentos(String codPais) {

        Map<String, String> departamentos = new LinkedHashMap<String, String>();
        List listaDepartamentos = ubigeoService.obtenerDepartamentos(codPais);
        for (int i = 0; i < listaDepartamentos.size(); i++) {
            VolDepartamento departamento = (VolDepartamento) listaDepartamentos.get(i);
            //paises.put((VolPais) listaPaises.get(i).get);
            departamentos.put(departamento.getCodDepartamento().toString(), departamento.getNombredep());
        }
        return departamentos;
    }

    @ModelAttribute("provincias")
    public Map<String, String> listaProvincias(String codDep) {

        Map<String, String> provincias = new LinkedHashMap<String, String>();
        List listaProvincias = ubigeoService.obtenerProvincias(codDep);
        for (int i = 0; i < listaProvincias.size(); i++) {
            VolProvincia provincia = (VolProvincia) listaProvincias.get(i);
            //paises.put((VolPais) listaPaises.get(i).get);
            provincias.put(provincia.getCodProvincia().toString(), provincia.getNombrepro());
        }
        return provincias;
    }

    @ModelAttribute("distritos")
    public Map<String, String> listaDistritos(String codProv) {

        Map<String, String> distritos = new LinkedHashMap<String, String>();
        List listaDistritos = ubigeoService.obtenerDistritos(codProv);
        for (int i = 0; i < listaDistritos.size(); i++) {
            VolDistrito distrito = (VolDistrito) listaDistritos.get(i);
            //paises.put((VolPais) listaPaises.get(i).get);
            distritos.put(distrito.getCodDistrito().toString(), distrito.getNombredis());
        }
        return distritos;
    }
}
