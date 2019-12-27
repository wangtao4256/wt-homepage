package com.wt.homepage.service.impl;

import com.netflix.discovery.converters.Auto;
import com.wt.homepage.dao.HomePageCourseDao;
import com.wt.homepage.entity.CourseInfo;
import com.wt.homepage.entity.CourseInfosRequest;
import com.wt.homepage.entity.HomepageCourse;
import com.wt.homepage.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
  @Autowired
  HomePageCourseDao homePageCourseDao;

  @Override
  public CourseInfo getCourseInfo(Long id) {
    Optional<HomepageCourse> course = homePageCourseDao.findById(id);
    return buildCourseInfo(course.orElse(HomepageCourse.invalid()));
  }

  @Override
  public List<CourseInfo> getCourseInfos(CourseInfosRequest request) {
    if (CollectionUtils.isEmpty(request.getIds())) {
      return Collections.EMPTY_LIST;
    }
    List<HomepageCourse> list = homePageCourseDao.findAllById(request.getIds());
    return list.stream().map(this::buildCourseInfo).collect(Collectors.toList());
  }

  private CourseInfo buildCourseInfo(HomepageCourse course) {
    return CourseInfo.builder().id(course.getId()).courseName(course.getCourseName()).courseIcon(course.getCourseIcon())
      .courseType(course.getCourseType() == 0 ? "免费课程" : "实战课程").courseIntro(course.getCourseIntro()).build();
  }
}
