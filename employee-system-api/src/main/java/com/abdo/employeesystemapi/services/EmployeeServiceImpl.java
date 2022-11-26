package com.abdo.employeesystemapi.services;

import com.abdo.employeesystemapi.entities.EmployeeEntity;
import com.abdo.employeesystemapi.model.Employee;
import com.abdo.employeesystemapi.repositories.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class EmployeeServiceImpl  implements  EmployeeService{
    @Autowired
     private EmployeeRepository Emprepo;


    @Override
    public Employee createEmp(Employee emp) {
        EmployeeEntity Empetity= new EmployeeEntity();
        BeanUtils.copyProperties(emp,Empetity);
        Emprepo.save(Empetity);
        return emp;


    }

    @Override
    public List<Employee> getAllEmployees() {
        List<EmployeeEntity> empEntity=Emprepo.findAll();
        List<Employee> employees=empEntity.stream()
                .map(emp -> new Employee(
                        emp.getId(),
                        emp.getFirstName(),
                        emp.getLastName(),
                        emp.getEmail()))
                .collect(Collectors.toList());

        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        EmployeeEntity employee=Emprepo.findById(id).get();
        Emprepo.delete(employee);
        return true;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        EmployeeEntity employee=Emprepo.findById(id).get();
        Employee emp= new Employee();
        BeanUtils.copyProperties(employee,emp);
        return emp;
    }
}
