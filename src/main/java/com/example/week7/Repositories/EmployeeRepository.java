package com.example.week7.Repositories;

import com.example.week7.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee deleteEmployeeById(Long id);
    Employee findEmployeeByUserNameAndDesignationAndId(String username, String designation, Long id);
}
