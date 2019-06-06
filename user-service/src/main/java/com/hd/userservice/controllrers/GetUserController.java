package com.hd.userservice.controllrers;

import com.hd.common.models.vo.UserVO;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


@RestController
@Repository
@RequestMapping("/user")
public class GetUserController{

    @GetMapping("/getUser/{id}")
    public UserVO getUser(@PathVariable("id" ) Long id) {
        System.out.println(id);
        UserVO userVO = new UserVO();
        userVO.age = 21;
        userVO.name = "getusername";
        return userVO;
    }
}
