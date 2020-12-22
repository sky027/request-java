package com.school.service.impl;

import com.school.bean.po.ResultPlus;
import com.school.bean.po.Student;
import com.school.common.CommonUtil;
import com.school.dao.StudentDao;
import com.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    @Override
    public ResultPlus listStudent(String student_name) {
        List<Student> result = dao.listStudent(student_name);
        return CommonUtil.requestSuccess("1", result);
    }
}
