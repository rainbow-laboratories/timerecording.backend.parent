package org.rainbowlabs.worktools.timerecording.domain.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Project {
  @Id
  private int id;
  private String name;
}
