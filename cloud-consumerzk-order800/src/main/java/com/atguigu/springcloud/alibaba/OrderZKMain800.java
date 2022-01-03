package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther zzyy
 * @create 2020-02-19 15:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain800
{
    public static void main(String[] args) {
            SpringApplication.run(OrderZKMain800.class, args);
    }
}
