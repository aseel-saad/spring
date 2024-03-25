package javaspring.school.service;

import javaspring.school.model.entity.Teacher;
import javaspring.school.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    public Teacher getTeacher(Integer id)
    {
        Optional<Teacher> teacher = this.teacherRepo.findById(id);
        return teacher.orElse(new Teacher());
    }

    public Teacher saveTeacher(Teacher teacher)
    {
        return this.teacherRepo.save(teacher);
    }

    public void deleteTeacher(Integer id)
    {
        this.teacherRepo.deleteById(id);
    }

    public List<Teacher> getTeachers()
    {
        return this.teacherRepo.findAll();
    }


}
