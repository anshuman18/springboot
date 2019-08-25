package com.anshu.rs.srv;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/greeting")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingService {

  private GreetingBO greetingService;

  private static final Logger log = LoggerFactory.getLogger(GreetingService.class);

  @Autowired
  public GreetingService(GreetingBO greetingService) {
    this.greetingService = greetingService;
  }

  @GET
  public String getGreeting(@QueryParam("name") String name) {
    log.info("name : {}", name);
    return this.greetingService.getGreeting(name);
  }
}
