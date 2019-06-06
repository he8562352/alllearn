package com.hd.shopservice.controllers;

import com.hd.common.client.base.BaseDataClient;
import com.hd.common.client.user.GetUser;
import com.hd.common.models.domain.vo.AreaVo;
import com.hd.common.models.vo.UserVO;
import com.hd.shopservice.client.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：hd.
 * @Date ：Created in 14:24 2019/6/4
 * @Description：调取用户服务
 * @Version: 1$
 */
@RestController
@RequestMapping("/")
public class GetUserController {
    @Value("${server.port}")
    public String port;
    @Autowired
    GetUser getUser;

    @Autowired
    BaseDataClient baseDataClient;

    @GetMapping("/getUser")
    public UserVO getUser(){
        UserVO u = getUser.getUser(1l);
        System.out.println(u.toString()+"port:"+port);
        return u;
    }

    @GetMapping("/getArea")
    public AreaVo getArea(){
        AreaVo a = baseDataClient.getArea();
        System.out.println(a.toString());
        return a;
    }

}
