package com.lga.mpc.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.SqlExplainInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.aop.interceptor.PerformanceMonitorInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//Spring boot方式
@EnableTransactionManagement
@Configuration
@MapperScan("com.lga.mpc.*")
public class MybatisPlusConfig {

    ///**
    // * SQL执行效率插件
    // */
    //@Bean
    ////@Profile({"dev","test"})// 设置 dev test 环境开启
    //public SqlExplainInterceptor sqlExplainInterceptor(){
    //    return sqlExplainInterceptor();
    //}

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return  new PaginationInterceptor();
    }
}