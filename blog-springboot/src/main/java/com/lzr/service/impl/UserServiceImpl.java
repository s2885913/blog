package com.lzr.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzr.entity.User;
import com.lzr.result.JsonResult;
import com.lzr.result.ResultCode;
import com.lzr.result.ResultTool;
import com.lzr.service.UserService;
import com.lzr.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 15980
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-02-21 14:13:13
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Resource
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public JsonResult login(String username, String password) {
        //Authentication authticate对用户进行认证
        //该方法会去调用UserDetailsServiceImpl.loadUserByUsername
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
        return ResultTool.success();
    }
}




