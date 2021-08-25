package com.auto.codeserver;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.auto.codeserver.mapper")
@Slf4j
public class CodeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeServerApplication.class, args);
    }

}
