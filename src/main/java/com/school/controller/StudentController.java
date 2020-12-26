package com.school.controller;

import com.school.bean.po.QueryCondition;
import com.school.bean.po.ResultPlus;
import com.school.bean.po.Student;
import com.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/listStudent")
    private ResultPlus listStudent(@RequestBody QueryCondition queryCondition) {
        return service.listStudent(queryCondition);
    }


}
