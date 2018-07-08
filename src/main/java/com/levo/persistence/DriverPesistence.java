package com.levo.persistence;


import com.levo.domain.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverPesistence extends JpaRepository<Driver, Long> {
}
