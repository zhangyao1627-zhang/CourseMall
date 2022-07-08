package com.neusoft.coursemall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@EnableFeignClients("com.neusoft.coursemall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class CoursemallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursemallMemberApplication.class, args);
    }

    @RestController
    class EchoController {
        @GetMapping(value = "/echo/{string}")
        public String echo(@PathVariable String string) {
            return string;
        }
    }


}
