package com.school.service;


import com.school.bean.po.ResultPlus;
import com.school.bean.po.Student;

import java.util.HashMap;
import java.util.List;

public interface StudentService {

    /**
     * 查询列表
     * @param map
     * @return
     */
    ResultPlus listStudent(HashMap<String,Object> map);

}
