package com.gyanitgyan.dockerjavaweb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gyanitgyan.dockerjavaweb.dao.IUserRepository;
import com.gyanitgyan.dockerjavaweb.dto.UserDto;
import com.gyanitgyan.dockerjavaweb.entity.User;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserRepository userRepository;
	
	public List<UserDto> getAllUsers() {
		
		List<UserDto> returnValue= new ArrayList<UserDto>();
		
		Iterable<User> users = this.userRepository.findAll();
		
		for(User user : users)
		{
			UserDto userdto = new UserDto();
			BeanUtils.copyProperties(user, userdto);
			returnValue.add(userdto);
			
		}
		
		return returnValue;
	}
}
