package com.xxxx.service.inter.impl;

import com.xxxx.service.inter.UserServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceRepoImpl implements UserServiceRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void createUser(String name, Integer age) {
		jdbcTemplate.update("insert into users(name,age) VALUES (?,?)",name,age);
	}

	@Override
	public void deleteByName(String name) {
		jdbcTemplate.update("DELETE FROM users where name= ?" , name);
	}
}
