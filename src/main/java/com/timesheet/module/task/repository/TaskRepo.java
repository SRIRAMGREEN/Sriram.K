package com.timesheet.module.task.repository;

import com.timesheet.module.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepo extends JpaRepository<Task,Integer> {

//    @Query(value ="SELECT * FROM task Where project_id =?;", nativeQuery = true )
    Optional<List<Task>> findByProjectProjectId(int projectId);
}