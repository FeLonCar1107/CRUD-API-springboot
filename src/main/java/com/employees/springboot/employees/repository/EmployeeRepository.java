package com.employees.springboot.employees.repository;

import com.employees.springboot.employees.model.EmployeeModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {
    private List<EmployeeModel> list = new ArrayList<EmployeeModel>();

    public void createEmployee() {
                list.add(new EmployeeModel(1, "Felipe", "Londoño", "pipe20001107@gmmail.com", "3014072955", 22, "Ing.Sistemas y Telecomunicaciones"));
                list.add(new EmployeeModel(2, "Sebastian", "Martinez", "sebastian@gmmail.com", "3456542313", 23, "Ing.Sistemas y Telecomunicaciones"));
    }

    public List<EmployeeModel> getAllEmployees() {
        return list;
    }

    public EmployeeModel findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == (id)) {
                return list.get(i);
            }
        }
        return null;
    }

    public List<EmployeeModel> searchByName(String name) {
        return list.stream().filter(employee -> employee.getName().startsWith(name)).collect(Collectors.toList());
    }

    public EmployeeModel save(EmployeeModel e) {
        EmployeeModel employee = new EmployeeModel();
        employee.setId(e.getId());
        employee.setName(e.getName());
        employee.setLastName(e.getLastName());
        employee.setEmail(e.getEmail());
        employee.setPhone(e.getPhone());
        employee.setAge(e.getAge());
        employee.setTitle(e.getTitle());
        list.add(employee);
        return employee;
    }

    public String delete(Integer id) {
        list.removeIf(employee -> employee.getId() == (id));
        return null;
    }

    public EmployeeModel update(EmployeeModel e) {
        int index = 0;
        int id = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == (e.getId())) {
                id = e.getId();
                index = i;
                break;
            }
        }

        EmployeeModel employee = new EmployeeModel();
        employee.setId(id);
        employee.setName(e.getName());
        employee.setLastName(e.getLastName());
        employee.setEmail(e.getEmail());
        employee.setPhone(e.getPhone());
        employee.setAge(e.getAge());
        employee.setTitle(e.getTitle());
        list.set(index, employee);
        return employee;
    }
}
