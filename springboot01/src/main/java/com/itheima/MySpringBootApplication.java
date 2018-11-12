package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 springBoot的主入口或者引导类
 */
@SpringBootApplication //代表的是当前springboot的应用
public class MySpringBootApplication {

    public static void main(String[] args) {
        //当前springboot主入口的类
        SpringApplication.run(MySpringBootApplication.class, args);
    }

}
