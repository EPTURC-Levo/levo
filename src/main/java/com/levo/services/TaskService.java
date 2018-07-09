package com.levo.services;

import com.levo.domain.Task;
import com.levo.domain.Vehicle;
import com.levo.persistence.TaskPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService implements ICrudService<Task, Long>{

    @Autowired
    private TaskPersistence taskPersistence;

    public TaskService() {

    }

    @Override
    public List<Task> getAll() {

        List<Task> taskList = taskPersistence.findAll();
        return taskList;
    }

    @Override
    public Task getById(Long id) {
       Task task = taskPersistence.findOne(id);
        return task;
    }

    @Override
    public Task create(Task entity) {
        return taskPersistence.save(entity);
    }

    @Override
    public Task remove(Task entity) {
        taskPersistence.delete(entity);
        return entity;
    }

    @Override
    public Task update(Task entity) {
        return taskPersistence.save(entity);
    }
}
