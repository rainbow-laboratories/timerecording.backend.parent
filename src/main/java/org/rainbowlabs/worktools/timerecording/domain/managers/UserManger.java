package org.rainbowlabs.worktools.timerecording.domain.managers;

import org.rainbowlabs.worktools.timerecording.domain.models.Worker;
import org.rainbowlabs.worktools.timerecording.presistence.postgres.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class UserManger {

  private static final Logger log = LoggerFactory.getLogger(UserManger.class);

  private final UserRepository userRepository;

  public UserManger(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Worker getWorkerByName(long id) {
    Optional<Worker> optionalWorker = userRepository.findById(id);
    if (optionalWorker.isPresent()) {
      return optionalWorker.get();
    } else {
      log.error("requested user wasn't present");
      return null;
    }
  }

  public Worker createWorker(String name) {
    Worker worker = Worker.builder().name(name).workLogs(new ArrayList<>()).build();
    return userRepository.save(worker);
  }
}
