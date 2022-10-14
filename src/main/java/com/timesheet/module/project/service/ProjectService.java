package com.timesheet.module.project.service;

import com.timesheet.module.project.dto.ProjectDto;
import com.timesheet.module.project.entity.Project;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface ProjectService {

    ProjectDto insertProject(Project project);
    List<ProjectDto> getProjectByProjectManagerId(int id);
    List<ProjectDto> getProjectDetailsByClientId(int clientId);
    List<ProjectDto> getAllProjectDetails();
    ProjectDto updateProject(Project project);

    String deleteProject(int projectId);

    String insertImage(Optional<MultipartFile> image, int projectId);
}
