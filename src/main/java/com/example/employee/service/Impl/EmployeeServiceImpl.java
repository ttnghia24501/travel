package com.example.employee.service.Impl;

import com.example.employee.jpa.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> listEmployee() {
        try{
            List<Employee> employees = employeeRepository.findAll();
            return  employees;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Employee getEmployeeById(int id) {
        try{
            return employeeRepository.findById(id).get();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean saveEmployee(Employee employee) {
        try {
            employeeRepository.save(employee);
            return true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }


    @Override
    public boolean updateEmployee(Employee employee) {
        try{
            employeeRepository.save(employee);
            return true;

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
}
