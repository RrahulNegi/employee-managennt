package com.emp.managment.dao;


import java.util.List;

import com.emp.managment.bean.EmployeeBean;
public interface EmployeeManagmentDao {
public void addEmployee(EmployeeBean empBean);
public List<EmployeeBean>getEmployee();
public void updateEmployee(EmployeeBean emp);
public void deleteEmployee(int empid);
}
