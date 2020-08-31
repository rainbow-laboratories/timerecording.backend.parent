package org.rainbowlabs.worktools.timerecording.presistence.postgres.repositories;

import org.rainbowlabs.worktools.timerecording.domain.models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, String> {
}
