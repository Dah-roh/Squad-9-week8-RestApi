package com.example.week7.Models;


import lombok.Data;

import javax.persistence.*;


public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    private String designation;
    private String userName;
}
