package com.hd.userservice.listener;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @auther hd
 * @description 队列接收
 * @createTime 2019-06-10 22:50
 */
@Component
@org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "hello")
public class RabbitListener {

    @org.springframework.amqp.rabbit.annotation.RabbitListener
    public void listener(String hello){
        System.out.println("消息："+hello);
    }
}
