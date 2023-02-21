package com.lzr.service;

import com.lzr.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lzr.result.JsonResult;

/**
* @author 15980
* @description 针对表【user】的数据库操作Service
* @createDate 2023-02-21 14:13:13
*/
public interface UserService extends IService<User> {

    public User getUserByName(String username);

    public JsonResult login(String username,String password);

}
