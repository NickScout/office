package com.office.controller;

import com.office.entity.Employee;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/employees")

public class EmployeeController extends AController<Employee>  { }
