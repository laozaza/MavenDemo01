package com.example.mavendemo01;

import com.example.mavendemo01.contorller.controller;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MavenDemo01ApplicationTests {
    @Autowired
    controller con;
    @Autowired
    Student stu;
    @Test
    void contextLoads() {
        String result = con.hello();
        System.out.println("Êä³ö"+con.hello());
        System.out.println("Êä³östudent"+stu);
    }

}
