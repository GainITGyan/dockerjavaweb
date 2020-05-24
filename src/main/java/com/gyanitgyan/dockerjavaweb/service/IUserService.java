package com.gyanitgyan.dockerjavaweb.service;

import java.util.List;

import com.gyanitgyan.dockerjavaweb.dto.UserDto;

public interface IUserService {

	List<UserDto> getAllUsers();

}
