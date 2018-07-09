package com.levo.services;

import com.levo.domain.Driver;
import com.levo.domain.Staff;
import com.levo.persistence.StaffPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements ICrudService<Staff, Long>{


    @Autowired
    private StaffPersistence staffPersistence;

    public StaffService() {
    }

    @Override
    public List<Staff> getAll() {
        List<Staff> staffList = staffPersistence.findAll();
        return staffList;
    }

    @Override
    public Staff getById(Long id) {
        Staff staff = staffPersistence.findOne(id);
        return staff;
    }

    @Override
    public Staff create(Staff entity) {
        return staffPersistence.save(entity);
    }

    @Override
    public Staff remove(Staff entity) {
        staffPersistence.delete(entity);
        return entity;
    }

    @Override
    public Staff update(Staff entity) {
        return staffPersistence.save(entity);
    }
}
