package com.abbyhowe.LearnFolio;

import com.abbyhowe.LearnFolio.models.Student;
import com.abbyhowe.LearnFolio.models.UserType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnFolioAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnFolioAppApplication.class, args);

		Student U1 = new Student ("Abby", "Howe", "howe.abigail@gmail.com", UserType.STUDENT);
		Student U2 = new Student ("Kellie", "Howe", "kellie.howe@gmail.com", UserType.STUDENT);
		Student U3 = new Student ("John", "Cardella", "John.card@gmail.com", UserType.STUDENT);
		Student U4 = new Student ("Megan", "Ewy", "ME@gamil.com", UserType.STUDENT);
		Student U5 = new Student ("Jennifer", "Stowbart", "JS@gmail.com", UserType.STUDENT);
	}

}
