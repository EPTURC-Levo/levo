package com.levo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView index(){

        ModelAndView mv = new ModelAndView("mapa");


        return mv;
    }


    @PostMapping("/login")
    public ModelAndView login(String username, String password){

        System.out.println(username);
        System.out.println(password);
        ModelAndView mv = new ModelAndView("");
        return null;
    }
}
