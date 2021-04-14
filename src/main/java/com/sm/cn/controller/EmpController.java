package com.sm.cn.controller;

import com.sm.cn.entity.Employee;
import com.sm.cn.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class EmpController {

    @Resource
    EmployeeService employeeService;
    @GetMapping("findAll")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
