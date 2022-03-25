package com.employee.employeeservice.repository;

import com.employee.employeeservice.entity.EmployeeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeEntity, String> {
    EmployeeEntity findByEmpId(String empId);
}
