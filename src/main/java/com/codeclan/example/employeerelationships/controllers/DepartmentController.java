package com.codeclan.example.employeerelationships.controllers;

import com.codeclan.example.employeerelationships.models.Department;
import com.codeclan.example.employeerelationships.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value = "/departments")
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }
}
