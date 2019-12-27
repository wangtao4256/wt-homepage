package com.wt.homepage.service;

import com.alibaba.fastjson.JSON;
import com.wt.homepage.ApplicationTest;
import com.wt.homepage.dao.HomePageCourseDao;
import com.wt.homepage.entity.CourseInfosRequest;
import com.wt.homepage.entity.HomepageCourse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Collections;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { ApplicationTest.class }, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class HomePageCourseServiceTest {
  @Autowired
  private HomePageCourseDao homePageCourseDao;

  @Autowired
  private CourseService courseService;

  //  @Test
  public void testCreateCourseInfo() {
    HomepageCourse homepageCourse = new HomepageCourse("JDK11&12 新特性解读", 0, "https:/www.imooc.com", "解读JDK11&12的新版本特性");
    HomepageCourse homepageCourse1 = new HomepageCourse("SpringCloud广告系统实现", 1, "https:/www.imooc.com",
      "SpringCloud广告系统");
    System.out.println(homePageCourseDao.saveAll(Arrays.asList(homepageCourse, homepageCourse1)).size());
  }

  @Test
  public void testGetCourseInfo() {
    System.out.println(JSON.toJSONString(courseService.getCourseInfo(8l)));
    System.out.println(JSON.toJSONString(courseService.getCourseInfo(10l)));
  }

  @Test
  public void testGetCourseInfos() {
    System.out.println(JSON.toJSONString(courseService.getCourseInfos(new CourseInfosRequest(Arrays.asList(8l, 9l)))));
  }
}
