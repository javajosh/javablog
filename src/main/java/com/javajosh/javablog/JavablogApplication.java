package com.javajosh.javablog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavablogApplication {

  private static final Logger log = LoggerFactory.getLogger(JavablogApplication.class);

  public static void main(String[] args) {
    log.info("JavablogApplication started");
    SpringApplication.run(JavablogApplication.class, args);
  }
}
