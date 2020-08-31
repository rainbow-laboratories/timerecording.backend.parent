package org.rainbowlabs.worktools.timerecording.rest.dtos;

public class WorkLogDTO {
  private int id;

  private int workLogInHrs;

  private ProjectDTO project;

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

  public ProjectDTO getProject() {
    return project;
  }

  public void setProject(ProjectDTO project) {
    this.project = project;
  }
}
