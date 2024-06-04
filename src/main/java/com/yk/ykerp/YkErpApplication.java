package com.yk.ykerp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.yk.ykerp.dao")
@EnableScheduling
public class YkErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(YkErpApplication.class, args);
    }

}
