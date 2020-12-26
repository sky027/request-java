package com.school.dao;

import com.school.bean.po.QueryCondition;
import com.school.bean.po.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface StudentDao {

    /**
     * 查询学生列表
     */
    List<Student> listStudent(QueryCondition queryCondition);

    /**
     * 查询总数
     */
    int queryCount();

}
