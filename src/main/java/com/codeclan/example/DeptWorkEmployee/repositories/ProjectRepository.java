package com.codeclan.example.DeptWorkEmployee.repositories;

import com.codeclan.example.DeptWorkEmployee.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}