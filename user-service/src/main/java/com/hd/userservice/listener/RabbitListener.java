package com.hd.userservice.listener;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hd.common.models.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestHeader;

import java.io.IOException;

/**
 * @author Administrator
 * @auther hd
 * @description 队列接收
 * @createTime 2019-06-10 22:50
 */
@Component
public class RabbitListener {

    @Autowired
    ObjectMapper objectMapper;

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "hello")
    public void listener(String hello) throws IOException {
        System.out.println("接收到的消息"+hello);
        System.out.println("消息："+ objectMapper.readValue(hello, UserVO.class));
    }

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "pojo")
    public void listenerpojo(UserVO hello){
        System.out.println("消息pojo："+hello.toString());
    }

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "topic.message")
    public void topicSend(Object o){
        System.out.println("消息topic："+o.toString());
    }

}
