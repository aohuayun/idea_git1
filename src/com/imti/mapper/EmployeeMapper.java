package com.imti.mapper;

import com.imti.pojo.Employee;

/**
 * @Author: ahy
 * @Date:2020/4/15
 * @Description:com.imti.mapper
 * @Version:1.0
 */
public interface EmployeeMapper {
    public Employee findEmpById(Integer id);
}
