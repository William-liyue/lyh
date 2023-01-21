package com.javalyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author li192
 */
@SpringBootApplication
@MapperScan("com.javalyh.mapper")
public class JavalyhApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavalyhApplication.class, args);
    }
}