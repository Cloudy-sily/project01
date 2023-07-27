package com.lzw.community.dao;

import com.lzw.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lzw
 * @create 2023-07-23 22:03
 */
@Mapper
public interface UserMapper {



    User selectById(int id);

    List<User> selectAllUser();

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
