package com.example.demo.demos.server.impi;

import com.example.demo.demos.model.TUser;
import com.example.demo.demos.mapper.Tusermapper;
import com.example.demo.demos.server.Tuserserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Tuserserverimpi implements Tuserserver {
    @Autowired
    private Tusermapper tusermapper;

    @Override
    public TUser Selectuserbyid(long id){
        return tusermapper.Selectuserbyid(id);
    }
    @Override
    public List<TUser> findalluser(){
        return tusermapper.findalluser();
    }
    @Override
    public void Insertuser(String username, String password){
        tusermapper.Insertuser(username,password);
    }
    @Override
    public int Updateuser(long id,String username,String password){
        return tusermapper.Updateuser(id, username, password);
    }
    @Override
    public int DeleteUser(long id){
        return tusermapper.DeleteUser(id);
    }
    @Override
    public List<TUser> Selectuserbyname(String username){
        return tusermapper.Selectuserbyname(username);
    }

    @Override
    public int DeleteUserByname(String username) {
        return tusermapper.DeleteUserByname(username);
    }
}
