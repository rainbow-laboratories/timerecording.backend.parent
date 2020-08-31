package org.rainbowlabs.worktools.timerecording.presistence.postgres.repositories;

import org.rainbowlabs.worktools.timerecording.domain.models.WorkLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkLogRepository extends JpaRepository<WorkLog, Integer> {
}
