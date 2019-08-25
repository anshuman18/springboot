package com.anshu.rs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreetingApplication {

  public static void main(String[] args) {
    System.err.println("GreetingApplication init");
    System.out.println("GreetingApplication hahahha");
    SpringApplication.run(GreetingApplication.class, args);
  }
}
