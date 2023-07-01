package com.example.mavendemo01;

import com.example.mavendemo01.HuanJinQieHuan.DBConnector;
import com.example.mavendemo01.SQL.Article;
import com.example.mavendemo01.SQL.ArticleMapper;
import com.example.mavendemo01.SQL.Comment;
import com.example.mavendemo01.SQL.CommentMapper;
import com.example.mavendemo01.ShujuFanhui.Person;
import com.example.mavendemo01.ShujuFanhui.Student;
import com.example.mavendemo01.ShujuFanhui.User;
import com.example.mavendemo01.contorller.controller;
import com.example.mavendemo01.coustom.CustomProperties;
import com.example.mavendemo01.coustom.MyProperties;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class MavenDemo01ApplicationTests {
//    @Autowired
//    controller con;
//    @Autowired
//    Student stu;
//    @Autowired
//    Person person;
//    @Autowired
//    User user;
//    @Value("${student.id}")
//    int id;
//    @Autowired
//    ApplicationContext applicationContext;
//    @Autowired
//    CustomProperties customProperties;
//    @Autowired
//    DBConnector dbConnector;
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void contextLoads() throws RuntimeException {
//        String result = con.hello();
//        System.out.println("单元测试返回" + con.hello());
//        System.out.println("单元测试返回student" + stu);
//        System.out.println("单元测试返回id数据---" + id);
//        System.out.println("单元测试返回user数据--" + user);
//        System.out.println("单元测试返回Person数据--" + person);
//
//        MyProperties myProperties = (MyProperties) applicationContext.getBean("xmlpropertoes");
//        if (myProperties != null) {
//            myProperties.getResult();
//        }
//        System.out.println(customProperties);
//        System.out.println(dbConnector.config());

        Article article=articleMapper.findById(1);
        System.out.println("查询数据库ID为"+article+"Comment表的数据----"+article);
        System.out.println("-----------------------------------");
        Comment comment=commentMapper.findById(2);
        System.out.println("查询数据库ID为"+comment+"的Comment表的数据----"+comment);
        System.out.println("-----------------------------------");

        //更新数据库字段
        comment.setaId(1);
        comment.setAuthor("aaaa");
        comment.setContent("dad");
        commentMapper.updateComment(comment);
        //插入数据库字段
Comment comment1=new Comment();
        comment1.setaId(2);
        comment1.setAuthor("aihjuha");
        comment1.setContent("dad");
        commentMapper.insertComment(comment1);
        System.out.println(comment1);
        System.out.println("-----------------------------------");


        //删除数据库字段
        commentMapper.deleteComment(6);
    }
}
