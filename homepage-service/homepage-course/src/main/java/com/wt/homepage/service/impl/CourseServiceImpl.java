package com.wt.homepage.service.impl;

import com.netflix.discovery.converters.Auto;
import com.wt.homepage.dao.HomePageCourseDao;
import com.wt.homepage.entity.CourseInfo;
import com.wt.homepage.entity.CourseInfosRequest;
import com.wt.homepage.entity.HomepageCourse;
import com.wt.homepage.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CourseServiceImpl implements CourseService {
  @Autowired
  HomePageCourseDao homePageCourseDao;

  @Override
  public CourseInfo getCourseInfo(Long id) {
    Optional<HomepageCourse> course = homePageCourseDao.findById(id);
    return buildCourseInfo(course.orElse(HomepageCourse.invalid()));
  }

  @Override
  public List<CourseInfo> getCourseInfos(CourseInfosRequest param) {
    return null;
  }

  private CourseInfo buildCourseInfo(HomepageCourse course) {
    return CourseInfo.builder().id(course.getId()).courseName(course.getCourseName()).courseIcon(course.getCourseIcon())
      .courseType(course.getCourseType() == 0 ? "免费课程" : "实战课程").courseIntro(course.getCourseIntro()).build();
  }
}
