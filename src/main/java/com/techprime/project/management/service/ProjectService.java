package com.techprime.project.management.service;


import com.techprime.project.management.Repo.ProjectRepo;
import com.techprime.project.management.pojo.ProjectDetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    private final ProjectRepo projectRepo;

    @Autowired
    public ProjectService(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    public ProjectDetails saveProject(ProjectDetails project) {
        return projectRepo.save(project);
    }
    
    public List<ProjectDetails> getAllProjects() {
        return projectRepo.findAll();
    }
}
