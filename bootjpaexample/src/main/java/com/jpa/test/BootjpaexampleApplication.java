package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		/*
		 * User user=new User(); user.setName("Kishan Kumar"); 
		 * user.setCity("Gaya");
		 * user.setStatus("I am a Java Programmer"); User
		 * user1=userRepository.save(user); System.out.println(user1);
		 */
		//Create an object of the user
		/*
		 * User user1= new User(); user1.setName("Uttam"); 
		 * user1.setCity("Kanpur");
		 * user1.setStatus("Python Programmer"); User user2= new User();
		 * user2.setName("Uttam"); user2.setCity("Bhopal");
		 * user2.setStatus("Go Programmer");
		 */
		/*
		 * User u1=userRepository.save(user1); 
		 * User u2=userRepository.save(user2);
		 * System.out.println(u1); System.out.println(u2);
		 */
		/*
		 * List<User> users=List.of(user1, user2); 
		 * Iterable<User> result=userRepository.saveAll(users); 
		 * result.forEach(user->{
		 * System.out.println(user); 
		 * });
		 */
		//Update the user of id 3
		/*
		 * Optional<User> optional=userRepository.findById(3); 
		 * User user=optional.get();
		 * user.setName("Gautam"); 
		 * userRepository.save(user); 
		 * System.out.println(user);
		 */
		//How to get the data?
		//findById(id)->return optional containing your data
		Iterable<User> itr=userRepository.findAll();
		Iterator<User> iterator=itr.iterator();
		while(iterator.hasNext()) {
			User user=iterator.next();
			System.out.println(user);
		}
	}

}
