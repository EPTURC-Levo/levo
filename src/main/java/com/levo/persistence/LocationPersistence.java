package com.levo.persistence;

import com.levo.domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationPersistence extends JpaRepository<Location, Long> {
}
