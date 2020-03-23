package com.wt.homepage.service;

import com.wt.homepage.ApplicationTestMapper;
import com.wt.homepage.entity.HomePageUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApplicationTestMapper.class}, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class HomePageUserTest {
    @Autowired
    HomePageUserService homePageUserService;

    @Test
    public void udpate() {
        homePageUserService.updateHomePageUser();
        int i = 1 / 0;
    }
    @Test
    public void insert() {
        HomePageUser user = new HomePageUser("wangtao", "wangtao_4256@163.com");
        homePageUserService.insertHomePageUser(user);
    }
}
