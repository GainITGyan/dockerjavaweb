package com.gyanitgyan.dockerjavaweb.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gyanitgyan.dockerjavaweb.entity.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer>{

}
