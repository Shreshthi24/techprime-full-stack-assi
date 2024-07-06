package com.techprime.project.management.service;


import com.techprime.project.management.Repo.ProjectRepo;
import com.techprime.project.management.pojo.DepartmentStats;
//import com.techprime.project.management.pojo.DepartmentStats;
import com.techprime.project.management.pojo.Project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	
	@Autowired
    private final ProjectRepo projectRepo;

   
    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public Project saveProject(Project project) {
        return projectRepo.save(project);
    }
    
    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }
    public Optional<Project> getProjectById(Long id) {
        return projectRepo.findById(id);
    }
    public Project updateProject(Long id, Project project) {
        return projectRepo.findById(id)
            .map(project1 -> {
                project1.setTheme(project.getTheme());
                project1.setReason(project.getReason());
                project1.setType(project.getType());
                project1.setDivision(project.getDivision());
                project1.setCategory(project.getCategory());
                project1.setPriority(project.getPriority());
                project1.setDepartment(project.getDepartment());
                project1.setStartDate(project.getStartDate());
                project1.setEndDate(project.getEndDate());
                project1.setLocation(project.getLocation());
                project1.setStatus(project.getStatus());
                return projectRepo.save(project);
            })
            .orElseGet(() -> {
                project.setId(id);
                return projectRepo.save(project);
            });
    }

    public void deleteProject(Long id) {
    	projectRepo.deleteById(id);
    }
    
    public long getTotalProjects() {
        return projectRepo.countAllProjects();
    }

    public long getClosedProjects() {
        return projectRepo.countClosedProjects();
    }

    public long getRunningProjects() {
        return projectRepo.countRunningProjects();
    }

    public long getClosureDelayProjects() {
        return projectRepo.countClosureDelayProjects();
    }

    public long getCancelledProjects() {
        return projectRepo.countCancelledProjects();
    }
    
    //for chart
    public List<DepartmentStats> getDepartmentStats() {
        return projectRepo.getDepartmentStats();
    }
    
    //for status update
    public void updateProjectStatus(Long id, String status) {
        Optional<Project> projectOptional = projectRepo.findById(id);
        if (projectOptional.isPresent()) {
            Project project = projectOptional.get();
            project.setStatus(status);
            projectRepo.save(project);
        }
    }
}
