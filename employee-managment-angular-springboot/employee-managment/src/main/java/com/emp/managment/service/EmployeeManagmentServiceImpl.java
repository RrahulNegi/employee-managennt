package com.emp.managment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emp.managment.bean.EmployeeBean;
import com.emp.managment.dao.EmployeeManagmentDao;
@Component

public class EmployeeManagmentServiceImpl implements EmployeeManagmentService {
	@Autowired
	EmployeeManagmentDao employeeDao;
	
	public void addEmployee(EmployeeBean empBean) {
		System.out.println("In Service..");
		employeeDao.addEmployee(empBean);
	}

	public List<EmployeeBean> getEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployee();
	}

	public void updateEmployee(EmployeeBean emp) {
		
		 employeeDao.updateEmployee(emp);
	}

	public void deleteEmployee(int empid) {
		employeeDao.deleteEmployee(empid);
		
	}

}
