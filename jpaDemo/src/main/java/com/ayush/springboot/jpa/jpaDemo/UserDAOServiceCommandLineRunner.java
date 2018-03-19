package com.ayush.springboot.jpa.jpaDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ayush.springboot.jpa.jpaDemo.Entity.User;
import com.ayush.springboot.jpa.jpaDemo.Service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserDAOService userDAOService;
	
	private static final Logger LOGGER= LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	// on execution of this method we will see that data will be created in data base. The data base is in memory database H2
	public void run(String... args) throws Exception {

		User user=new User();
		user.setAddress("abc");
		user.setName("Ayush");
		long id=userDAOService.insert(user);
		
		LOGGER.info("User inserted and the Id id :::: {}" +id);
		
	}

	
}
