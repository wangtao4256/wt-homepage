package com.wt.homepage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "homepage_user")
public class HomePageUser {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Basic
  @Column(name = "username", nullable = false)
  private String username;
  /**
   * 用户邮箱
   */
  @Basic
  @Column(name = "email", nullable = false)
  private String email;

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

  public HomePageUser(String username, String email) {
    this.username = username;
    this.email = email;
  }
}
