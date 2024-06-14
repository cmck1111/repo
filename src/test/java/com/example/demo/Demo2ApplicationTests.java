package com.example.demo;

import com.example.demo.demos.mapper.Tusermapper;
import com.example.demo.demos.model.TUser;
import com.example.demo.demos.server.impi.Tuserserverimpi;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class Demo2ApplicationTests {

    @Autowired
    private Tuserserverimpi tuserserverimpi;
    @Test
    void contextLoads() {

       List<TUser> list = tuserserverimpi.Selectuserbyname("z");
        System.out.println(tuserserverimpi.findalluser());
    }

}
