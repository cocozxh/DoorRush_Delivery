package com.itheima.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@EnableCaching
//加上@ServletComponentScan才能去扫描WebFilter的注解从而创建过滤器
//@EnableTransactionManagement开启事务注解支持
public class ReggisApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggisApplication.class, args);
        log.info("Project Start...");
    }
}
