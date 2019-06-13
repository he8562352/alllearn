package com.hd.shopservice.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hd.common.config.rabbit.RabbitMQConfig;
import com.hd.common.models.vo.UserVO;
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
    @Autowired
    ObjectMapper objectMapper;

    @GetMapping("/send/{message}")
    public String send(@PathVariable String message) throws JsonProcessingException {
        UserVO userVO = new UserVO();
        userVO.age = 11;
        userVO.name = "hedong::"+message;
        rabbitMQConfig.sendJson(objectMapper.writeValueAsString(userVO));
        rabbitMQConfig.sendPOJO(userVO);
        rabbitMQConfig.topicSend(userVO);
        System.out.println(message);
        return "success";
    }



}
