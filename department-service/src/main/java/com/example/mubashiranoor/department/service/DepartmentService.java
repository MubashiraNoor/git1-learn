package com.example.mubashiranoor.department.service;

import com.example.mubashiranoor.department.entity.Department;
import com.example.mubashiranoor.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside department service save method");
        return departmentRepository.save(department);
    }


    public Department findDepartmentById(Long id) {
        return departmentRepository.findByDepartmentId(id);
    }
}
