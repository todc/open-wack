package com.todc.openwack.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author Tim O'Donnell (tim.odonnell@imperva.com)
 */
@Controller
public class LoginController {

    @RequestMapping(name = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        return new ModelAndView("login");
    }
    
}
