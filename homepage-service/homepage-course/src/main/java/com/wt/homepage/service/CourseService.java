package com.wt.homepage.service;

import com.wt.homepage.entity.CourseInfo;
import com.wt.homepage.entity.CourseInfosRequest;

import java.util.List;

public interface CourseService {

  CourseInfo getCourseInfo(Long id);

  List<CourseInfo> getCourseInfos(CourseInfosRequest param);
}
