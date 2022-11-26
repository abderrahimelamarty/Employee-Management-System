package com.abdo.employeesystemapi.services;

import com.abdo.employeesystemapi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmp(Employee emp);

    List<Employee> getAllEmployees();

    boolean deleteEmployee(Long id);

    Employee getEmployeeById(Long id);
}
