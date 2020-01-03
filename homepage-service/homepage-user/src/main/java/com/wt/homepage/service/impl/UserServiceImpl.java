//package com.wt.homepage.service.impl;
//
//import com.wt.homepage.client.CourseClient;
////import com.wt.homepage.dao.HomePageUserCourseDao;
////import com.wt.homepage.dao.HomePageUserDao;
//import com.wt.homepage.entity.HomePageUser;
//import com.wt.homepage.entity.UserInfo;
//import com.wt.homepage.service.UserService;
//import com.wt.homepage.vo.CreateUserRequestVO;
//import com.wt.homepage.vo.UserCourseInfoVO;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@Slf4j
//public class UserServiceImpl implements UserService {
////  @Autowired
////  HomePageUserDao homePageUserDao;
////  @Autowired
////  HomePageUserCourseDao homePageUserCourseDao;
//  @Autowired
//  private CourseClient courseClient;
//
//  @Override
//  public UserInfo createUser(CreateUserRequestVO request) {
//    if (!request.validate()) {
//      return UserInfo.invalid();
//    }
//    HomePageUser oldUser = homePageUserDao.findByUserName(request.getUsername());
//    if (null != oldUser) {
//      return UserInfo.invalid();
//    }
//    HomePageUser newUser = homePageUserDao.save(new HomePageUser(request.getUsername(), request.getEmail()));
//    return new UserInfo(newUser.getId(), newUser.getUsername(), newUser.getEmail());
//  }
//
//  @Override
//  public UserInfo getUserInfo(Long userId) {
//    Optional<HomePageUser> user = homePageUserDao.findById(userId);
//    if (!user.isPresent()) {
//      return UserInfo.invalid();
//    }
//    HomePageUser homePageUser = user.get();
//    return new UserInfo(homePageUser.getId(), homePageUser.getUsername(), homePageUser.getEmail());
//  }
//
//  @Override
//  public UserCourseInfoVO getUserInfoCourse(Long userId) {
//    return null;
//  }
//}
