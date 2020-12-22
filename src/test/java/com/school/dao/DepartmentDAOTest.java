package com.school.dao;

import com.school.bean.po.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DepartmentDAOTest {

    private static final Logger log = LoggerFactory.getLogger(DepartmentDAOTest.class);

    @Autowired
    private DepartmentDAO dao;

    @Test
    public void selectByPrimaryKey() {
        Department department = dao.selectByPrimaryKey(1);
        log.info("{}", department);
    }
}