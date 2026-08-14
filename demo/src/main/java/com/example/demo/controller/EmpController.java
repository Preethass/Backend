package com.example.demo.controller;

import com.example.demo.model.Emp;
import com.example.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")

public class EmpController {
    @Autowired //Find an object (bean) of this type and automatically assign it to this variable
    private EmpService empService;

    @GetMapping("/getEmp")
    public ResponseEntity<List<Emp>> getEmployees() {
        List<Emp> employees = empService.getEmp();
        return ResponseEntity.ok(employees);
    }
}
