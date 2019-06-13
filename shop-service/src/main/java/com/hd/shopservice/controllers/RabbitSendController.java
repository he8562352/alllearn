package com.hd.shopservice.controllers;

import com.hd.common.config.rabbit.RabbitMQConfig;
import com.hd.common.models.vo.UserVO;
import com.hd.shopservice.config.RabbitConfig;
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
    RabbitMQConfig rabbitMQConfig;

    @GetMapping("/send/{message}")
    public String send(@PathVariable String message){
        UserVO userVO = new UserVO();
        userVO.age = 11;
        userVO.name = "hedong::"+message;

        rabbitMQConfig.sendPOJO(userVO);
        System.out.println(message);
        return "success";
    }



}
