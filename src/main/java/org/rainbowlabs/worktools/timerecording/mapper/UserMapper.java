package org.rainbowlabs.worktools.timerecording.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.rainbowlabs.worktools.timerecording.domain.models.Worker;
import org.rainbowlabs.worktools.timerecording.rest.dtos.UserDTO;

@Mapper
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  Worker userDtoToWorker(UserDTO userDto);

  UserDTO workerToUserDTO(Worker worker);
}
