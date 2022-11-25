package com.abdo.employeesystemapi.controller;

import com.abdo.employeesystemapi.model.Employee;
import com.abdo.employeesystemapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    @Autowired
    private EmployeeService servieEmp;
    @PostMapping("/addEmployee")
 public Employee createEmp(@RequestBody Employee emp){
  Employee EMP=  servieEmp.createEmp(emp);
    return EMP;
 }

}
