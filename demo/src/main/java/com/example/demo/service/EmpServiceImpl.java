package com.example.demo.service;

import com.example.demo.model.Emp;
import com.example.demo.repository.practice.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    public EmpRepository empRepository;

    @Override
    public List<Emp> getEmp() {
        System.out.println("EmpServiceImpl");
        return empRepository.findAll();
    }

}
