package com.lzr.mapper;

import com.lzr.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
* @author 15980
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-02-21 14:13:13
* @Entity com.lzr.entity.User
*/

@Repository
public interface UserMapper extends BaseMapper<User> {

    public User getUserByName(String username);

}




