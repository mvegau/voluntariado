/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.controller;

import com.tismart.voluntariado.bean.VolDepartamento;
import com.tismart.voluntariado.bean.VolDistrito;
import com.tismart.voluntariado.bean.VolEstavolun;
import com.tismart.voluntariado.bean.VolGradoacade;
import com.tismart.voluntariado.bean.VolGsanguineo;
import com.tismart.voluntariado.bean.VolPais;
import com.tismart.voluntariado.bean.VolProfesion;
import com.tismart.voluntariado.bean.VolProvincia;
import com.tismart.voluntariado.bean.VolTipdocum;
import com.tismart.voluntariado.bean.VolVoluntario;
import com.tismart.voluntariado.service.UbigeoService;
import com.tismart.voluntariado.service.VoluntarioService;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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

    @RequestMapping(value = "/web_registro_ver_1", method = RequestMethod.GET)
    public ModelAndView cargarDetalle1(HttpServletRequest request, HttpServletResponse response, VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_registro_ver_1");
        //Date fechaActual = new Date();
        //voluntario.setFecNacimiento(fechaActual);
        model.addObject("voluntarioBean", voluntario);
        volVoluntario = new VolVoluntario();
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_1", method = RequestMethod.POST)
    public ModelAndView guardarDetalle1(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("voluntarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_registro_ver_2");
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
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_2", method = RequestMethod.POST)
    public ModelAndView guardarDetalle2(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("usuarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_registro_ver_3");
        model.addObject("voluntarioBean", volVoluntario);
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_3", method = RequestMethod.GET)
    public ModelAndView volverDetalle2(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("voluntarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_registro_ver_3");
        model.addObject("voluntarioBean", volVoluntario);
        return model;
    }

    @RequestMapping(value = "/web_registro_ver_3", method = RequestMethod.POST)
    public ModelAndView guardarDetalle3(HttpServletRequest request, HttpServletResponse response,
            @ModelAttribute("voluntarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_terminos_legales_ver");
        volVoluntario.setMotivacion(voluntario.getMotivacion());
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
            @ModelAttribute("voluntarioBean") VolVoluntario voluntario) {
        ModelAndView model = new ModelAndView("web_confirmacion_ver");
        String contrasenia = "";

        try {
            String fechaNac = volVoluntario.getFecNacimiento().toString();
            String diaNac = fechaNac.substring(8, 10);
            int dia = Integer.parseInt(diaNac);
            String mesNac = fechaNac.substring(4, 7);
            int mes = obtenerMes(mesNac);
            String anioNac = fechaNac.substring(24, 28);
            int anio = Integer.parseInt(anioNac);

            Calendar cal = new GregorianCalendar(anio, mes, dia);
            Date fecha = cal.getTime();// aumenta en uno el mes que se ingreso
            java.sql.Date fecNacimiento = new java.sql.Date(fecha.getTime());

            Date fechaActual = new Date();
            java.sql.Date sqlDate = new java.sql.Date(fechaActual.getTime());

            Integer identity = voluntarioService.damePosicionIdentificador();
            Integer newidentity;
            newidentity = identity + 1;
            volVoluntario.setIdeVoluntario(BigDecimal.valueOf(newidentity));

            VolGradoacade grado = new VolGradoacade();
            grado.setIdeGradoacademico(BigDecimal.valueOf(1));
            volVoluntario.setVolGradoacade(grado);

            volVoluntario.setCelular(volVoluntario.getTelefono());
            volVoluntario.setFecNacimiento(fecNacimiento);
            volVoluntario.setFecRegistro(sqlDate);
            volVoluntario.setIndHabilitado(BigDecimal.valueOf(1));// 1 activo - 0 desactivo

            VolEstavolun estado = new VolEstavolun();
            estado.setIdeEstadovoluntario(BigDecimal.valueOf(1));//Postulante
            volVoluntario.setVolEstavolun(estado);

            volVoluntario.setAceptaterminos(BigDecimal.valueOf(1));

            contrasenia = voluntarioService.guardarVoluntario(volVoluntario);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("documento", volVoluntario.getNumDocumento());
        request.setAttribute("clave", contrasenia);
        return model;
    }

    @ModelAttribute("paises")
    public Map<String, String> listaPaises() {

        Map<String, String> paises = new LinkedHashMap<String, String>();
        List listaPaises = ubigeoService.obtenerPaises();
        for (int i = 0; i < listaPaises.size(); i++) {
            VolPais pais = (VolPais) listaPaises.get(i);
            paises.put(pais.getCodPais().toString(), pais.getNombrepa());
        }
        return paises;
    }

//    @ModelAttribute("departamentos")
//    public Map<String, String> listaDepartamentos(String codPais) {
//
//        Map<String, String> departamentos = new LinkedHashMap<String, String>();
//        List listaDepartamentos = ubigeoService.obtenerDepartamentos(codPais);
//        for (int i = 0; i < listaDepartamentos.size(); i++) {
//            VolDepartamento departamento = (VolDepartamento) listaDepartamentos.get(i);
//            departamentos.put(departamento.getCodDepartamento().toString(), departamento.getNombredep());
//        }
//        return departamentos;
//    }

//    @ModelAttribute("provincias")
//    public Map<String, String> listaProvincias(String codDep) {
//
//        Map<String, String> provincias = new LinkedHashMap<String, String>();
//        List listaProvincias = ubigeoService.obtenerProvincias(codDep);
//        for (int i = 0; i < listaProvincias.size(); i++) {
//            VolProvincia provincia = (VolProvincia) listaProvincias.get(i);
//            provincias.put(provincia.getCodProvincia().toString(), provincia.getNombrepro());
//        }
//        return provincias;
//    }

//    @ModelAttribute("distritos")
//    public Map<String, String> listaDistritos(String codProv) {
//
//        Map<String, String> distritos = new LinkedHashMap<String, String>();
//        List listaDistritos = ubigeoService.obtenerDistritos(codProv);
//        for (int i = 0; i < listaDistritos.size(); i++) {
//            VolDistrito distrito = (VolDistrito) listaDistritos.get(i);
//            distritos.put(distrito.getCodDistrito().toString(), distrito.getNombredis());
//        }
//        return distritos;
//    }

    @ModelAttribute("documentos")
    public Map<String, String> listaDocumentos() {

        Map<String, String> documentos = new LinkedHashMap<String, String>();
        List listaDocumentos = voluntarioService.obtenerDocumentos();
        for (int i = 0; i < listaDocumentos.size(); i++) {
            VolTipdocum documento = (VolTipdocum) listaDocumentos.get(i);
            documentos.put(documento.getIdeTipodocumento().toString(), documento.getDescripcion());
        }
        return documentos;
    }

    @ModelAttribute("profesiones")
    public Map<String, String> listaProfesiones() {

        Map<String, String> profesiones = new LinkedHashMap<String, String>();
        List listaProfesiones = voluntarioService.obtenerProfesiones();
        for (int i = 0; i < listaProfesiones.size(); i++) {
            VolProfesion profesion = (VolProfesion) listaProfesiones.get(i);
            profesiones.put(profesion.getIdeProfesion().toString(), profesion.getDescripcion());
        }
        return profesiones;
    }

    @ModelAttribute("sanguineo")
    public Map<String, String> listaGrupoSanguineo() {

        Map<String, String> grupos = new LinkedHashMap<String, String>();
        List listaGrupo = voluntarioService.obtenerGruposSanguineos();
        for (int i = 0; i < listaGrupo.size(); i++) {
            VolGsanguineo grupo = (VolGsanguineo) listaGrupo.get(i);
            grupos.put(grupo.getIdeGruposangui().toString(), grupo.getDescripcion());
        }
        return grupos;
    }

    @ModelAttribute("gradooacad")
    public Map<String, String> listaGradAcad() {
        Map<String, String> gradacademicos = new LinkedHashMap<String, String>();
        List listaGradAcad = voluntarioService.listarGradoAcademicos();
        for (int i = 0; i < listaGradAcad.size(); i++) {
            VolGradoacade gradacademico = (VolGradoacade) listaGradAcad.get(i);
            gradacademicos.put(gradacademico.getIdeGradoacademico().toString(), gradacademico.getDescripcion());
        }
        return gradacademicos;
    }

    @RequestMapping(value = "/web_registro_sespad", method = RequestMethod.GET)
    public ModelAndView cargarsespad(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("web_registro_sespad");
        return model;
    }

    @RequestMapping(value = "/web_confirmacion_ver", method = RequestMethod.GET)
    public ModelAndView confirmacion(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("index");
        return model;
    }

    private int obtenerMes(String mesNac) {
        int mes = 0;

        if (mesNac.equals("Jan")) {
            mes = 0;
        }
        if (mesNac.equals("Feb")) {
            mes = 1;
        }
        if (mesNac.equals("Mar")) {
            mes = 2;
        }
        if (mesNac.equals("Apr")) {
            mes = 3;
        }
        if (mesNac.equals("May")) {
            mes = 4;
        }
        if (mesNac.equals("Jun")) {
            mes = 5;
        }
        if (mesNac.equals("Jul")) {
            mes = 6;
        }
        if (mesNac.equals("Aug")) {
            mes = 7;
        }
        if (mesNac.equals("Sep")) {
            mes = 8;
        }
        if (mesNac.equals("Oct")) {
            mes = 9;
        }
        if (mesNac.equals("Nov")) {
            mes = 10;
        }
        if (mesNac.equals("Dec")) {
            mes = 11;
        }
        return mes;
    }
}
