package com.example.week7.ServiceImpl;

import com.example.week7.Models.Employee;
import com.example.week7.Repositories.EmployeeRepository;
import com.example.week7.Services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    //ATOMIC -- ACID
    //@Transactional

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
        public String deleteById(Long id) {
        employeeRepository.deleteById(id);
        return HttpStatus.OK.toString();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

}
