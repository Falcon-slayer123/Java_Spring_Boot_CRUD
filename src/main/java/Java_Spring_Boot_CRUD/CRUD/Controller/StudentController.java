package Java_Spring_Boot_CRUD.CRUD.Controller;


import Java_Spring_Boot_CRUD.CRUD.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    //get all students//
    @GetMapping
    public List<Student> getAllStudents()
    {
        return  null;
    }
}
