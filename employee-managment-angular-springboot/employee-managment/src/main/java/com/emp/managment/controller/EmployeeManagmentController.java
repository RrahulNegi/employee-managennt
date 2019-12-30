package com.emp.managment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.managment.bean.Department;
import com.emp.managment.bean.Employee;
import com.emp.managment.bean.EmployeeBean;
import com.emp.managment.service.EmployeeManagmentService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class EmployeeManagmentController {
	@Autowired
	EmployeeManagmentService employeeService;
	@PostMapping(value="/addEmployee")
	public void addEmployee(@RequestBody Employee emp){
		EmployeeBean empBean = new EmployeeBean();
		empBean.setName(emp.getName());
		empBean.setDept(emp.getDepartment());
		empBean.setSalary(emp.getSalary());
		System.out.println(emp.getName()+"::"+emp.getSalary()+"::"+emp.getDepartment()+"::"+emp.getEmpId());
		if(emp.getEmpId()==0){
		employeeService.addEmployee(empBean);
		}else{
			employeeService.updateEmployee(emp);
		}
	}
	
	@GetMapping(value="/getEmployee")
	public List<EmployeeBean> getEmployee(){
		System.out.println("Get Emp....");
		return employeeService.getEmployee();
	}

	/*@PostMapping(value="/updateEmployee")
	public void updateEmployee(@RequestBody Employee emp){
		EmployeeBean empBean = new EmployeeBean();
		empBean.setName(emp.getName());
		empBean.setDept(emp.getDepartment());
		empBean.setSalary(emp.getSalary());
		employeeService.updateEmployee(empBean);
	}*/
	
	@DeleteMapping(value="/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable int id){
		employeeService.deleteEmployee(id);
	}
	
	@GetMapping(value="/getDepartment")
	public List<Department>getDepartment(){
		return employeeService.getDepartment();
	}
	
	@GetMapping(value="/getDepartmentCount")
	public Map<String, Integer>getDepartmentCount(){
		return employeeService.getDepartmentCount();
		
	}
}
