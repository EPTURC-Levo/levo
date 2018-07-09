package com.levo.services;

import com.levo.domain.Itinerary;
import com.levo.persistence.ItineraryPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItineraryService implements ICrudService<Itinerary, Long>{


    @Autowired
    private ItineraryPersistence itineraryPersistence;

    public ItineraryService() {
    }

    @Override
    public List<Itinerary> getAll() {

        List<Itinerary> itineraryList = itineraryPersistence.findAll();
        return itineraryList;
    }

    @Override
    public Itinerary getById(Long id) {

        Itinerary itinerary = itineraryPersistence.findOne(id);

        return itinerary;
    }

    @Override
    public Itinerary create(Itinerary entity) {

        return itineraryPersistence.save(entity);
    }

    @Override
    public Itinerary remove(Itinerary entity) {

        itineraryPersistence.delete(entity);
        return entity;
    }

    @Override
    public Itinerary update(Itinerary entity) {
        return itineraryPersistence.save(entity);
    }
}
