package com.school.dao;

import com.school.bean.po.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDAO {

    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}