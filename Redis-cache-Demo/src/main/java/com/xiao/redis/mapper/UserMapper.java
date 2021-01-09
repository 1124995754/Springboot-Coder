package com.xiao.redis.mapper;

import com.xiao.redis.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @_PackageName:com.xiao.redis.mapper
 * @_ClassName:UserMapper
 * @_Description:
 * @_Author：笑老二
 * @_data 2021/01/09 19:45
 */
@Repository
public interface UserMapper {
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
