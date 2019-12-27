package com.wt.homepage.service;

import com.wt.homepage.entity.UserInfo;
import com.wt.homepage.vo.CreateUserRequestVO;
import com.wt.homepage.vo.UserCourseInfoVO;

public interface UserService {
  UserInfo createUser(CreateUserRequestVO request);

  UserInfo getUserInfo(Long userId);

  /**
   * 获取用户和课程信息
   *
   * @author tao.wang
   * @date 2019/12/27
   */
  UserCourseInfoVO getUserInfoCourse(Long userId);
}
