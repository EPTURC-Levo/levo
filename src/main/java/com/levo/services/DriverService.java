package com.levo.services;

import com.levo.domain.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService implements ICrudService<Driver, Long>{
    @Override
    public List<Driver> getAll() {
        return null;
    }

    @Override
    public Driver getById(Long id) {
        return null;
    }

    @Override
    public Driver create(Driver entity) {
        return null;
    }

    @Override
    public Driver remove(Driver entity) {
        return null;
    }

    @Override
    public Driver update(Driver entity) {
        return null;
    }
}
