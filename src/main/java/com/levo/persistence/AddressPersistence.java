package com.levo.persistence;

import com.levo.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressPersistence extends JpaRepository<Address, Long> {
}
