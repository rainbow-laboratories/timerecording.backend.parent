package org.rainbowlabs.worktools.timerecording.presistence.postgres.repositories;

import org.rainbowlabs.worktools.timerecording.domain.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, String> {
}
