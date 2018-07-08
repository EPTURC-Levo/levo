package com.levo.persistence;

import com.levo.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPersistence extends JpaRepository<Staff, Long> {
}
