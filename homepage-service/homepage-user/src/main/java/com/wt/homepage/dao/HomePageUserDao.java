package com.wt.homepage.dao;

import com.wt.homepage.entity.HomePageUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomePageUserDao extends JpaRepository<HomePageUser, Long> {
  HomePageUser findByUserName(String username);
}
