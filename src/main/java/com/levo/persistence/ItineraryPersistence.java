package com.levo.persistence;

import com.levo.domain.Itinerary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItineraryPersistence extends JpaRepository<Itinerary, Long> {
}
