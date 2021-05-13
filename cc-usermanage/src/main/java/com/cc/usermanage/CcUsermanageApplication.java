package com.cc.usermanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.cc.api")
@MapperScan(value = "com.cc.usermanage.mapper")
public class CcUsermanageApplication {
    public static void main(String[] args) {
        SpringApplication.run(CcUsermanageApplication.class, args);
    }
}
