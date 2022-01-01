package com.banzo.catfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CatFoodServiceRegistryApplication {

  public static void main(String[] args) {
    SpringApplication.run(CatFoodServiceRegistryApplication.class, args);
  }
}
