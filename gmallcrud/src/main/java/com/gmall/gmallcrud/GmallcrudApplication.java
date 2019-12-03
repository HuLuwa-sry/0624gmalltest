package com.gmall.gmallcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages="com.gmall.gmallcrud.mapper")
public class GmallcrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallcrudApplication.class, args);
    }

}
