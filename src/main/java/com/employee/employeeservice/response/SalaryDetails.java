package com.employee.employeeservice.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaryDetails {
    private Long basic;
    private Long hra;
    private Long allowance;
    private Long pf;
}
