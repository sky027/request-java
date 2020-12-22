package com.school.service;

import com.school.bean.po.Department;
import com.school.dao.DepartmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDAO departmentDAO;

    /*
    public Department getDepartmentByID(Integer id) {
        Department department = departmentDAO.selectByPrimaryKey(id);
        if (department == null)
            throw new DepartmentNotFoundException();

        return department;
    }
     */

    public Optional<Department> getDepartmentByID(Integer id) {
        Department department = departmentDAO.selectByPrimaryKey(id);
        return Optional.ofNullable(department);
    }

/*
    public Department demo() {
        xxx;
        xxx;

        if (xxx)
            throw new AException();
        else if (xxx)
            throw new BException();
        else if (xxx)
            throw new CException();
        else
            return xxx;
    }
*/

    public static class DepartmentNotFoundException extends RuntimeException { }
    public static class AException extends RuntimeException { }
    public static class BException extends RuntimeException { }
    public static class CException extends RuntimeException { }
}
