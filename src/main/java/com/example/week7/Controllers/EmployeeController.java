package com.example.week7.Controllers;


import com.example.week7.Models.Employee;
import com.example.week7.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//the controller annotation is meant for MVC, while the restController annotation is meant for Rest API
@RestController
@RequestMapping("/")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @DeleteMapping("employee/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long id){
        return employeeService.deleteById(id);
    }

    @GetMapping("employee/delete")
    public String deleteAnEmployee(@RequestParam("id") Long id){
        return employeeService.deleteById(id);
    }

    @GetMapping("employee/get/{id}")
    public Employee getEmployee(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id).get();
    }

    @GetMapping("employee/get")
    public Employee getAnEmployeeByQueriedId(@RequestParam("id") Long id){
        return employeeService.getEmployeeById(id).get();
    }

    @PostMapping("employee")
    public Employee saveEmployeeDetails(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

}
