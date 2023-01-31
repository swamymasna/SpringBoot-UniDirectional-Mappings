package com.swamy.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.swamy.entity.Person;
import com.swamy.repository.AadarCardRepository;
import com.swamy.repository.PersonRepository;

//@Component
public class FetchRunner implements CommandLineRunner {

	@Autowired
	private AadarCardRepository aadarCardRepository; 
	
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public void run(String... args) throws Exception {
		List<Person> list = personRepository.findAll();
		System.out.println(list);
	}
}
