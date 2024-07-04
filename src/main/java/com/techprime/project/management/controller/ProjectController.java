package com.techprime.project.management.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.techprime.project.management.pojo.ProjectDetails;
import com.techprime.project.management.service.ProjectService;

@RestController
@RequestMapping("/projects")
@CrossOrigin
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/create")
    public ProjectDetails createProject(@RequestBody ProjectDetails project) {
        return projectService.saveProject(project);
    }
    
    @GetMapping
    public ResponseEntity<List<ProjectDetails>> getAllProjects() {
        List<ProjectDetails> projects = projectService.getAllProjects();
        return ResponseEntity.ok().body(projects);
    }
}
