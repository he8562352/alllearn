package com.hd.shopservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.hd.common.client.user","com.hd.common.client.base"})
public class ShopserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopserviceApplication.class, args);
    }

}
