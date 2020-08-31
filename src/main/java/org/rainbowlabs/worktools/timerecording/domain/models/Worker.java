package org.rainbowlabs.worktools.timerecording.domain.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Worker {
  public Worker(long id, String name, List<WorkLog> workLogs) {
    this.id = id;
    this.name = name;
    this.workLogs = workLogs;
  }

  public Worker() {
  }

  @Id
  @GeneratedValue
  private long id;

  private String name;

  @OneToMany
  private List<WorkLog> workLogs;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<WorkLog> getWorkLogs() {
    return workLogs;
  }

  public void setWorkLogs(List<WorkLog> workLogs) {
    this.workLogs = workLogs;
  }
}
