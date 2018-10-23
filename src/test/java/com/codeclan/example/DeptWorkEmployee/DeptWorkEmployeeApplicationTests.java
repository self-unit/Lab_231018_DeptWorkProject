package com.codeclan.example.DeptWorkEmployee;

import com.codeclan.example.DeptWorkEmployee.models.Department;
import com.codeclan.example.DeptWorkEmployee.models.Employee;
import com.codeclan.example.DeptWorkEmployee.models.Project;
import com.codeclan.example.DeptWorkEmployee.repositories.DepartmentRepository;
import com.codeclan.example.DeptWorkEmployee.repositories.EmployeeRepository;
import com.codeclan.example.DeptWorkEmployee.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptWorkEmployeeApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveEmployee(){
		Department department = new Department("Accounts");
		departmentRepository.save(department);
		Employee employee = new Employee("Sandy", "Trees", 43554, department);
		employeeRepository.save(employee);
	}

	@Test
	public void canSaveDepartment(){
		Department department = new Department("Accounts");
		departmentRepository.save(department);
	}

	@Test
	public void canSaveProject(){
		Project project = new Project("Project", 56);
		projectRepository.save(project);
	}

}
