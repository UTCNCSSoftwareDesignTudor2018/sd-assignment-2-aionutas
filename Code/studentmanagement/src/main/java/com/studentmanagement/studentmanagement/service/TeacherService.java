package com.studentmanagement.studentmanagement.service;

import com.studentmanagement.studentmanagement.model.repository.TeacherRepo;
import com.studentmanagement.studentmanagement.model.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
@Service
public class TeacherService {

    @Autowired
    TeacherRepo teacherRepo;

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    public Teacher getById(BigInteger id) {
        return teacherRepo.getOne(id);
    }


    public List<Teacher> getAllTeachers() {
        return teacherRepo.findAll();
    }

    public Teacher updateTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    public void deleteTeacher(BigInteger id) {
        Teacher removeTeacher = teacherRepo.getOne(id);

        if(removeTeacher.getTeacherId() != null) {
            teacherRepo.delete(removeTeacher);
        }
        else{
            System.out.println("Could not delete teacher!");
        }

    }

    public Teacher getByName(String name) {
        System.out.println(teacherRepo.getByName(name).toString());
        return teacherRepo.getByName(name);
    }
}
