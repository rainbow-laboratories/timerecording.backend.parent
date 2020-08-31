package org.rainbowlabs.worktools.timerecording.presistence.postgres.repositories;

import org.rainbowlabs.worktools.timerecording.domain.models.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Worker, Long> {
}
