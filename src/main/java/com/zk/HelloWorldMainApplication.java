package com.zk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by zk on 18/5/16.
 */

//@SpringBootApplication  用来标注一个主程序类,说明这是一个springboot 应用.
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        //springboot应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
