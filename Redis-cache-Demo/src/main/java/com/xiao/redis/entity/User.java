package com.xiao.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @_PackageName:com.xiao.redis.entity
 * @_ClassName:User
 * @_Description:
 * @_Author：笑老二
 * @_data 2021/01/09 19:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String name;
}
