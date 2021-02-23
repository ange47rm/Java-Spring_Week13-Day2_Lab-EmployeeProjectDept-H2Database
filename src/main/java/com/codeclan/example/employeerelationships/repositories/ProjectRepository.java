package com.codeclan.example.employeerelationships.repositories;

import com.codeclan.example.employeerelationships.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
