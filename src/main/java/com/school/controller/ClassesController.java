package com.school.controller;

import com.school.bean.po.ResultPlus;
import com.school.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/classes")
public class ClassesController {
    @Autowired
    private ClassesService classesService;
    /**
     * 查询
     */
    @PostMapping("/classList")
    private ResultPlus queryClass() {
        return classesService.queryClass();
    }
}
