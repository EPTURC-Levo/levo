package com.levo.persistence;

import com.levo.domain.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialPersistence extends JpaRepository<Credential, Long> {
}
