package com.hd.common.models.domain.vo;

import lombok.Data;

/**
 * @Author ：hd.
 * @Date ：Created in 11:10 2019/6/6
 * @Description：地区vo
 * @Version: 1$
 */
@Data
public class AreaVo {
    public Integer id;
    public String name;
    public AreaVo(Integer id,String name){
        this.id = id;
        this.name = name;
    }
}
