package com.example.baithi.Employees;

import com.example.baithi.Student.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepository employeesRepository;

    public List<Employees> findAll() {
        return employeesRepository.findAll();
    }

    public Employees save(Employees data) {
        return employeesRepository.save(data);
    }

}

