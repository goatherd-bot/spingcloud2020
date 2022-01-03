package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author rookie
 * @create 2021-12-14-18:12
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain800
{
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain800.class, args);
    }
}
