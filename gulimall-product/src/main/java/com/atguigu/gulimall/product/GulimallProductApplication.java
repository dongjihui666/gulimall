package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1整合Mybatis-plus
 * 1),导入依赖
 * 2)配置
 *   1 配置数据源
 *     1)导入数据库的驱动.
 *   2 配置mybatis-plus相关的详细
 *     1)使用@mapperScan
 *     2
 */
@MapperScan(basePackages = "com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {
    public static void main(String[] args){
        SpringApplication.run(GulimallProductApplication.class,args);
    }
}
