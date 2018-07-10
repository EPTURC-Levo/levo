package com.levo.controllers;

import com.levo.domain.Driver;
import com.levo.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.sound.midi.SysexMessage;
import java.util.List;

@Controller
@RequestMapping("/driver")
public class DriverController {


    @Autowired
    private DriverService driverService;

    @PostMapping("/edit")
    public ModelAndView editDriver(String socialId){
        System.out.println("edit");
        System.out.println(socialId);
      //  ModelAndView mv = new ModelAndView("index");
       // mv.addObject("contatos", contatos);
        return null;
    }
    @PostMapping("/create")
    public ModelAndView createDriver(String newDriverSocialId, String newDriverName, String newDriverEmail){

        Driver newDriver = new Driver();
        newDriver.setSocialId(newDriverSocialId);
        newDriver.setName(newDriverName);
        newDriver.setEmail(newDriverEmail);
        driverService.create(newDriver);

        ModelAndView mv = new ModelAndView("redirect:../motorista");


        List<Driver> driverList = driverService.getAll();

        Driver driver = new Driver();
        mv.addObject("driverList", driverList);
        mv.addObject("selectedDriver", driver);

        return mv;
    }

    @PostMapping("/delete")
    public ModelAndView deleteDriver(String idDeleteDriver){

        Driver driver = driverService.getById(Long.valueOf(idDeleteDriver));


        driverService.remove(driver);

        ModelAndView mv = new ModelAndView("redirect:../motorista");
        List<Driver> driverList = driverService.getAll();

        driver = new Driver();
        mv.addObject("driverList", driverList);
        mv.addObject("selectedDriver", driver);
        return mv;
    }

    @RequestMapping("/details-modal/{id}")
    public ModelAndView detailsModal(@PathVariable("id") String id){

        Driver driver = driverService.getById(Long.valueOf(id));
        System.out.println(driver.getName());

        ModelAndView mv = new ModelAndView("motorista :: modalDetails");
        mv.addObject("selectedDriver", driver);
        return mv;
    }

    @RequestMapping("/delete-modal/{id}")
    public ModelAndView deleteModal(@PathVariable("id") String id){
        Driver driver = driverService.getById(Long.valueOf(id));

        ModelAndView mv = new ModelAndView("motorista :: modalDelete");
        mv.addObject("selectedDriver", driver);
        return mv;
    }


    @RequestMapping("/edit-modal/{id}")
    public ModelAndView editModal(@PathVariable("id") String id){

        Driver driver = driverService.getById(Long.valueOf(id));
        System.out.println(driver.getName());

        ModelAndView mv = new ModelAndView("motorista :: modalDetails");
        mv.addObject("selectedDriver", driver);
        return mv;
    }

}
