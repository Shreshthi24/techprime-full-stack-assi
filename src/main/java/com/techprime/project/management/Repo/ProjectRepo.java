package com.techprime.project.management.Repo;


import com.techprime.project.management.pojo.ProjectDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<ProjectDetails, Long>  {





}
