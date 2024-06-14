package com.example.demo.demos.server;


import com.example.demo.demos.model.TUser;

import java.util.List;


public interface Tuserserver {

    public TUser Selectuserbyid(long id);

    public List<TUser> findalluser();

    public void Insertuser(String username, String password);


    public int Updateuser(long id,String username,String password);


    public int DeleteUser(long id);


    public List<TUser> Selectuserbyname(String username);

    public int DeleteUserByname(String username);
}
