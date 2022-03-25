package com.employee.employeeservice.controller;

import com.employee.employeeservice.entity.EmployeeEntity;
import com.employee.employeeservice.response.EmployeeResponse;
import com.employee.employeeservice.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeContoller {

    private final EmployeeService employeeService;

    public EmployeeContoller(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/getEmp")
    public EmployeeResponse getEmpSalaryDetails(@RequestParam String empId) {
        return employeeService.getEmpDetails(empId);
    }

}
