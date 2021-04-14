package com.sm.cn.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Employee {

  private long employeeId;
  private String employeeName;
  private String employeeImg;
  private String employeeEmail;
  private String employeeDept;
  @JsonFormat(pattern = "yyyy-MM-dd HH:MM:ss")
  private LocalDateTime employeeTime;



}
