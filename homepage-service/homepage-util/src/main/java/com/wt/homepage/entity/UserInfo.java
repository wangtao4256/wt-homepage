package com.wt.homepage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
  private Long id;
  private String userName;
  private String email;

  public static UserInfo invalid() {
    return new UserInfo(-1L, "", "");
  }
}
