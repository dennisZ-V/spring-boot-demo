package com.dennis.spring.boot.demo.mapper;

import com.dennis.spring.boot.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.MyMapper;
@Mapper
public interface UserMapper extends MyMapper<User> {
}