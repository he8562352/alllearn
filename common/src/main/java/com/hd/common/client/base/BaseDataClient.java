package com.hd.common.client.base;

import com.hd.common.models.domain.vo.AreaVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author ：hd.
 * @Date ：Created in 11:17 2019/6/6
 * @Description：基础数据
 * @Version: ·$
 */
@FeignClient("base-service")
public interface BaseDataClient {

    @GetMapping("/area")
    public AreaVo getArea();

}
