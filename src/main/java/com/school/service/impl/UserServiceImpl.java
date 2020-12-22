package com.school.service.impl;

import com.school.bean.po.ResultPlus;
import com.school.bean.po.User;
import com.school.common.CommonUtil;
import com.school.dao.UserDao;
import com.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    // 新增
    public ResultPlus addUser(User user) {
        int result = userDao.addUser(user);
        if(result != 0) {
            return CommonUtil.requestSuccess("1", null);
        } else {
            return CommonUtil.requestError();
        }
    }

    // 查询
    public ResultPlus queryUserByAccount(String account, String password) {
        List<User> result = userDao.queryUserByAccount(account, password);
        if (CollectionUtils.isEmpty(result)) {
            return CommonUtil.requestError();
        } else {
            return CommonUtil.requestSuccess("1", result);
        }
    }
}
