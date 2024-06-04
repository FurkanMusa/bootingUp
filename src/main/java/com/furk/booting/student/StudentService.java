package com.furk.booting.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Furkan", "furkan@mail.com", 100, LocalDate.of(1500, 1, 5)),
                new Student(2L, "Ali", "ali@mail.com", 10, LocalDate.of(2000, 2, 6)),
                new Student(3L, "Ömer", "ömer@gmail.com", 1, LocalDate.of(2001, 3, 7))
        );
    }

}
