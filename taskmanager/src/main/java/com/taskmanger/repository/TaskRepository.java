package com.taskmanger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmanger.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
