package com.employee.employeeservice.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpDeptResponse {
    private String id;
    @JsonProperty("emp_id")
    private String empId;
    @JsonProperty("dept_id")
    private String deptId;
    @JsonProperty("dept_name")
    private String deptName;
}

