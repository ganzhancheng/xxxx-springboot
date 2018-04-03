package com.xxxx.service.inter;

import com.xxxx.service.Domain.Teacher;

import java.util.List;

public interface TeacherServiceRepo {
    void createTeacher(Teacher teacher);
    List<Teacher> getTeacher();
}
