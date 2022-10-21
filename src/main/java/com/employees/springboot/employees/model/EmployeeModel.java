package com.employees.springboot.employees.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeModel {
    private int id;
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private int age;
    private String title;
}
