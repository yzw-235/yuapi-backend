package com.wyz.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.wyz.backend.mapper")
@SpringBootApplication
public class YuApiBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuApiBackendApplication.class, args);
    }

}
