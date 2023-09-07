package com.example.mavendemo01;

import com.example.mavendemo01.SQL.Redis.Person1;
import com.example.mavendemo01.SQL.Redis.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class RedisTest {
    @Autowired
    private PersonRepository repository1;
    @Test
    void Redis() throws RuntimeException{
        List<Person1> list3 = repository1.findByAddress_City("北京");
        System.out.println(list3);
    }
}
