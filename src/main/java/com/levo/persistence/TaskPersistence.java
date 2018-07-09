package com.levo.persistence;

import com.levo.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskPersistence extends JpaRepository<Task,Long> {
}
