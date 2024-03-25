package javaspring.school.controller;

import javaspring.school.model.entity.Teacher;
import javaspring.school.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/get-teacher")
    public Teacher getTeacher(@RequestParam Integer id)
    {
        return teacherService.getTeacher(id);
    }

    @PostMapping("/save-teacher")
    public Teacher saveTeacher(@RequestBody Teacher teacher)
    {
        return teacherService.saveTeacher(teacher);
    }

    @PostMapping("/update-teacher")
    public Teacher updateTeacher(@RequestBody Teacher teacher)
    {
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping("/delete-teacher")
    public void deleteTeacher(@RequestParam Integer id)
    {
        teacherService.deleteTeacher(id);
    }

    @GetMapping("/get-teachers")
    public List<Teacher> getTeachers()
    {
        return teacherService.getTeachers();
    }
}
