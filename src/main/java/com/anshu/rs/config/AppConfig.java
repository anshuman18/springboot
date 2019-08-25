/**
 * 
 */
package com.anshu.rs.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import com.anshu.rs.srv.GreetingService;

@Configuration
@ApplicationPath("/api")
public class AppConfig extends ResourceConfig {

  private static final Logger log = LoggerFactory.getLogger(AppConfig.class);

  public AppConfig() {
    log.info("AppConfig initialized");
    register(GreetingService.class);
  }
}
