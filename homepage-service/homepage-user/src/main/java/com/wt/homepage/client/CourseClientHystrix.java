package com.wt.homepage.client;

import com.wt.homepage.entity.CourseInfo;
import com.wt.homepage.entity.CourseInfosRequest;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CourseClientHystrix implements CourseClient {
  @Override
  public CourseInfo getCourseInfo(Long id) {
    return CourseInfo.invalid();
  }

  @Override
  public List<CourseInfo> getCourseInfos(CourseInfosRequest request) {
    return Collections.emptyList();
  }
}
