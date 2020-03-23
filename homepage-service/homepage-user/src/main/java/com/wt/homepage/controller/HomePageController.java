package com.wt.homepage.controller;

import com.wt.homepage.dao.HomePageMapper;
import com.wt.homepage.entity.HomePageUser;
import com.wt.homepage.service.HomePageUserService;
import com.wt.homepage.vo.CommonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomePageController {
    @Autowired
    HomePageUserService homePageUserService;

    @RequestMapping("/add/user")
    @ResponseBody
    public void insertHomePageUser() {
        HomePageUser user = new HomePageUser("wangtao", "wangtao_4256@163.com");
        homePageUserService.insertHomePageUser(user);
    }
}
