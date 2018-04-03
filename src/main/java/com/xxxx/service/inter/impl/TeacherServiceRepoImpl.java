package com.xxxx.service.inter.impl;

import com.xxxx.service.Domain.Teacher;
import com.xxxx.service.inter.TeacherServiceRepo;
import com.xxxx.service.repo.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceRepoImpl implements TeacherServiceRepo {
    
	@Autowired
	TeacherRepository teacherRepository;
	
	@Override
	public void createTeacher(Teacher teacher) {
		teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getTeacher() {
		return teacherRepository.findAll();
	}


}
