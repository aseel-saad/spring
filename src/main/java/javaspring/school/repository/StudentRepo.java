package javaspring.school.repository;

import javaspring.school.model.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {



}
