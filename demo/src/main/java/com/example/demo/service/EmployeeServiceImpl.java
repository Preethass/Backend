package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

        @Autowired
        private EmployeeRepository employeeRepository;

        @Override
        public List<Employee> getAllEmployees() {
            return employeeRepository.findAll();
        }

        @Override
        public Employee getEmployeeById(Integer id) {
            return employeeRepository.findById(id).orElse(null);
        }
    @Override
    public List<Employee> updateEmployee(Employee employee) {
        Employee existingEmployee = employeeRepository
                .findById(employee.getId())
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        existingEmployee.setName(employee.getName());
        existingEmployee.setRole(employee.getRole());

        employeeRepository.save(existingEmployee);
        return employeeRepository.findAll();

    }
        @Override
        public Employee createEmployee(Employee employee) {
            return employeeRepository.save(employee);
        }

        @Override
        public void deleteEmployee(Integer id) {
            employeeRepository.deleteById(id);
        }
    }


