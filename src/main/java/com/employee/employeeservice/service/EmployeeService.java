package com.employee.employeeservice.service;

import com.employee.employeeservice.entity.EmployeeEntity;
import com.employee.employeeservice.response.EmployeeResponse;

public interface EmployeeService {
    EmployeeResponse getEmpDetails(String empId);
}
