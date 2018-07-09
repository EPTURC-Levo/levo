package com.levo.persistence;

import com.levo.domain.Occurrence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OccurrencePersistence extends JpaRepository<Occurrence, Long> {
}
