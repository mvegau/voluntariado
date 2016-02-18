/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tismart.voluntariado.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author manuel.vega
 */
@Controller
public class LoginController {

    @RequestMapping("/index.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("AAAAAAAAAAAAAAAAAAA");
        return new ModelAndView("index");
    }
    
    @RequestMapping("/masterpage.html?web_home_ver")
    public ModelAndView handleRequest2(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("BBBBBBBBBBBBBBBBBB");
        return new ModelAndView("masterpage.html?web_home_ver");
    }
}
