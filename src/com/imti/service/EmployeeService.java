package com.imti.service;

import com.imti.mapper.EmployeeMapper;
import com.imti.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: ahy
 * @Date:2020/4/15
 * @Description:com.imti.service
 * @Version:1.0
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    public Employee findEmpById(Integer id){
        return employeeMapper.findEmpById(id);
    }
}
