package org.rainbowlabs.worktools.timerecording.domain.managers;

import org.rainbowlabs.worktools.timerecording.domain.models.Worker;
import org.rainbowlabs.worktools.timerecording.presistence.postgres.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserManager {

  private static final Logger log = LoggerFactory.getLogger(UserManager.class);

  private final UserRepository userRepository;

  public UserManager(UserRepository userRepository) {
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
    Worker worker = new Worker();
    worker.setName(name);
    worker.setWorkLogs(new ArrayList<>());
    return userRepository.save(worker);
  }

  public void updateWorker(Worker worker) {
    Optional<Worker> optionalWorker = userRepository.findById(worker.getId());
    if (optionalWorker.isEmpty()) {
      log.error("User not found");
    }
    worker.getWorkLogs().addAll(optionalWorker.get().getWorkLogs());
    userRepository.save(worker);
  }

  public List<Worker> getAllUsers() {
    return userRepository.findAll();
  }

  public List<Worker> findAllUsersByName(String name) {
    return userRepository.findAllByName(name);
  }
}
