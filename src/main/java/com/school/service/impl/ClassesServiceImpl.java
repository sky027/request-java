package com.school.service.impl;

import com.school.bean.po.Classes;
import com.school.bean.po.ResultPlus;
import com.school.common.CommonUtil;
import com.school.dao.ClassesDao;
import com.school.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {

    @Autowired
    private ClassesDao classesDao;

    @Override
    public ResultPlus queryClass() {
        List<Classes> list = classesDao.queryClass();
        return CommonUtil.requestSuccess("1", list);
    }
}
