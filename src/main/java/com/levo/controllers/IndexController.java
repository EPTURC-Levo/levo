package com.levo.controllers;


import com.levo.domain.Driver;
import com.levo.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private DriverService driverService;

    @RequestMapping(method= RequestMethod.GET)
    public ModelAndView index(){

        ModelAndView mv = new ModelAndView("index");


        return mv;
    }

    @GetMapping("rota")
    public ModelAndView rota(){
        ModelAndView mv = new ModelAndView("rota");
        return mv;
    }

    @GetMapping("veiculo")
    public ModelAndView veiculo(){
        ModelAndView mv = new ModelAndView("veiculo");
        return mv;
    }
    @GetMapping("vinculo")
    public ModelAndView vinculo(){
        ModelAndView mv = new ModelAndView("vinculo");
        return mv;
    }

    @GetMapping("motorista")
    public ModelAndView motorista(){
        ModelAndView mv = new ModelAndView("motorista");

        List<Driver> driverList = driverService.getAll();

        mv.addObject("driverList", driverList);
        return mv;
    }

    @GetMapping("itinerario")
    public ModelAndView itinerario(){
        ModelAndView mv = new ModelAndView("itinerario");
        return mv;
    }

    @GetMapping("mapa")
    public ModelAndView mapa(){
        ModelAndView mv = new ModelAndView("mapa");
        return mv;
    }

    @GetMapping("logout")
    public ModelAndView logout(){
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }


    @PostMapping("/login")
    public ModelAndView login(String username, String password){

        System.out.println(username);
        System.out.println(password);
        ModelAndView mv = new ModelAndView("mapa");
        return mv;
    }
}
