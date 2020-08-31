package org.rainbowlabs.worktools.timerecording.domain.managers;

import org.rainbowlabs.worktools.timerecording.domain.models.WorkLog;
import org.rainbowlabs.worktools.timerecording.presistence.postgres.repositories.ProjectRepository;
import org.rainbowlabs.worktools.timerecording.presistence.postgres.repositories.UserRepository;
import org.rainbowlabs.worktools.timerecording.presistence.postgres.repositories.WorkLogRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WorkLogManager {

  private static final Logger log = LoggerFactory.getLogger(WorkLogManager.class);

  @Autowired
  private ProjectRepository projectRepository;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private WorkLogRepository workLogRepository;

  public List<WorkLog> getUserWorkLog(String name) {
    return null;
  }
}

