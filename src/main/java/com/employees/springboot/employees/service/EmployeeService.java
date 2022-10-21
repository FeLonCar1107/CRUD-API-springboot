package com.employees.springboot.employees.service;

import com.employees.springboot.employees.model.EmployeeModel;
import com.employees.springboot.employees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public EmployeeModel saveEmployed(EmployeeModel employee) {
        return repository.save(employee);
    }

    public List<EmployeeModel> getEmployees() {
        return  repository.getAllEmployees();
    }

    public EmployeeModel getEmployeeById(int id) {
        return repository.findById(id);
    }

    public String deleteEmployee(int id) {
        repository.delete(id);
        return "El empleado fue elimidado!" + id;
    }

    public EmployeeModel updateEmployee(EmployeeModel employee) {
        return repository.update(employee);
    }
}
