package com.neusoft.coursemall.courses;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.neusoft.coursemall.courses.dao")
@SpringBootApplication
public class CoursemallCoursesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursemallCoursesApplication.class, args);
    }

}
