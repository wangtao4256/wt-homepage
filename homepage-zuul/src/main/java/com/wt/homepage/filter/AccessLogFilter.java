package com.wt.homepage.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Filter;
/**
 * 自定义过滤器 实现请求访问时间
 *       
 * @author tao.wang
 * @date 2019/12/26
 */
@Component
@Slf4j
public class AccessLogFilter extends ZuulFilter {
  @Override
  public String filterType() {
    return FilterConstants.POST_TYPE;
  }

  @Override
  public int filterOrder() {
    return FilterConstants.SEND_RESPONSE_FILTER_ORDER - 1;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() throws ZuulException {
    RequestContext ctx = RequestContext.getCurrentContext();
    HttpServletRequest req = ctx.getRequest();
    String uri = req.getRequestURI();
    long beginTime = (long) ctx.get("current_time");
    long lastTime = System.currentTimeMillis() - beginTime;
    log.debug("uri:{},costTime:{}", uri, lastTime);
    return null;
  }
}
