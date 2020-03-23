package com.wt.homepage.thread;

import com.wt.homepage.service.HomePageUserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserThread implements Runnable {
    @Autowired
    HomePageUserService homePageUserService;

    @Override
    public void run() {
        homePageUserService.updateHomePageUser();
    }
}
