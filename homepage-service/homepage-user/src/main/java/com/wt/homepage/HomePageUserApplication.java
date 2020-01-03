package com.wt.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@EnableJpaAuditing
@EnableFeignClients
@EnableCircuitBreaker
@EnableEurekaClient
public class HomePageUserApplication {
  public static void main(String[] args) {
    SpringApplication.run(HomePageUserApplication.class, args);
  }
}
