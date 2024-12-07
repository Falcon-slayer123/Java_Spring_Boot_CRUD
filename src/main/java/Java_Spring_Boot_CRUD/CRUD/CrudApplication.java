package Java_Spring_Boot_CRUD.CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "Java_Spring_Boot_CRUD.CRUD")
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);

		System.out.println("**************STUDENT CRUD OPERATION**************");
	}

}
