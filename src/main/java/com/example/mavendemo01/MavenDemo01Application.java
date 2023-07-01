package com.example.mavendemo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication//用注解标识的类作为springboot的入口类
@ImportResource("classpath:xmlpropertoes.xml")//加载自定义xml配置文件位置
public class MavenDemo01Application {

    public static void main(String[] args) {

        SpringApplication.run(MavenDemo01Application.class, args);
    }

}
