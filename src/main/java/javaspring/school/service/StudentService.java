package javaspring.school.service;

import javaspring.school.model.entity.Student;
import javaspring.school.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student getStudent(Integer id)
    {
        Optional<Student> student = this.studentRepo.findById(id);
        return student.orElse(new Student());
    }

    public Student saveStudent(Student student)
    {
       return this.studentRepo.save(student);
    }

    public void delete(Integer id)
    {
        this.studentRepo.deleteById(id);
    }

    public List<Student> getStudents()
    {
       return this.studentRepo.findAll();
    }

}
