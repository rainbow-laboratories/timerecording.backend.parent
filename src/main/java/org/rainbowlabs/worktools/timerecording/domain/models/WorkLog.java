package org.rainbowlabs.worktools.timerecording.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WorkLog {

  @Id
  @GeneratedValue
  private int id;

  private int workLogInHrs;

  @OneToOne
  private Project project;
}
