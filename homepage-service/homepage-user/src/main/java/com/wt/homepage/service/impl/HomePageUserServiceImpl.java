package com.wt.homepage.service.impl;

import com.netflix.discovery.converters.Auto;
import com.wt.homepage.dao.HomePageMapper;
import com.wt.homepage.entity.HomePageUser;
import com.wt.homepage.redis.RedisUtil;
import com.wt.homepage.service.HomePageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HomePageUserServiceImpl implements HomePageUserService {

  @Autowired
  HomePageMapper homePageMapper;

  @Override
  @Transactional(rollbackFor = Exception.class)
  public void updateHomePageUser(HomePageUser homePageUser) {
    HomePageUser home = new HomePageUser();
    home.setId(1L);
    home.setUsername("sasdasdada");
    homePageMapper.update(home);
  }
}
