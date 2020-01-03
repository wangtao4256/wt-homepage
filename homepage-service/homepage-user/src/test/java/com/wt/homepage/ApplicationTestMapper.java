package com.wt.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ApplicationTestMapper {
  public static void main(String[] args) {
    SpringApplication.run(ApplicationTestMapper.class, args);
  }
}
