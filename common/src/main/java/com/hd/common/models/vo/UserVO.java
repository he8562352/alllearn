package com.hd.common.models.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVO implements Serializable {
    public String name;
    public int age;
}
