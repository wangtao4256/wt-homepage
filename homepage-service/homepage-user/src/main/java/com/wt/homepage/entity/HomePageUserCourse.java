package com.wt.homepage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * <h1>homepage_user_course 表对应的实体类定义</h1>
 * Created by Qinyi.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "homepage_user_course")
public class HomePageUserCourse {

  /**
   * 数据表主键
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  /**
   * 用户 id
   */
  @Basic
  @Column(name = "user_id", nullable = false)
  private Long userId;

  /**
   * 课程 id
   */
  @Basic
  @Column(name = "course_id", nullable = false)
  private Long courseId;

  /**
   * 创建时间
   */
  @Basic
  @CreatedDate
  @Column(name = "create_time", nullable = false)
  private Date createTime;

  /**
   * 更新时间
   */
  @Basic
  @LastModifiedDate
  @Column(name = "update_time", nullable = false)
  private Date updateTime;
}
