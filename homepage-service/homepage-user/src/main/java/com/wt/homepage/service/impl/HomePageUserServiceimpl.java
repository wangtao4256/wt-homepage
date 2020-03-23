package com.wt.homepage.service.impl;

import com.netflix.discovery.converters.Auto;
import com.wt.homepage.dao.HomePageMapper;
import com.wt.homepage.entity.HomePageUser;
import com.wt.homepage.service.HomePageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class HomePageUserServiceimpl implements HomePageUserService {

    @Resource
    HomePageMapper homePageMapper;

    @Override
    @Transactional
    public void updateHomePageUser() {
        HomePageUser homePageUser1 = new HomePageUser();
        homePageUser1.setId(1l);
        homePageUser1.setUsername("homeuser1");
        homePageMapper.update(homePageUser1);
        int a = 1 / 0;
        HomePageUser homePageUser2 = new HomePageUser();
        homePageUser2.setId(1l);
        homePageUser2.setUsername("homeuser2");
        homePageMapper.update(homePageUser2);
    }

    @Override
    public void insertHomePageUser(HomePageUser user) {
        homePageMapper.insert(user);
    }
}
