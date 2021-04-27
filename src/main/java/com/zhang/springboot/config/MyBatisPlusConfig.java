package com.zhang.springboot.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author zhangxinrun(OS - > zhang)
 * @Date 2021/4/27 0:05
 * @Version 1.0
 * @Description
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.zhang.springboot.mapper")
public class MyBatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
