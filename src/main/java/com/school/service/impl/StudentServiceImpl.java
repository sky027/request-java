package com.school.service.impl;

import com.school.bean.po.ResultPlus;
import com.school.bean.po.Student;
import com.school.common.CommonUtil;
import com.school.dao.StudentDao;
import com.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public ResultPlus listStudent(HashMap<String,Object> map) {
        List<Student> list = studentDao.listStudent(map);
        int total = studentDao.queryCount();
        return CommonUtil.pageRequestSuccess(total, 10, 1, list);
    }
}
