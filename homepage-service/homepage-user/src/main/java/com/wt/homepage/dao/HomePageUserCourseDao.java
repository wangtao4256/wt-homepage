package com.wt.homepage.dao;

import com.wt.homepage.entity.HomePageUserCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomePageUserCourseDao extends JpaRepository<HomePageUserCourse, Long> {

  List<HomePageUserCourse> findAllByUserId(Long userId);
}
