package com.hd.shopservice;

import com.hd.common.config.rabbit.RabbitMQConfig;
import com.hd.common.config.rabbit.TopicRabbitMqConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.hd.common.client.user","com.hd.common.client.base"})
public class ShopserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopserviceApplication.class, args);
    }

    @Bean
    public RabbitMQConfig aa(){
        return new RabbitMQConfig();
    }

//    @Bean
//    public TopicRabbitMqConfig b(){
//        return new TopicRabbitMqConfig();
//    }

}
