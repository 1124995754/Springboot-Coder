package com.xiao.redis.controller;

import com.xiao.redis.entity.User;
import com.xiao.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @_PackageName:com.xiao.redis.controller
 * @_ClassName:UserController
 * @_Description:
 * @_Author：笑老二
 * @_data 2021/01/09 19:53
 */
@RestController
@RequestMapping("/testRedis")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable Integer id){
        return userService.get(id).toString();
    }

    @RequestMapping("delUser/{id}")
    public String delUser(@PathVariable Integer id){
        userService.delete(id);
        return "Ok";
    }

    @RequestMapping("creatUser")
    public String creatUser(User user){
        userService.saveOrUpdate(user);
        return "Ok";
    }
}
