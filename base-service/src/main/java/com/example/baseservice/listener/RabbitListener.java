package com.example.baseservice.listener;

//import com.hd.common.models.vo.UserVO;
import org.springframework.stereotype.Component;

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

//    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "pojo")
//    public void listenerpojo(UserVO hello){
//        System.out.println("消息pojo："+hello.toString());
//    }

    @org.springframework.amqp.rabbit.annotation.RabbitListener(queues = "topic.message")
    public void topicSend(Object o){
        System.out.println("消息topic："+o.toString());
    }

}
