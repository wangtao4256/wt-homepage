package com.wt.homepage.filter;

import com.netflix.zuul.IZuulFilter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 过滤请求 存储客户端发起请求的时间戳
 *
 * @author tao.wang
 * @date 2019/12/26
 */
@Component
public class PreRequestFilter extends ZuulFilter {
  @Override
  public String filterType() {
    return FilterConstants.PRE_TYPE;
  }

  @Override
  public int filterOrder() {
    return 0;
  }

  @Override
  public boolean shouldFilter() {
    //是否启用当前过滤器
    return true;
  }

  @Override
  public Object run() throws ZuulException {
    RequestContext ctx = RequestContext.getCurrentContext();
    ctx.set("current_time", System.currentTimeMillis());
    return null;
  }
}
