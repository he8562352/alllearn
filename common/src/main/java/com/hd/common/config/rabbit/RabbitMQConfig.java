package com.hd.common.config.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther hd
 * @description rabbitmq配置
 * @createTime 2019-06-10 22:33
 */
@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue Queue() {
        return new Queue("helle");
    }

}
