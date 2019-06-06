package com.example.baseservice.controllers;

import com.hd.common.models.domain.vo.AreaVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：hd.
 * @Date ：Created in 11:08 2019/6/6
 * @Description：基础数据
 * @Version: 1$
 */
@RestController
@RequestMapping("/")
public class BaseDataController {

    @GetMapping("/area")
    public AreaVo getArea(){
        System.out.println("进来了");
        AreaVo areaVo = new AreaVo(1,"四川");
        return areaVo;
    }

}
