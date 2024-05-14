package com.gelin.demo.model.dao;

import com.gelin.demo.model.pojo.User;
import com.gelin.demo.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByName(String username);


    User checkUsernameAndPassword(@Param("username") String username,@Param("password") String password);
}