package com.school.dao;

import com.school.bean.po.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDao {

/**
 * 查询所有
 */

    List<Student> listStudent(@Param("student_name") String student_name);

}
