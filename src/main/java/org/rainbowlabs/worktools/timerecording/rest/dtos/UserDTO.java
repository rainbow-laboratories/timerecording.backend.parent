package org.rainbowlabs.worktools.timerecording.rest.dtos;

import java.util.List;

public class UserDTO {
  private int id;
  private String name;
  private List<WorkLogDTO> workLogs;

  public UserDTO() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<WorkLogDTO> getWorkLogs() {
    return workLogs;
  }

  public void setWorkLogs(List<WorkLogDTO> workLogs) {
    this.workLogs = workLogs;
  }
}
