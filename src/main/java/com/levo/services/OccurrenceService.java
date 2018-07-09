package com.levo.services;

import com.levo.domain.Occurrence;
import com.levo.persistence.OccurrencePersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccurrenceService implements ICrudService<Occurrence, Long> {


    @Autowired
    private OccurrencePersistence occurrencePersistence;

    public OccurrenceService() {
    }

    @Override
    public List<Occurrence> getAll() {

        List<Occurrence> occurrenceList = occurrencePersistence.findAll();

        return occurrenceList;
    }

    @Override
    public Occurrence getById(Long id) {
       Occurrence occurrence = occurrencePersistence.findOne(id);
        return occurrence;
    }

    @Override
    public Occurrence create(Occurrence entity) {
        return occurrencePersistence.save(entity);
    }

    @Override
    public Occurrence remove(Occurrence entity) {
        occurrencePersistence.delete(entity);
        return entity;
    }

    @Override
    public Occurrence update(Occurrence entity) {
        return occurrencePersistence.save(entity);
    }
}
