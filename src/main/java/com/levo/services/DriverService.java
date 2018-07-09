package com.levo.services;

import com.levo.domain.Driver;
import com.levo.persistence.DriverPesistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService implements ICrudService<Driver, Long>{

    @Autowired
    private DriverPesistence driverPesistence;

    public DriverService() {
    }

    @Override
    public List<Driver> getAll() {

        List<Driver> driverList = driverPesistence.findAll();

        return driverList;
    }

    @Override
    public Driver getById(Long id) {

        Driver driver = driverPesistence.findOne(id);

        return driver;
    }

    @Override
    public Driver create(Driver entity) {
        return driverPesistence.save(entity);
    }

    @Override
    public Driver remove(Driver entity) {

        driverPesistence.delete(entity);
        return entity;
    }

    @Override
    public Driver update(Driver entity) {
        return driverPesistence.save(entity);
    }
}
