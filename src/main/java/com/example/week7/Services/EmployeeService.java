package com.example.week7.Services;

import com.example.week7.Models.Employee;

import java.util.Optional;

public interface EmployeeService {
    Employee save(Employee employee);
    void deleteById(Long id);
    Optional<Employee> getEmployeeById(Long id);

}
