package com.school.dao;

import com.school.bean.po.Classes;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassesDao {

    /**
     * 查询班级列表
     */
    List<Classes> queryClass();
}
