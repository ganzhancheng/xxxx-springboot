package com.xxxx.service;

import com.xxxx.service.Domain.Student;
import com.xxxx.service.Domain.Teacher;
import com.xxxx.service.inter.TeacherServiceRepo;
import com.xxxx.service.inter.UserServiceRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XxxxSpringbootApplicationTests {

	@Autowired
	Student student;

	@Autowired
	private UserServiceRepo userServiceRepo;

	@Autowired
	private TeacherServiceRepo teacherServiceRepo;

	@Test
	public void contextLoads() {
		System.out.println(student.getAge()+"-----------"+student.getName());
	}

	@Test
	public void insert(){
		userServiceRepo.createUser("gan", 12);
	}

	@Test
	public void delete(){
		userServiceRepo.deleteByName("gan");
	}

	@Test
	public void inTear(){
		/*Teacher teacher = new Teacher();
		teacher.setAge(11);
		teacher.setName("干");

		teacherServiceRepo.createTeacher(teacher);*/

		List<Teacher> teacher = teacherServiceRepo.getTeacher();

		for (Teacher teacher1 : teacher) {
			System.out.println(teacher1.getName());
		}
	}

}
