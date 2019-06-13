package com.hd.userservice.listener;

import com.hd.common.models.vo.UserVO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @auther hd
 * @description 队列接收
 * @createTime 2019-06-10 22:50
 */
@Component
public class RabbitListener {

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "hello")
    public void listener(String hello){
        System.out.println("消息："+hello);
    }

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "pojo")
    public void listenerpojo(UserVO hello){
        System.out.println("消息："+hello.toString());
    }
}
