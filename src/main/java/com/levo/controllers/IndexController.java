package com.levo.controllers;


import com.levo.domain.Driver;
import com.levo.domain.Itinerary;
import com.levo.domain.Vehicle;
import com.levo.services.DriverService;
import com.levo.services.ItineraryService;
import com.levo.services.VehicleService;
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

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private ItineraryService itineraryService;

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
        List<Vehicle> vehicleList = vehicleService.getAll();
        Vehicle vehicle = new Vehicle();
        mv.addObject("vehicleList",vehicleList);
        mv.addObject("selectedDriver", vehicle);
        return mv;
    }
    @GetMapping("vinculo")
    public ModelAndView vinculo(){
        ModelAndView mv = new ModelAndView("vinculo");


        return mv;
    }

    @GetMapping("motorista")
    public ModelAndView motorista(){
        ModelAndView mv = new ModelAndView("/motorista");

        List<Driver> driverList = driverService.getAll();

        Driver driver = new Driver();
        mv.addObject("driverList", driverList);
        mv.addObject("selectedDriver", driver);
        return mv;
    }

    @GetMapping("itinerario")
    public ModelAndView itinerario(){
        ModelAndView mv = new ModelAndView("itinerario");
        List<Itinerary> itineraryList = itineraryService.getAll();

        Itinerary selectedItinerary = new Itinerary();
        mv.addObject("driverList", itineraryList);
        mv.addObject("selectedItinerary", selectedItinerary);


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
