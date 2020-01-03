package com.wt.homepage.advice;

import com.wt.homepage.exception.AdException;
import com.wt.homepage.vo.CommonResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

  public CommonResponse<String> AdExceptionHandler(HttpServletRequest request, AdException ex) {
    CommonResponse<String> response = new CommonResponse<>(-1, "business error");
    response.setMessage(ex.getMessage());
    return response;
  }
}
