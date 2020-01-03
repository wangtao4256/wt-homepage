package com.wt.homepage.service;

import com.wt.homepage.ApplicationTestMapper;
import com.wt.homepage.dao.HomePageMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { ApplicationTestMapper.class }, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ApplicationTest {
  @Autowired
  HomePageMapper homePageMapper;

  @Test
  public void test() {
    System.out.println(homePageMapper.getAll());
  }
}
