package com.dennis.spring.boot.demo;

import com.dennis.spring.boot.demo.domain.User;
import com.dennis.spring.boot.demo.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootDemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void testSelectAll(){
        List<User> userList = userMapper.selectAll();
        userList.forEach(user -> {
            System.out.println(user);
        });
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setAge(27);
        user.setSex("female");
        user.setUserName("vivian");
        userMapper.insert(user);
    }

    @Test
    public void testUpdate(){
        User user = userMapper.selectByPrimaryKey(4);
        user.setUserName("Vivian");
        userMapper.updateByPrimaryKey(user);
    }

    @Test
    public void testDelete(){
        userMapper.deleteByPrimaryKey(5);
    }

    @Test
    public void testPage(){
        PageHelper.startPage(1,10);
        PageInfo<User> pageInfo = new PageInfo<>(userMapper.selectAll());
        System.out.println(pageInfo);
    }

}
