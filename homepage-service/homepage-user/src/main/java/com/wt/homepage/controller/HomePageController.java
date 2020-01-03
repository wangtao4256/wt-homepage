package com.wt.homepage.controller;

import com.wt.homepage.dao.HomePageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomePageController {
  @Autowired
  HomePageMapper homePageMapper;

  @RequestMapping("/test")
  @ResponseBody
  public void getHomePage() {
    System.out.println(homePageMapper.getAll());
  }
}
