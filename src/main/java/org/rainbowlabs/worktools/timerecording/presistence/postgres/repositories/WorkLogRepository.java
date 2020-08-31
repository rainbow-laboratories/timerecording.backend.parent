package org.rainbowlabs.worktools.timerecording.presistence.postgres.repositories;

import org.rainbowlabs.worktools.timerecording.domain.models.WorkLog;
import org.springframework.data.repository.CrudRepository;

public interface WorkLogRepository extends CrudRepository<WorkLog, Integer> {
}
