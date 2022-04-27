package com.example.baithi.Employees;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/V1/employess")
public class EmployessApi {

    @Autowired
    EmployeesService employeesService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Employees>> findAllEmployees() {
        return ResponseEntity.ok(employeesService.findAll());
    }

    @PostMapping
    public ResponseEntity<Employees> createEmployees(@RequestBody Employees p) {
        return ResponseEntity.ok(employeesService.save(p));
    }
}
