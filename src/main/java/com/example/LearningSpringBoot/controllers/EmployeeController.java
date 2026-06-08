package com.example.LearningSpringBoot.controllers;

import com.example.LearningSpringBoot.dto.EmployeeDTO;
import com.example.LearningSpringBoot.services.EmployeeSerivce;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeSerivce employeeSerivce;

    public EmployeeController(EmployeeSerivce employeeSerivce) {
        this.employeeSerivce = employeeSerivce;
    }

    @GetMapping("/{employeeId}")
    public EmployeeDTO getEmployeeById(@PathVariable Long employeeId) {
        return employeeSerivce.getEmployeeById(employeeId);
    }

    @GetMapping("")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeSerivce.getAllEmployees();
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(EmployeeDTO employeeDTO) {
        return employeeSerivce.createNewEmployee(employeeDTO);
    }
}
