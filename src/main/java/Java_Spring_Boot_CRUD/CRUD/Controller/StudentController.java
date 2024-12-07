package Java_Spring_Boot_CRUD.CRUD.Controller;


import Java_Spring_Boot_CRUD.CRUD.Entity.Student;
import Java_Spring_Boot_CRUD.CRUD.Repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class StudentController {

    @Autowired
    Studentrepo studentrepo;
    //get all students//
    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        List<Student> students = studentrepo.findAll();
        return students;
    }

    //get using ID//
    @GetMapping("/students/{id}")
    public Student getStudentbyID(@PathVariable int id)
    {
        Student student=studentrepo.findById(id).get();
        return student;
    }

    //Create Student//
    @PostMapping("/students/add")
    public ResponseEntity<String> createStudent(@RequestBody Student student)
    {
        studentrepo.save(student);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Student created successfully");
    }
}
