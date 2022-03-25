package com.employee.employeeservice.service.impl;

import com.employee.employeeservice.entity.EmployeeEntity;
import com.employee.employeeservice.repository.EmployeeRepository;
import com.employee.employeeservice.response.EmpDeptResponse;
import com.employee.employeeservice.response.EmployeeResponse;
import com.employee.employeeservice.response.SalaryDetails;
import com.employee.employeeservice.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final RestTemplate restTemplate;
    @Value("${departmentHost}")
    private String departmentHost;
    @Value("${salaryHost}")
    private String salaryHost;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, RestTemplate restTemplate) {
        this.employeeRepository = employeeRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public EmployeeResponse getEmpDetails(String empId) {
        EmployeeResponse response = new EmployeeResponse();
        try {
            EmployeeEntity employeeEntity = employeeRepository.findByEmpId(empId);
            BeanUtils.copyProperties(employeeEntity, response);
            EmpDeptResponse dept = restTemplate.getForObject(departmentHost + "/getEmpDept?empId=" + employeeEntity.getId(), EmpDeptResponse.class);
            response.setDepartment(dept.getDeptName());
            SalaryDetails salary = restTemplate.getForObject(salaryHost + "/getEmpSalary?empId=" + employeeEntity.getId(), SalaryDetails.class);
            response.setSalary(salary);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
