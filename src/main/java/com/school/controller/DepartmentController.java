package com.school.controller;

import com.school.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department/{id}")
    @CrossOrigin("*")
    /*public ResponseEntity<Department> getDepartment(@PathVariable Integer id) {
        Department department = departmentService.getDepartmentByID(id)
                .orElseThrow(DepartmentService.DepartmentNotFoundException::new);
        return ResponseEntity.ok(department);
    }*/
    public String getDepartment(@PathVariable Integer id) {
        return "123";
    }

}


/*

    departmentService.xxx();
    正常代码执行流程


 */