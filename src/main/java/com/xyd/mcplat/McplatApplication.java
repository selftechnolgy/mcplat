package com.xyd.mcplat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@MapperScan(
        //指定扫描包
        basePackages = "com.xyd.mcplat.dao.*",
        annotationClass = Repository.class
)
public class McplatApplication {

    public static void main(String[] args) {
        SpringApplication.run(McplatApplication.class, args);
    }

}
