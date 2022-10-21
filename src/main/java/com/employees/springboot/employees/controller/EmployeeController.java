package com.employees.springboot.employees.controller;

import com.employees.springboot.employees.model.EmployeeModel;
import com.employees.springboot.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public EmployeeModel addEmployee(@RequestBody EmployeeModel employee) {
        return service.saveEmployed(employee);
    }

    @GetMapping
    public List<EmployeeModel> findAllEmployees() {
        return service.getEmployees();
    }

    @GetMapping("{id}")
    public EmployeeModel findEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PutMapping
    public EmployeeModel updateEmployee(@RequestBody EmployeeModel employee) {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
}
