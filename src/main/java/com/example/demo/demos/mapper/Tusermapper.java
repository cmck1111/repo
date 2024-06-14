package com.example.demo.demos.mapper;

import com.example.demo.demos.model.TUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface Tusermapper {

    List<TUser> findalluser();


    void Insertuser(@Param("username") String username,@Param("password")String password);


    int Updateuser(@Param("id") long id,@Param("username") String username,@Param("password")String password);


    int DeleteUser(@Param("id") long id);


    int DeleteUserByname(@Param("username") String username);


    TUser Selectuserbyid(@Param("id") long id);


    List<TUser> Selectuserbyname(@Param("username") String username);

}
