package com.emp.managment.service;


import java.util.List;

import com.emp.managment.bean.EmployeeBean;
public interface EmployeeManagmentService {
public void addEmployee(EmployeeBean empBean);
public List<EmployeeBean>getEmployee();

public void updateEmployee(EmployeeBean emp);
public void deleteEmployee(int empid);
}
