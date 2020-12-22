package com.school.service;

import com.school.bean.po.ResultPlus;
import com.school.bean.po.User;

public interface UserService {

    // 新增
    ResultPlus addUser(User user);

    // 查询
    ResultPlus queryUserByAccount(String account, String password);
}
