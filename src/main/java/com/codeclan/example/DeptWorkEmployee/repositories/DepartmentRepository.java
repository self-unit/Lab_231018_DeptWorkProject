package com.codeclan.example.DeptWorkEmployee.repositories;

import com.codeclan.example.DeptWorkEmployee.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
