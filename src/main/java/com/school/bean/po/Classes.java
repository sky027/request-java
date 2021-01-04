package com.school.bean.po;

import java.io.Serializable;

public class Classes implements Serializable {
    // 班级id
    private String classId;
    // 班级名称
    private String className;
    // 班级总数
    private Integer studentTotal;

    public Classes(String classId, String className, Integer studentTotal) {
        this.classId = classId;
        this.className = className;
        this.studentTotal = studentTotal;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getStudentTotal() {
        return studentTotal;
    }

    public void setStudentTotal(Integer studentTotal) {
        this.studentTotal = studentTotal;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", studentTotal=" + studentTotal +
                '}';
    }
}
