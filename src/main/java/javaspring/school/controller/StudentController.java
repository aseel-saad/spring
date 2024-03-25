package javaspring.school.controller;

import javaspring.school.model.entity.Student;
import javaspring.school.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/get-student")
    public Student getStudent(@RequestParam Integer id)
    {
        return studentService.getStudent(id);
    }

    @PostMapping("/save-student")
    public Student saveStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @GetMapping("/delete-student")
    public void deleteStudent(@RequestParam Integer id)
    {
         studentService.delete(id);
    }

    @PostMapping("/update-student")
    public Student updateStudent(@RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    @GetMapping("/get-students")
    public List<Student> getStudents()
    {
        return this.studentService.getStudents();
    }

}
