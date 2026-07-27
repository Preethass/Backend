package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {


    private static final Logger log =
            LoggerFactory.getLogger(EmployeeController.class);

    @PostMapping("/create")
    public ResponseEntity <Employee> create(@RequestBody Employee employee){ //@RequestBody DataType variableName
        try{

            log.info("employee {}",employee);
        }catch(Exception e){

            log.info("error"+e);

        }

        return ResponseEntity.ok(employee);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity <String> delete(@PathVariable int id){
        return ResponseEntity.ok("Deleted Successfully");
    }

    @PatchMapping("/update")
    public ResponseEntity <Employee> update(@RequestBody Employee employee){
        return ResponseEntity.ok(employee);
    }
    @GetMapping("/getUsers")
    public ResponseEntity <List<Employee>> getUsers(){
        List<Employee> employees= new ArrayList<>();
        employees.add(new Employee(1, "Preetha", "Developer"));
        employees.add(new Employee(2, "John", "Tester"));
        return ResponseEntity.ok(employees);
    }
}
