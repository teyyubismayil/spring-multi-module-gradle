package com.teyyub.student.controller;

import com.teyyub.models.student.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<StudentDTO> getStudents() {
        return List.of(
                new StudentDTO("Teyyub", "Ismayilov"),
                new StudentDTO("John", "Doe")
        );
    }
}
