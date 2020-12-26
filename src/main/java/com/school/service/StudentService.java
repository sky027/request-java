package com.school.service;


import com.school.bean.po.QueryCondition;
import com.school.bean.po.ResultPlus;
import com.school.bean.po.Student;

import java.util.HashMap;
import java.util.List;

public interface StudentService {

    /**
     * 查询列表
     * @param queryCondition
     * @return
     */
    ResultPlus listStudent(QueryCondition queryCondition);

}
