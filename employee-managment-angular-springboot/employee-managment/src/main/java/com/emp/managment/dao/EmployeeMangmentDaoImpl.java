package com.emp.managment.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emp.managment.bean.EmployeeBean;
import com.emp.managment.repository.EmployeeRepository;

@Component

public class EmployeeMangmentDaoImpl implements EmployeeManagmentDao {
	@Autowired
	EmployeeRepository employeeRepository;
	public void addEmployee(EmployeeBean empBean) {
		System.out.println("In Dao...");
		employeeRepository.save(empBean);
	}
	public List<EmployeeBean> getEmployee() {
		return (List<EmployeeBean>) employeeRepository.findAll();
	}
	public void updateEmployee(EmployeeBean emp) {
		Optional<EmployeeBean> employeeOpt=employeeRepository.findById(emp.getEmpId());
		System.out.println("OPT======>>"+employeeOpt.isPresent()+" empId===="+emp.getEmpId());
		if(employeeOpt.isPresent()){
		EmployeeBean employee=	employeeOpt.get();
		employee.setName(emp.getName());
		employee.setDept(emp.getDept());
		employee.setSalary(emp.getSalary());
		
		employeeRepository.save(employee);
		}
		
				
	}
	public void deleteEmployee(int empid) {
		employeeRepository.deleteById(empid);
	}

}
