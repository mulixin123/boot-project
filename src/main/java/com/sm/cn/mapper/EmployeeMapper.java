package com.sm.cn.mapper;

import com.sm.cn.entity.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmployeeMapper {
    @Select("select * from employee")
    public List<Employee> findAll();

    @Select("select * from employee WHERE employee_id=#{id}")
    public Employee findById(Long id);

    @Insert("insert into employee (employee_name,employee_img,employee_email,employee_dept,employee_time) value #{employeeName},#{employeeImg},#{employeeEmail},#{employeeDept},#{employeeTime},")
    public void addEmployee(Employee employee) ;

    @Update("update employee set employee_name=#{employeeName},employee_img=#{employeeImg},employee_email=#{employeeEmail},employee_dept=#{employeeDept},employeeTime=#{employeeTime} where employee_id=#{employeeId}")
    public void undateEmployee(Employee employee);

    @Delete("delect from employee where employee_id=#{id} ")
    public void delectEmployee(Long id);
}
