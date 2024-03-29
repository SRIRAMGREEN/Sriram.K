package com.timesheet.module.project.repository;

import com.timesheet.module.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Integer> {

    @Query(value ="SELECT * FROM project Where client_id =?;", nativeQuery = true )
    Optional<List<Project>> findProjectByClientId(int clientId);

    @Query(value ="SELECT * FROM project Where project_manager_id =?;", nativeQuery = true )
    Optional<List<Project>> findProjectByProjectManagerId(int id);
}
