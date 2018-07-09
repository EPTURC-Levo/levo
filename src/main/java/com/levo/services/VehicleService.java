package com.levo.services;

import com.levo.domain.Vehicle;
import com.levo.persistence.VehiclePersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService implements ICrudService<Vehicle, Long>{

    @Autowired
    private VehiclePersistence vehiclePersistence;


    public VehicleService() {
    }

    @Override
    public List<Vehicle> getAll() {

        List<Vehicle> vehicleList = vehiclePersistence.findAll();

        return vehicleList;
    }

    @Override
    public Vehicle getById(Long id) {
        Vehicle vehicle = vehiclePersistence.findOne(id);
        return vehicle;
    }

    @Override
    public Vehicle create(Vehicle entity) {
        return vehiclePersistence.save(entity);
    }

    @Override
    public Vehicle remove(Vehicle entity) {
        vehiclePersistence.delete(entity);
        return entity;
    }

    @Override
    public Vehicle update(Vehicle entity) {
        return vehiclePersistence.save(entity);
    }
}
