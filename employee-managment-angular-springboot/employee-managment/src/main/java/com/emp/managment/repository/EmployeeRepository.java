package com.emp.managment.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.emp.managment.bean.EmployeeBean;

public interface EmployeeRepository extends CrudRepository<EmployeeBean, Integer> {
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value="update Employee u set u.name = :name, u.department =:department, u.salary=:salary where u.emp_id =:empId", nativeQuery = true)
	void setEmployeeBeanByEmpId(@Param("name") String name,@Param("department") String department, @Param("salary") Integer salary, @Param("empId") int empId);


}
