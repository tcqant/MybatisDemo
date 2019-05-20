package org.test.mybatisannotationdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("org.test.mybatisannotationdemo.dao")
public class MybatisAnnotationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisAnnotationDemoApplication.class, args);
    }

}
