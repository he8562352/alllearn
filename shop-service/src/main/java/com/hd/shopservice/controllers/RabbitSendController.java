package com.hd.shopservice.controllers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther hd
 * @description 队列发送
 * @createTime 2019-06-10 22:41
 */
@RestController
public class RabbitSendController {

    @Autowired
    AmqpTemplate amqpTemplate;

    @GetMapping("/send/{message}")
    public String send(@PathVariable String message){
        amqpTemplate.convertAndSend("hello",message);
        return "success";
    }



}
