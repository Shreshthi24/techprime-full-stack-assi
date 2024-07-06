package com.techprime.project.management.controller;


//import java.util.List;
import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.techprime.project.management.pojo.DepartmentStats;
//import com.techprime.project.management.pojo.DepartmentStats;
import com.techprime.project.management.pojo.Project;
import com.techprime.project.management.service.ProjectService;

@RestController
@RequestMapping("/projects")
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {

    private final ProjectService projectService;

    
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/create")
    public Project createProject(@RequestBody Project project) {
        return projectService.saveProject(project);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    public ResponseEntity<List<Project>> getAllProjects() {
        List<Project> projects = projectService.getAllProjects();
        return ResponseEntity.ok().body(projects);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
        Optional<Project> project = projectService.getProjectById(id);
        return project.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/{id}")
    public ResponseEntity<Project> updateProject(@PathVariable Long id, @RequestBody Project project) {
        Project updatedProject = projectService.updateProject(id, project);
        return ResponseEntity.ok(updatedProject);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
    	projectService.deleteProject(id);
        return ResponseEntity.noContent().build();
    }
    
  /*  @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/count")
    public ResponseEntity<List<Project>> getTotalProjects() {
        List<Project> projects = projectService.getAllProjects();
        return ResponseEntity.ok().body(projects);
        }*/
   
    @GetMapping("/counters")
    public ResponseEntity<Map<String, Long>> getProjectCounts() {
        Map<String, Long> counters = new HashMap<>();
        counters.put("totalProjects", projectService.getTotalProjects());
        counters.put("closedProjects", projectService.getClosedProjects());
        counters.put("runningProjects", projectService.getRunningProjects());
        counters.put("closureDelay", projectService.getClosureDelayProjects());
        counters.put("cancelledProjects", projectService.getCancelledProjects());
        return ResponseEntity.ok(counters);
    }
  
    
    //chart
    @GetMapping("/success-data")
    public List<DepartmentStats> getDepartmentStats() {
        return projectService.getDepartmentStats();
    }
    
    //update status
    @PutMapping("/{id}/status")
    public ResponseEntity<Void> updateProjectStatus(@PathVariable Long id, @RequestBody Map<String, String> status) {
        projectService.updateProjectStatus(id, status.get("status"));
        return ResponseEntity.ok().build();
    }
    
}
