package com.levo.persistence;

import com.levo.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminPersistence extends JpaRepository<Admin,Long> {
}
