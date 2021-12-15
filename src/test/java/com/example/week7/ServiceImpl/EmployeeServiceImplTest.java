package com.example.week7.ServiceImpl;

import com.example.week7.Models.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.quality.Strictness;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("Test")
@RunWith(MockitoJUnitRunner.Silent.class)
public class EmployeeServiceImplTest {
    @Mock
    private EmployeeServiceImpl employeeService;
    private final Employee employee = new Employee();


    @Test
    public void testAddEmployee(){

        employee.setId(1l);
        employee.setName("Agbero Oga");
        employee.setDesignation("Streets");

        Mockito.when(employeeService.save(employee)).thenReturn(employee);


    }

    @Test
    public void getEmployeeShouldThrowNullPointerException() throws Exception {

        employee.setId(1l);
        employee.setName("Agbero Oga");
        employee.setDesignation("Streets");

    }

}