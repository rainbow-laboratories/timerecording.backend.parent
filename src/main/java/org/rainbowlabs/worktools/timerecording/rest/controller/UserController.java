package org.rainbowlabs.worktools.timerecording.rest.controller;

import lombok.AllArgsConstructor;
import org.rainbowlabs.worktools.timerecording.domain.managers.UserManger;
import org.rainbowlabs.worktools.timerecording.domain.models.Worker;
import org.rainbowlabs.worktools.timerecording.rest.dtos.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
@AllArgsConstructor
public class UserController {
  public final UserManger userManger;


  @GetMapping("/{id}")
  public ResponseEntity<Worker> getUserById(@PathVariable long id) {
    Worker user = userManger.getWorkerByName(id);
    return ResponseEntity.ok(user);
  }

  @PostMapping
  public ResponseEntity< URI > createUser(@RequestBody User user) {
    return ResponseEntity.created(URI.create("/user/2")).build();
  }

  @GetMapping
  public ResponseEntity<List<User>> getAllUsers() {
    return ResponseEntity.ok(new ArrayList<>());
  }

  @GetMapping("/{name}")
  public ResponseEntity<List<User>> getAllUsersByName(@PathVariable String name) {
    return ResponseEntity.ok(new ArrayList<>());
  }
}
