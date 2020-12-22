package com.school.bean.po;

import java.io.Serializable;

public class Classes implements Serializable {
    // 班级id
    private String class_id;
    // 班级名称
    private String class_name;

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }
}
