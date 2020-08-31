package org.rainbowlabs.worktools.timerecording.rest.controller;

import org.rainbowlabs.worktools.timerecording.domain.managers.UserManager;
import org.rainbowlabs.worktools.timerecording.mapper.UserMapper;
import org.rainbowlabs.worktools.timerecording.rest.dtos.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
  public final UserManager userManager;

  public UserController(UserManager userManager) {
    this.userManager = userManager;
  }

  @GetMapping("/{id}")
  public ResponseEntity<UserDTO> getUserById(@PathVariable long id) {
    UserDTO user = UserMapper.INSTANCE.workerToUserDTO(userManager.getWorkerByName(id));
    return ResponseEntity.ok(user);
  }

  @PostMapping
  public ResponseEntity< URI > createUser(@RequestBody UserDTO userDTO) {
    UserDTO savedUser = UserMapper.INSTANCE.workerToUserDTO(userManager.createWorker(userDTO.getName()));
    return ResponseEntity.created(URI.create("/user/" + savedUser.getId())).build();
  }

  @PutMapping
  public ResponseEntity<HttpStatus> updateUser(@RequestBody UserDTO userDTO) {
            userManager
                    .updateWorker(
                            UserMapper
                                    .INSTANCE
                                    .userDtoToWorker(userDTO));
    return ResponseEntity.noContent().build();
  }

  @GetMapping
  public ResponseEntity<List<UserDTO>> getAllUsers() {
    return ResponseEntity.ok(UserMapper.INSTANCE.workersToUserDTOs(userManager.getAllUsers()));
  }

  @GetMapping("/findbyname/{name}")
  public ResponseEntity<List<UserDTO>> getAllUsersByName(@PathVariable String name) {
    return ResponseEntity.ok(UserMapper.INSTANCE.workersToUserDTOs(userManager.findAllUsersByName(name)));
  }
}
