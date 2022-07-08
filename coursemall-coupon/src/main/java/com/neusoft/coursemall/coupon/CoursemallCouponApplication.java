package com.neusoft.coursemall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.neusoft.coursemall.coupon.dao")
@SpringBootApplication
public class CoursemallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursemallCouponApplication.class, args);
    }

}
