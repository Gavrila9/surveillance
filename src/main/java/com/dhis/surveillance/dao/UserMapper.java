package com.dhis.surveillance.dao;

import com.dhis.surveillance.vo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUserById(String userId);
    User findUserByName(String userName);
    User findUserByEmail(String email);
    void register(User user);
}
