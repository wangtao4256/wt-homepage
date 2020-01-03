package com.wt.homepage.dao;

import com.wt.homepage.entity.HomePageUser;

import java.util.List;

public interface HomePageMapper {
  List<HomePageUser> getAll();

  HomePageUser getOne(Long id);

  void insert(HomePageUser user);

  void update(HomePageUser user);

  void delete(Long id);
}
