package com.aias.demo;

import com.aias.demo.bean.User;
import com.aias.demo.dao.IUserDao;
import com.aias.demo.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/applicationContext.xml"})
public class AiasTest {

    @Autowired
    private UserMapper mapper;


    @Autowired
    private IUserDao userDao;

    @Test
    public void test() {
        UserExample example = new UserExample();
        example.createCriteria().andIdEqualTo(1);
        List<User> users = mapper.selectByExample(example);
        System.out.println();

    }

    @Test
    public void test2() {
        User user = userDao.selectUserById(1);
        System.out.println(user.getUserName());

    }

    @Test
    public void test1() {
        UserExample example = new UserExample();
        example.setOrderByClause("id desc ");
        example.setLimitClause(String.format("%s,%s", 1, 10));
        example.createCriteria().andIdGreaterThan(1);
        List<User> users = mapper.selectByExample(example);
        System.out.println();

    }

}
