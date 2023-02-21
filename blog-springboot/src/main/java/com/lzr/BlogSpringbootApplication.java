package com.lzr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lzr.mapper")// 扫描mybatis的映射器
public class BlogSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogSpringbootApplication.class, args);
    }

}
