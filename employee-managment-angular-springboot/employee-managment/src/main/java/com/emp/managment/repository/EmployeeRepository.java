package com.emp.managment.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.emp.managment.bean.EmployeeBean;

public interface EmployeeRepository extends CrudRepository<EmployeeBean, Integer> {
	
	/*@Modifying
	@Query("update EmployeeBean u set u.name = ?1, u.dept = ?2, u.salary=?3 where u.empId = ?4")
	void setEmployeeInfoById(String name, String dept, Integer salary, Integer empId);*/


}
