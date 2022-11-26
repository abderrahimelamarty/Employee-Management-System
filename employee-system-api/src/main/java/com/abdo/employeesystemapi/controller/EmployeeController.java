package com.abdo.employeesystemapi.controller;

import com.abdo.employeesystemapi.model.Employee;
import com.abdo.employeesystemapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 @GetMapping("/Employees")
 public List<Employee> getAllEmployees(){
        return servieEmp.getAllEmployees();

 }
 @DeleteMapping("/deleteEmployee/{id}")
 public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id){
 boolean deleted=false;
 deleted=servieEmp.deleteEmployee(id);
 //System.out.println(deleted);
 Map<String,Boolean> response=new HashMap<>();
 response.put("deleted",deleted);
 return ResponseEntity.ok(response);
 }
 public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
  Employee employee=null;
  employee=servieEmp.getEmployeeById(id);
  return ResponseEntity.ok(employee);
 }
 public  ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employee){

return ResponseEntity.ok(employee);
 }

}
