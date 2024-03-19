package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Employee;
import com.cg.service.EmployeeService;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	@Autowired
	private EmployeeService empServ;
	@PostMapping(path="/insert", consumes="application/json", produces="application/json")
	public ResponseEntity<List<Employee>> insertEmployee(@RequestBody Employee emp){
		List<Employee> employee = empServ.saveEmployee(emp);
		if(employee == null) {
			return new ResponseEntity("Sorry! Employees not available!", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(employee, HttpStatus.OK);
	}
	@GetMapping(path="/get", produces="application/json")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> emps = empServ.getAllEmployees();
		if(emps.isEmpty()) {
			return new ResponseEntity("Sorry! Employees not available!", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(emps, HttpStatus.OK);
	}
	@PostMapping(path="/save", produces="application/json")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
		Employee employee = empServ.saveEmployee2(emp);
		if(employee == null) {
			return new ResponseEntity("Sorry! Employees not available!", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(employee, HttpStatus.OK);
	}
	
}
