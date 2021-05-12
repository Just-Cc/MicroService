package com.cc.itemmanage;

import com.cc.itemmanage.feign.ItemFeign;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//(basePackages = "com.cc.itemmanage.feign")
@MapperScan(value = "com.cc.itemmanage.mapper")
public class CcItemmanageApplication {
    public static void main(String[] args) {
        SpringApplication.run(CcItemmanageApplication.class, args);
    }

}
