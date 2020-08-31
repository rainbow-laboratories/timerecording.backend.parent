package org.rainbowlabs.worktools.timerecording.domain.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {

  public Project() {}

  @Id
  private int id;
  private String name;

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
}
