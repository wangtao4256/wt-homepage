package com.wt.homepage.service;

import com.wt.homepage.ApplicationTestMapper;
import com.wt.homepage.dao.HomePageMapper;
import com.wt.homepage.entity.HomePageUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { ApplicationTestMapper.class }, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ApplicationTest {
  @Autowired
  HomePageUserService homePageUserService;

  @Test
  public void udpate() {
    HomePageUser home = new HomePageUser();
    home.setId(1l);
    home.setUsername("sasdasdada");
    homePageUserService.updateHomePageUser(home);
    int i = 1 / 0;
  }
}
