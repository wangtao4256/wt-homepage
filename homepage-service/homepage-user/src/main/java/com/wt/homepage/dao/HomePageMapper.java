package com.wt.homepage.dao;

import com.wt.homepage.entity.HomePageUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface HomePageMapper {
  List<HomePageUser> getAll();

  HomePageUser getOne(Long id);

  void insert(HomePageUser user);

  void update(HomePageUser user);

  void delete(Long id);
}
