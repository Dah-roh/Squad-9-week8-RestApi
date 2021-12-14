package com.example.week7.Controllers;


import com.example.week7.Models.Employee;
import com.example.week7.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//the controller annotation is meant for MVC, while the restController annotation is meant for Rest API
@RestController
@RequestMapping("/")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    @PostMapping("employee")
    public Employee saveEmployeeDetails(@RequestBody Employee employee) {
        System.out.println(employee);
        return employeeService.save(employee);
    }
}
