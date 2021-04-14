package com.sm.cn.service.impl;

import com.sm.cn.entity.Employee;
import com.sm.cn.mapper.EmployeeMapper;
import com.sm.cn.service.EmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findAll() {

        return employeeMapper.findAll();
    }

    @Override
    public Employee findById(Long id) {

        return employeeMapper.findById(id);
    }

    @Override
    public void addEmployee(Employee employee) {
    employeeMapper.addEmployee(employee);
    }

    @Override
    public void undateEmployee(Employee employee) {
    employeeMapper.undateEmployee(employee);
    }

    @Override
    public void delectEmployee(Long id) {
    employeeMapper.delectEmployee(id);
    }
}
