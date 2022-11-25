package com.abdo.employeesystemapi.services;

import com.abdo.employeesystemapi.entities.EmployeeEntity;
import com.abdo.employeesystemapi.model.Employee;
import com.abdo.employeesystemapi.repositories.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
