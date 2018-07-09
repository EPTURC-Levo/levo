package com.levo.services;

import com.levo.domain.Credential;
import com.levo.persistence.CredentialPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredentialService implements ICrudService<Credential, Long>{

    @Autowired
    private CredentialPersistence credentialPersistence;

    public CredentialService() {

    }

    @Override
    public List<Credential> getAll() {

        List<Credential> credentialList = credentialPersistence.findAll();

        return credentialList;
    }

    @Override
    public Credential getById(Long id) {

        Credential credential = credentialPersistence.findOne(id);

        return credential;
    }

    @Override
    public Credential create(Credential entity) {
        return credentialPersistence.save(entity);
    }

    @Override
    public Credential remove(Credential entity) {
        credentialPersistence.delete(entity);
        return entity;
    }

    @Override
    public Credential update(Credential entity) {
        return credentialPersistence.save(entity);
    }
}
