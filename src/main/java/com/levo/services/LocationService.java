package com.levo.services;

import com.levo.domain.Location;
import com.levo.persistence.LocationPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService implements ICrudService<Location, Long>{


    @Autowired
    private LocationPersistence locationPersistence;

    public LocationService() {
    }

    @Override
    public List<Location> getAll() {

        List<Location> locationList = locationPersistence.findAll();

        return locationList;
    }

    @Override
    public Location getById(Long id) {

        Location location = locationPersistence.findOne(id);
        return null;
    }

    @Override
    public Location create(Location entity) {
        return locationPersistence.save(entity);
    }

    @Override
    public Location remove(Location entity) {
        locationPersistence.delete(entity);
        return entity;
    }

    @Override
    public Location update(Location entity) {
        return locationPersistence.save(entity);
    }
}
