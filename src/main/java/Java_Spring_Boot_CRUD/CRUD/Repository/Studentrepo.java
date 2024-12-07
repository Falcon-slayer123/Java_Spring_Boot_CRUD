package Java_Spring_Boot_CRUD.CRUD.Repository;

import Java_Spring_Boot_CRUD.CRUD.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student,Integer> {
}
