package com.hd.shopservice.client;

import com.hd.common.models.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.websocket.server.PathParam;

/**
 * @Author ：hd.
 * @Date ：Created in 14:44 2019/6/4
 * @Description：121
 * @Version: 23$
 */
@FeignClient(name = "user-service" )
public interface UserServiceClient {

    @GetMapping(value = "/getUser/{id}")
    public UserVO getUser(@PathVariable("id") Long id);



}
