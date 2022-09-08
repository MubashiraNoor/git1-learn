package com.example.mubashiranoor.department.controller;

import com.example.mubashiranoor.department.entity.Department;
import com.example.mubashiranoor.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/departments")
@RestController
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("inside department controller save method");
        return departmentService.saveDepartment(department);
    }



    @GetMapping("/{id}")
    public Department saveDepartment(@PathVariable Long id){
        return departmentService.findDepartmentById(id);
    }
}
