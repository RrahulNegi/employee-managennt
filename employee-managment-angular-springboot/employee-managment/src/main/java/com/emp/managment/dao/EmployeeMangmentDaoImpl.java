package com.emp.managment.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emp.managment.bean.Department;
import com.emp.managment.bean.Employee;
import com.emp.managment.bean.EmployeeBean;
import com.emp.managment.repository.DepartmentRepository;
import com.emp.managment.repository.EmployeeRepository;

@Component

public class EmployeeMangmentDaoImpl implements EmployeeManagmentDao {
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	DepartmentRepository departmentRepository;
	
	public void addEmployee(EmployeeBean empBean) {
		System.out.println("In Dao...");
		employeeRepository.save(empBean);
	}
	public List<EmployeeBean> getEmployee() {
		return (List<EmployeeBean>) employeeRepository.findAll();
	}
	public void updateEmployee(Employee emp) {
		Optional<EmployeeBean> employeeOpt=employeeRepository.findById(emp.getEmpId());
		System.out.println("OPT======>>"+employeeOpt.isPresent()+" empId===="+emp.getEmpId());
		if(employeeOpt.isPresent()){
		EmployeeBean employee=	employeeOpt.get();
		/*employee.setName(emp.getName());
		employee.setDept(emp.getDepartment());
		employee.setSalary(emp.getSalary());
		employee*/
		
		employeeRepository.setEmployeeBeanByEmpId(emp.getName(), emp.getDepartment(), emp.getSalary(), emp.getEmpId());
	

		}
		
				
	}
	public void deleteEmployee(int empid) {
		employeeRepository.deleteById(empid);
	}
	/*@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}*/
	@Override
	public List<Department> getDepartment() {
		// TODO Auto-generated method stub
		return (List<Department>) departmentRepository.findAll();
	}

}
