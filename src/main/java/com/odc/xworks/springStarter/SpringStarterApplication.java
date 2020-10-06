package com.odc.xworks.springStarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.odc.xworks.springStarter.entity.MessageDTO;

@SpringBootApplication
public class SpringStarterApplication {
	
	private static final Logger log = LoggerFactory.getLogger(SpringStarterApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringStarterApplication.class, args);
	}
	
//	@Bean
//	  public CommandLineRunner demo(MessageRepo msg) {
//	    return (args) -> {
//	      // save a few Messages
//	      msg.save(new Message("Jack", "My first chat app"));
//	      msg.save(new Message("Chloe", "I am loving this app"));
//	      msg.save(new Message("Kim", "Lets chat here on"));
//	      msg.save(new Message("David", "Yes I will also join"));
//	      msg.save(new Message("Michelle", "I will ask more people to join"));
//
//	      // fetch all Messages
//	      log.info("Messages found with findAll():");
//	      log.info("-------------------------------");
//	      for (Message Message : msg.findAll()) {
//	        log.info(Message.toString());
//	      }
//	      log.info("");
//
//	      // fetch an individual Message by ID
//	      Message Message = msg.findBylId(1L);
//	      log.info("Message found with findById(1L):");
//	      log.info("--------------------------------");
//	      log.info(Message.toString());
//	      log.info("");
//
//	      // fetch Messages by last name
//	      log.info("Message found with findByLastName('Bauer'):");
//	      log.info("--------------------------------------------");
//	      msg.findBysName("Bauer").forEach(bauer -> {
//	        log.info(bauer.toString());
//	      });
//	      // for (Message bauer : msg.findByLastName("Bauer")) {
//	      //  log.info(bauer.toString());
//	      // }
//	      log.info("");
//	    };
//	}

}
