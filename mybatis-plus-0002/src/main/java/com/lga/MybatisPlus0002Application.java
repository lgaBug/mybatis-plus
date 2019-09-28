package com.lga;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lga.mpc.*")
public class MybatisPlus0002Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlus0002Application.class, args);
    }

}
