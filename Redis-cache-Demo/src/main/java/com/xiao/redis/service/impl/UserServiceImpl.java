package com.xiao.redis.service.impl;

import com.xiao.redis.entity.User;
import com.xiao.redis.mapper.UserMapper;
import com.xiao.redis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

/**
 * @_PackageName:com.xiao.redis.service.impl
 * @_ClassName:UserServiceImpl
 * @_Description:
 * @_Author：笑老二
 * @_data 2021/01/09 19:21
 */
@Service
@Slf4j //Causes lombok to generate a logger field
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void saveOrUpdate(User user) {
        userMapper.saveOrUpdate(user);
    }

    @Cacheable(value = "user",key = "#id")
    @Override
    public User get(Integer id) {
        return userMapper.get(id);
    }

    @CacheEvict(value = "user",key = "#id")
    @Override
    public void delete(Integer id) {
        userMapper.delete(id);
    }
}
