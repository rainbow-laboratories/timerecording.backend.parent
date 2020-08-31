package org.rainbowlabs.worktools.timerecording.rest.dtos;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
  private int id;
  private String name;
  private List<WorkLogDTO> workLogs;
}
