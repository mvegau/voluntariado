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
        volVoluntario.setAceptaterminos(voluntario.getAceptaterminos());
        String contrasenia = "";

        try {
            /*  DateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = null;
            fecha = ft.parse("24/02/16");*/

            System.out.println("AAAAAAAAAAAAAAAA" + volVoluntario.getFecNacimiento());
            java.util.Date myDate = new java.util.Date("10/10/2010");
            java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
            System.out.println("AAAAAAAAAAAAAAAA" + sqlDate);

            Integer identity = voluntarioService.damePosicionIdentificador();
            Integer newidentity;
            newidentity = identity + 1;
            volVoluntario.setIdeVoluntario(BigDecimal.valueOf(newidentity));

            VolGradoacade grado = new VolGradoacade();
            grado.setIdeGradoacademico(BigDecimal.valueOf(1));
            volVoluntario.setVolGradoacade(grado);

            volVoluntario.setCelular(volVoluntario.getTelefono());
            volVoluntario.setFecNacimiento(sqlDate);
            volVoluntario.setIndHabilitado(BigDecimal.valueOf(1));// 1 activo - 0 desactivo

            VolEstavolun estado = new VolEstavolun();
            estado.setIdeEstadovoluntario(BigDecimal.valueOf(1));//Postulante
            volVoluntario.setVolEstavolun(estado);

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

    @ModelAttribute("documentos")
    public Map<String, String> listaDocumentos() {

        Map<String, String> documentos = new LinkedHashMap<String, String>();
        List listaDocumentos = voluntarioService.obtenerDocumentos();
        for (int i = 0; i < listaDocumentos.size(); i++) {
            VolTipdocum documento = (VolTipdocum) listaDocumentos.get(i);
            //paises.put((VolPais) listaPaises.get(i).get);
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
            //paises.put((VolPais) listaPaises.get(i).get);
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
            //paises.put((VolPais) listaPaises.get(i).get);
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
        //model.addObject("voluntarioBean", voluntario);
        //VolPais volpais = new VolPais();
        //model.addObject("paisBean", volpais);
        //System.out.println("cargarDetalle1");
        //volVoluntario = new VolVoluntario();
        return model;
    }

    @RequestMapping(value = "/web_confirmacion_ver", method = RequestMethod.GET)
    public ModelAndView confirmacion(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("index");
        return model;
    }
}
