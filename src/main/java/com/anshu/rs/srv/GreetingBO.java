package com.anshu.rs.srv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GreetingBO {

  private static final Logger log = LoggerFactory.getLogger(GreetingBO.class);

  public String getGreeting(String name) {
    String response = "Hello " + name + "!";
    log.info("response : {}", response);
    return response;
  }
}
