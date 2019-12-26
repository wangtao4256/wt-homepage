package com.wt.homepage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 课程信息请求对象定义
 *
 * @author tao.wang
 * @date 2019/12/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseInfosRequest {
  private List<Long> ids;
}
