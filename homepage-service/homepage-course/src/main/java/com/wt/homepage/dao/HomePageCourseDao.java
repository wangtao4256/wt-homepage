package com.wt.homepage.dao;

import com.wt.homepage.entity.HomepageCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomePageCourseDao extends JpaRepository<HomepageCourse, Long> {
}
