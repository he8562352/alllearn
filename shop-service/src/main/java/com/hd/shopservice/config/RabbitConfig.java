package com.hd.shopservice.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @auther hd
 * @description 队列配置
 * @createTime 2019-06-10 22:36
 */
@Component
public class RabbitConfig {

    @Autowired
    AmqpTemplate amqpTemplate;
    public void send(String a){
        amqpTemplate.convertAndSend("hello",a);
    }


}
