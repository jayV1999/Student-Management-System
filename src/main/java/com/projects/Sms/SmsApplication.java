package com.projects.Sms;

import com.projects.Sms.Entity.Student;
import com.projects.Sms.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}



	@Autowired
	private StudentRepository studentRepository;
//	implementing the command line runner allows us to use the run method to start the app where this method becomes the first
//	contact point when the application starts
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student(1,"Jayanth","Venkataraman","xyx@gmail.com","+91-9940525944","35A/18,Pudur,Ambattur","Tamil Nadu","24");
		studentRepository.save(student1);
		Student student2 = new Student(2,"Sethu","Pandian","Sethu@gmail.com","+91-994345944","26A/18,maikur","Andhra Pradhesh","22");
		studentRepository.save(student2);
		Student student3 = new Student(3,"Krishna","Deva","Krishna@gmail.com","+91-877925944","35A/18,indira nagar,","Andhra Pradhesh","21");
		studentRepository.save(student3);
		Student student4 = new Student(4,"Bharath","Surya","Bharath@gmail.com","+91-7340525944","35A/18,chaikan,Ambika Nagar","Madhya Pradhesh","19");
		studentRepository.save(student4);
		Student student5 = new Student(5,"Gokul","Prasad","Gokul@gmail.com","+91-9940235944","35A/18,Munerka Block c","Haryana","19");
		studentRepository.save(student5);
		Student student6 = new Student(6,"Ajay","Devgn","Ajay@gmail.com","+91-9940525677","34A/18,","Punjab","22");
		studentRepository.save(student6);
		Student student7 = new Student(7,"John","Stagliano","John@gmail.com","+91-9940525899","12A/18,Chitta","karnataka","24");
		studentRepository.save(student7);
		Student student8 = new Student(8,"Aron","Smith","Aron@gmail.com","+91-9940524512","674D/18,Guntur","Kerala","24");
		studentRepository.save(student8);
		Student student9 = new Student(9,"John","Wick","John@gmail.com","+91-7234525944","123Q/18,Chetpet","Tamil Nadu","23");
		studentRepository.save(student9);




	}
}

