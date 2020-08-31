package org.rainbowlabs.worktools.timerecording.rest.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProjectDTO {
  private int id;
  private String name;
}
