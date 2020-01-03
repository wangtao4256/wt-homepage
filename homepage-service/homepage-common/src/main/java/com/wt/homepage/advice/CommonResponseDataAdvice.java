package com.wt.homepage.advice;

import com.alibaba.fastjson.support.spring.FastJsonpResponseBodyAdvice;
import com.wt.homepage.annotation.IgnoreResponseAdvice;
import com.wt.homepage.vo.CommonResponse;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@RestControllerAdvice
public class CommonResponseDataAdvice implements ResponseBodyAdvice<Object> {
  @Override
  public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> converterType) {
    if (methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreResponseAdvice.class) ||
      methodParameter.getMethod().isAnnotationPresent(Ignore.class)) {
      return false;
    }
    return true;
  }

  @Override
  public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
    Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
    ServerHttpResponse serverHttpResponse) {
    CommonResponse<Object> response = new CommonResponse<>(200, "success");
    if (null == body) {
      return response;
    }
    else if (body instanceof CommonResponse) {
      return (CommonResponse<Object>) body;
    }
    else {
      response.setData(body);
    }
    return response;
  }
}
