package com.wt.homepage.entity;

import lombok.Data;

import java.util.Date;

@Data
public class HomePageUserDTO {
    private Long id;

    private String username;
    private String email;

    private Date createTime;
    private Date updateTime;
}
