package com.school.service.impl;

import com.school.bean.po.QueryCondition;
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
    public ResultPlus listStudent(QueryCondition queryCondition) {
        List<Student> student = studentDao.listStudent(queryCondition);
        // int total = studentDao.queryCount();
        int total = student.size();
        Integer start = (queryCondition.getPageIndex() - 1) * queryCondition.getPageSize();
        Integer end = queryCondition.getPageIndex() * queryCondition.getPageSize();
        if (student.size() < end) {
            end = student.size();
        }
        System.out.println(end);
         List<Student> list = student.subList(start, end);
        return CommonUtil.pageRequestSuccess(total, queryCondition.getPageSize(), queryCondition.getPageIndex(), list);
    }
}
