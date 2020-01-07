package com.dennis.spring.boot.demo.service.impl;

import com.dennis.spring.boot.demo.mapper.UserMapper;
import com.dennis.spring.boot.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Dinnes Zhang
 * @date
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
}
