package com.wt.homepage.controller;

import com.alibaba.fastjson.JSON;
import com.wt.homepage.entity.CourseInfo;
import com.wt.homepage.entity.CourseInfosRequest;
import com.wt.homepage.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 课程对外服务接口
 *
 * @author tao.wang
 * @date 2019/12/27
 */
@RestController
@RequestMapping("/")
@Slf4j
public class HomePagerController {

  @Autowired
  private CourseService courseService;

  @RequestMapping("/get_course")
  public CourseInfo getCourseInfo(Long id) {
    log.info("<homepage-course>: get course -> {}", id);
    return courseService.getCourseInfo(id);
  }

  @PostMapping("/get_courses")
  public List<CourseInfo> getCourseInfos(@RequestBody CourseInfosRequest request) {
    log.info("<homepage-course>: get courses -> {}", JSON.toJSONString(request));
    return courseService.getCourseInfos(request);
  }
}
