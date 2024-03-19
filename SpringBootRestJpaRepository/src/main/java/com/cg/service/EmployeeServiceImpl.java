package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmployeeJPARepository;
import com.cg.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeJPARepository empRepo;
	@Override
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}
	public List<Employee> saveEmployee(Employee emp){
		empRepo.saveAndFlush(emp);
		return empRepo.findAll();
	}
	@Override
	public Employee saveEmployee2(Employee emp) {
		System.out.println("inside saveEmployee2 method");
		return empRepo.save(emp);
	}
	@Override
	public Employee findEmployee(Integer empId) {
		Optional<Employee> emp = empRepo.findById(empId);
		return emp.get();
	}
	@Override
	public List<Employee> deleteEmployee(Integer empId) {
		empRepo.deleteById(empId);
		return empRepo.findAll();
	}
}
