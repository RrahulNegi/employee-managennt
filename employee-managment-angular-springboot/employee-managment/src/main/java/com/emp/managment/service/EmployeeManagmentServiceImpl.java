package com.emp.managment.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emp.managment.bean.Department;
import com.emp.managment.bean.Employee;
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
		return employeeDao.getEmployee();
	}

	public void updateEmployee(Employee emp) {
		
		 employeeDao.updateEmployee(emp);
	}

	public void deleteEmployee(int empid) {
		employeeDao.deleteEmployee(empid);
		
	}

	@Override
	public List<Department> getDepartment() {
		return employeeDao.getDepartment();
	}

	@Override
	public Map<String, Integer> getDepartmentCount() {
		List<Department>depList=getDepartment();
		Map<String, String>map=new HashMap<>();
		Map<String,Integer>countMap=new HashMap<>();
		int hrCount=0;
		for(Department dp: depList)
		{
			map.put(dp.getDepartmentname(), dp.getDepartmentname());
		}
		
		Set<String> depSet=map.keySet();
		map.forEach((k,v)->{
		System.out.println(k+"::"+v);
		int count=countDepartment(k);
		System.out.println(k+" count no :- "+count);
		countMap.put(k, count);
		}
		
		);
		System.out.println("Count===>>"+countMap);
		return countMap;
	}
	
	private int countDepartment(String depName){
		
	int count=0;
		for(EmployeeBean empBean:getEmployee()){
			System.out.println("Map=="+depName);
			if(depName.equals(empBean.getDepartment())){
				count++;
			}
	}
		return count;
}
}