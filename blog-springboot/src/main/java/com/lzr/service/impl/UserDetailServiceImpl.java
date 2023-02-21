package com.lzr.service.impl;

import com.lzr.entity.User;
import com.lzr.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;

/**
 * @Author lzr
 * @Date 2023/2/21 14:12
 * @Description: TODO
 */
public class UserDetailServiceImpl implements UserDetailsService {
    @Resource
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //获取数据库中的user信息
        User user = userService.getUserByName(username);
        //账号
        String name = user.getUsername();
        //密码
        String password = user.getPassword();
        //账号是否可用
       boolean userStatus = user.getUserStatus() == 0 ? false : true;

        return new org.springframework.security.core.userdetails.User(name,password,userStatus,false,false,false,null);
    }

}
