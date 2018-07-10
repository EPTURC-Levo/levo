package com.levo.restcontrollers;


import com.levo.domain.Driver;
import com.levo.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("api/v1/driver")
public class DriverRestController extends ICrudController<DriverService, Driver, Long>{

    @Autowired
    private DriverService driverService;

    public DriverRestController(){

    }

    /**
     * injeta o serviço na classe pai
     */
    @PostConstruct
    public void init(){
       setService(driverService);

    }




}
