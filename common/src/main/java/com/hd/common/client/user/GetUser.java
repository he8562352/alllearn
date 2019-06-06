package com.hd.common.client.user;

import com.hd.common.models.vo.UserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service")
public interface GetUser {

    @GetMapping(value = "/user/getUser/{id}" )
    UserVO getUser(@PathVariable Long id);

}
