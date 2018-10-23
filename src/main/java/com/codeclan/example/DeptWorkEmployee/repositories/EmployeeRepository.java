package com.codeclan.example.DeptWorkEmployee.repositories;

import com.codeclan.example.DeptWorkEmployee.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
