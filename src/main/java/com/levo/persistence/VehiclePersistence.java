package com.levo.persistence;

import com.levo.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiclePersistence extends JpaRepository<Vehicle,Long> {
}
