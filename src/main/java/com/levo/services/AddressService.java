package com.levo.services;

import com.levo.domain.Address;
import com.levo.persistence.AddressPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements ICrudService<Address, Long>{


    @Autowired
    private AddressPersistence addressPersistence;

    public AddressService() {

    }

    @Override
    public List<Address> getAll() {
        List<Address> addressList =  addressPersistence.findAll();
        return addressList;
    }

    @Override
    public Address getById(Long id) {
        Address address = addressPersistence.findOne(id);
        return address;
    }

    @Override
    public Address create(Address entity) {
        return addressPersistence.save(entity);
    }

    @Override
    public Address remove(Address entity) {
        addressPersistence.delete(entity);
        return entity;
    }

    @Override
    public Address update(Address entity) {
        return addressPersistence.save(entity);
    }
}
