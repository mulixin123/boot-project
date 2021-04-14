package com.sm.cn.service;

import com.sm.cn.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(Long id);

    void addEmployee(Employee employee) ;


    void undateEmployee(Employee employee);


    void delectEmployee(Long id);

}
