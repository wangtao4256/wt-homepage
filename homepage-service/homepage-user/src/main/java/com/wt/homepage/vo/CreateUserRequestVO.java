package com.wt.homepage.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequestVO {
  private String username;
  private String email;

  public boolean validate() {
    return StringUtils.isNotEmpty(username) && StringUtils.isNotEmpty(email);
  }
}
