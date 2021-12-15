package com.example.week7.ServiceImpl;

import com.example.week7.Models.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("Test")
@RunWith(SpringJUnit4ClassRunner.class)
class EmployeeServiceImplTest {

    private EmployeeServiceImpl employeeService;

    private Employee employee;

    @Autowired
    EmployeeServiceImplTest(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @Test
    public void testAddEmployee(){
        employee.setId(1l);
        employee.setName("Agbero Oga");
        employee.setDesignation("Streets");

        Mockito.when(employeeService.save(employee)).thenReturn(employee);


    }

}