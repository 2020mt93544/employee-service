package com.employee.employeeservice.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "db_employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(builderClassName = "EmployeeEntityBuilder")
@ToString
@EqualsAndHashCode(callSuper = false)
public class EmployeeEntity {
    private String id;
    @Field("emp_id")
    private String empId;
    @Field("first_name")
    private String firstName;
    @Field("middle_name")
    private String middleName;
    @Field("last_name")
    private String lastName;
    private String email;
    private String phone;
    @Field("office_location")
    private String officeLocation;
}
