package com.wt.homepage.client;

import com.wt.homepage.entity.CourseInfo;
import com.wt.homepage.entity.CourseInfosRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "eureka-client-homepage-course", fallback = CourseClientHystrix.class )
public interface CourseClient {
  @RequestMapping(value = "/homepage-course/get_course", method = RequestMethod.GET)
  CourseInfo getCourseInfo(Long id);

  @RequestMapping(value = "/ homepage-course/get_courses", method = RequestMethod.POST)
  List<CourseInfo> getCourseInfos(@RequestBody CourseInfosRequest request);
}
