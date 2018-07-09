package com.levo.services;

import com.levo.domain.Admin;
import com.levo.persistence.AdminPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements ICrudService<Admin, Long>{

    @Autowired
    private AdminPersistence adminPersistence;

    public AdminService() {
    }

    @Override
    public List<Admin> getAll() {
        List<Admin> adminList = adminPersistence.findAll();
        return adminList;
    }

    @Override
    public Admin getById(Long id) {

        Admin admin = adminPersistence.findOne(id);

        return admin;
    }

    @Override
    public Admin create(Admin entity) {
        return adminPersistence.save(entity);
    }

    @Override
    public Admin remove(Admin entity) {
        adminPersistence.delete(entity);
        return entity;
    }

    @Override
    public Admin update(Admin entity) {
        return adminPersistence.save(entity);
    }
}
