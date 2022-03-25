package com.employee.employeeservice.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {
    private String id;
    @JsonProperty(("emp_id"))
    private String empId;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("last_name")
    private String lastName;
    private String email;
    private String phone;
    @JsonProperty("office_location")
    private String officeLocation;
    private String department;
    private SalaryDetails salary;

}
