package com.ecnu.relax.service.impl;

import com.ecnu.relax.mapper.UserMapper;
import com.ecnu.relax.model.User;
import com.ecnu.relax.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getCurrentUser(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

}
