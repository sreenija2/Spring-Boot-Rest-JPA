package com.cg.service;

import java.util.List;

import com.cg.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee2(Employee emp);
	public List<Employee> getAllEmployees();
	public List<Employee> saveEmployee(Employee emp);
	public Employee findEmployee(Integer empId);
	public List<Employee> deleteEmployee(Integer empId);
}
