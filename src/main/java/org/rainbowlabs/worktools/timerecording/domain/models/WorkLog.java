package org.rainbowlabs.worktools.timerecording.domain.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class WorkLog {

  public WorkLog(int id, int workLogInHrs, Project project) {
    this.id = id;
    this.workLogInHrs = workLogInHrs;
    this.project = project;
  }

  public WorkLog() {
  }

  @Id
  @GeneratedValue
  private int id;

  private int workLogInHrs;

  @OneToOne
  private Project project;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getWorkLogInHrs() {
    return workLogInHrs;
  }

  public void setWorkLogInHrs(int workLogInHrs) {
    this.workLogInHrs = workLogInHrs;
  }

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }
}
