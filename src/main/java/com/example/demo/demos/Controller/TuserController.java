package com.example.demo.demos.Controller;

import com.example.demo.demos.model.TUser;
import com.example.demo.demos.server.Tuserserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TuserController {
    @Autowired
    private Tuserserver tuserserver;
    //查询指定id的用户
    @GetMapping("/byid/{id}")
    public TUser Selectuserbyid(@PathVariable long id){
        return tuserserver.Selectuserbyid(id);
    }

    // 查询所有用户
    @GetMapping("/findall")
    public List<TUser> getAllUsers() {
        return tuserserver.findalluser();
    }

    // 插入新用户
    @PostMapping("/insert")
    public void insertUser(@RequestBody TUser tUser) {
        tuserserver.Insertuser(tUser.getUserName(), tUser.getPwd());
    }

    // 更新用户信息
    @PutMapping("/update")
    public int updateUser(@RequestBody TUser tUser) {
        return tuserserver.Updateuser(tUser.getId(),tUser.getUserName(), tUser.getPwd());
    }

    // 删除用户
    @DeleteMapping("/del/{id}")
    public int deleteUser(@PathVariable long id) {
        return tuserserver.DeleteUser(id);
    }

    @DeleteMapping("/delbyname/{username}")
    public  int DeleteUserByname(@PathVariable String username){return tuserserver.DeleteUserByname(username);}

    // 根据用户名查询用户
    @GetMapping("/byname/{username}")
    public List<TUser> getUserByName(@PathVariable String username) {
        return tuserserver.Selectuserbyname(username);
    }

}
