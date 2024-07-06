package com.techprime.project.management.Repo;


import com.techprime.project.management.pojo.DepartmentStats;
//import com.techprime.project.management.pojo.DepartmentStats;
import com.techprime.project.management.pojo.Project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project,Long>
{
	@Query("SELECT COUNT(p) FROM Project p")
    long countAllProjects();

    @Query("SELECT COUNT(p) FROM Project p WHERE p.status = 'Closed'")
    long countClosedProjects();

    @Query("SELECT COUNT(p) FROM Project p WHERE p.status = 'Running'")
    long countRunningProjects();

    @Query("SELECT COUNT(p) FROM Project p WHERE p.status = 'Closure Delay'")
    long countClosureDelayProjects();

    @Query("SELECT COUNT(p) FROM Project p WHERE p.status = 'Cancelled'")
    long countCancelledProjects();
    
    // for chart
  /* @Query("SELECT Project (p.department, COUNT(p), SUM(CASE WHEN p.status = 'Closed' THEN 1 ELSE 0 END)) " +
         "FROM Project p GROUP BY p.department")
     List<Project> getDepartmentStats();
	*/

   @Query("SELECT new com.techprime.project.management.pojo.DepartmentStats(p.department, COUNT(p), SUM(CASE WHEN p.status = 'Closed' THEN 1 ELSE 0 END)) " +
           "FROM Project p GROUP BY p.department")
    List<DepartmentStats> getDepartmentStats();
}
