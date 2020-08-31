package org.rainbowlabs.worktools.timerecording.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Worker {
  @Id
  @GeneratedValue
  private long id;

  private String name;

  @OneToMany
  private List<WorkLog> workLogs;
}
