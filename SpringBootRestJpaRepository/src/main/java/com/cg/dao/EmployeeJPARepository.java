package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.model.Employee;

@Repository
public interface EmployeeJPARepository extends JpaRepository<Employee, Integer> {
//	public List<Employee> findByEmpName(String empName);
//	
//	@Query("SELECT emp FROM Employee emp WHERE emp.empSalary>=:sal ") //JPQL
//	public List<Employee> getBySalary(@Param("sal") double salary);
}
