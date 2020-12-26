package com.school.dao;

import com.school.bean.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /**
     * 新增
     */
    int addUser(User user);


    /**
     * 登录、根据account查询是否存在
     */
    List<User> queryUserByAccount(@Param("account") String account, @Param("password") String password);

}
