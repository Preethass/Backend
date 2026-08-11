package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    @Autowired //Find an object (bean) of this type and automatically assign it to this variable
    private EmployeeService employeeService;
    private static final Logger log =
            LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping("/create")
    public ResponseEntity<Employee> create(@RequestBody Employee employee) {
        try {
            log.info("Received employee: {}", employee);

            Employee savedEmployee =
                    employeeService.createEmployee(employee);

            return ResponseEntity.ok(savedEmployee);

        } catch (Exception e) {
            log.error("Error while creating employee", e);
            return ResponseEntity.internalServerError().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> delete(@PathVariable int id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("Deleted Successfully");
    }

    @PatchMapping("/update")
    public ResponseEntity<List<Employee>> update(@RequestBody Employee employee) {
        List<Employee> updatedEmployee = employeeService.updateEmployee(employee);
        return ResponseEntity.ok(updatedEmployee);
    }
    @GetMapping("/getUsers")
    public ResponseEntity <List<Employee>> getUsers(){
      // List<Employee> employees= new ArrayList<>();
        List<Employee> employees = employeeService.getAllEmployees();
//        employees.add(new Employee(1, "Preetha", "Developer"));
//        employees.add(new Employee(2, "John", "Tester"));
        return ResponseEntity.ok(employees);
    }
}
