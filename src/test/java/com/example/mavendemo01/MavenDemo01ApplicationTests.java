package com.example.mavendemo01;

import com.example.mavendemo01.HuanJinQieHuan.DBConnector;
import com.example.mavendemo01.SQL.Article;
import com.example.mavendemo01.SQL.ArticleMapper;
import com.example.mavendemo01.SQL.Comment;
import com.example.mavendemo01.SQL.CommentMapper;
import com.example.mavendemo01.SQL.jpa.Discuss;
import com.example.mavendemo01.SQL.jpa.DiscussRepository;
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
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.startsWith;

@RunWith(SpringRunner.class)
@SpringBootTest
class MavenDemo01ApplicationTests {
    @Autowired
    controller con;
    @Autowired
    Student stu;
    @Autowired
    Person person;
    @Autowired
    User user;
    @Value("${student.id}")
    int id;
    @Autowired
    ApplicationContext applicationContext;
    @Autowired
    CustomProperties customProperties;
    @Autowired
    DBConnector dbConnector;
    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private DiscussRepository repository;


    @Test
    void contextLoads() throws RuntimeException {
//        String result = con.hello();
//        MyProperties myProperties = (MyProperties) applicationContext.getBean("xmlpropertoes");
//        if (myProperties != null) {
//            myProperties.getResult();
//        }
//        System.out.println(customProperties);
//        System.out.println(dbConnector.config());

//查询数据库字段
        //int id = 2;
//        Article article = articleMapper.findById(id);
//        System.out.println("查询数据库ID为" + id + "Comment表的数据----" + article);
//        System.out.println("-----------------------------------");
//        Comment comment = commentMapper.findById(id);
//        System.out.println("查询数据库ID为" + id + "的Comment表的数据----" + comment);
//        System.out.println("-----------------------------------");
//
//        //更新数据库字段
//        comment.setaId(1);
//        comment.setAuthor("aaaa");
//        comment.setContent("dad");
//        commentMapper.updateComment(comment);
//
//        //插入数据库字段
//        Comment comment1 = new Comment();
//        comment1.setAuthor("aihjuha");
//        comment1.setContent("dad");
//        commentMapper.insertComment(comment1);
//        System.out.println(comment1);
//        System.out.println("-----------------------------------");
//
//        //删除数据库字段
//        for (int i = 6; i < 30; i++)
//            commentMapper.deleteComment(i);


//        //JPA
//        //输出List的全部数据
//        List<Discuss> list = repository.findByAuthorNotNull();
//       System.out.println(list);
//
//        //使用@Query注解进行数据操作（输出List中的指定aid数据）
//        Pageable pageable = PageRequest.of(0,3);
//        List<Discuss> allpaged = repository.getDiscussPaged(1,pageable);
//        System.out.println(allpaged);
//
//        //使用Example封装参数进行数据查询操作
//        Discuss discuss=new Discuss();
//        discuss.setAuthor("张三");
//        Example<Discuss> example =Example.of(discuss);
//        List<Discuss> list1=repository.findAll(example);
//        System.out.println(list1);
//
//        Discuss discuss1=new Discuss();
//        discuss1.setAuthor("张");
//        ExampleMatcher matcher=ExampleMatcher.matching()
//                .withMatcher("author",startsWith());
//        Example<Discuss> example1=Example.of(discuss1,matcher);
//        List<Discuss> list2=repository.findAll(example1);
//        System.out.println(list2);
//
//        //使用Jpa Repository内部方法进行数据操作
//        System.out.println("-----------------------");
//        Optional<Discuss> optional = repository.findById(1);
//        if (optional.isPresent()){
//            System.out.println(optional.get());
//        }
//        System.out.println();
    }
}
