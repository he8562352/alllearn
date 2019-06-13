package com.hd.common.config.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @auther hd
 * @description rabbitmq配置简单模式
 * @createTime 2019-06-10 22:33
 */
@Component
public class RabbitMQConfig {
   @Autowired
    AmqpTemplate amqpTemplate;
   public void sendJson(String jsonString){
       amqpTemplate.convertAndSend("hello",jsonString);
   }

   public void sendPOJO(Object o){
       amqpTemplate.convertAndSend("pojo",o);
   }

}
