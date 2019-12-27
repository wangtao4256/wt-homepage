package com.wt.homepage.vo;

import com.wt.homepage.entity.CourseInfo;
import com.wt.homepage.entity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCourseInfoVO {
  private UserInfo userinfo;
  private List<CourseInfo> courseInfos;

  public static UserCourseInfoVO invalid() {
    return new UserCourseInfoVO(UserInfo.invalid(), Collections.emptyList());
  }
}
