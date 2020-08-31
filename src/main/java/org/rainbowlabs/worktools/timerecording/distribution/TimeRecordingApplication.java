package org.rainbowlabs.worktools.timerecording.distribution;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("org.rainbowlabs")
@EntityScan("org.rainbowlabs")
@EnableJpaRepositories("org.rainbowlabs")
public class TimeRecordingApplication {
  private static final Logger log = LoggerFactory.getLogger(TimeRecordingApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(TimeRecordingApplication.class, args);
    log.info("Application has started successfully");
  }
}
