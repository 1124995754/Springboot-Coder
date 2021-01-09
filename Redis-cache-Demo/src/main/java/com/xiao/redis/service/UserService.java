package com.xiao.redis.service;

import com.xiao.redis.entity.User;

/**
 * @_PackageName:com.xiao.redis.service
 * @_ClassName:UserService
 * @_Description:
 * @_Author：笑老二
 * @_data 2021/01/09 19:17
 */
public interface UserService {

    /**
     * 保存或者修改用户
     * @param user
     * @return
     */
    void saveOrUpdate(User user);

    /**
     * 获取用户
     * @param id
     * @return
     */
    User get(Integer id);

    /**
     * 删除
     * @param id
     */
    void delete(Integer id);
}
