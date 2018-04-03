package com.xxxx.service.inter;

public interface UserServiceRepo {
	void createUser(String name, Integer age);

	void deleteByName(String name);
}
