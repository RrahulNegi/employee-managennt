package com.emp.managment.service;


import java.util.List;
import java.util.Map;

import com.emp.managment.bean.Department;
import com.emp.managment.bean.Employee;
import com.emp.managment.bean.EmployeeBean;
public interface EmployeeManagmentService {
public void addEmployee(EmployeeBean empBean);
public List<EmployeeBean> getEmployee();

public void updateEmployee(Employee emp);
public void deleteEmployee(int empid);
public List<Department> getDepartment();
public Map<String, Integer> getDepartmentCount();
}
