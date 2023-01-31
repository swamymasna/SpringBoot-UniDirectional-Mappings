package com.swamy.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.swamy.entity.AadarCard;
import com.swamy.entity.Person;
import com.swamy.repository.AadarCardRepository;
import com.swamy.repository.PersonRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private AadarCardRepository aadarCardRepository; 
	
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public void run(String... args) throws Exception {

		AadarCard aadarCard1 = AadarCard.builder().aadarNo("6976").address("KNR").build();
		AadarCard aadarCard2 = AadarCard.builder().aadarNo("1313").address("HYD").build();
		aadarCardRepository.saveAll(List.of(aadarCard1, aadarCard2));
		
		Person person1 = Person.builder().name("SWAMY").aadarCard(aadarCard1).build();
		Person person2 = Person.builder().name("KRISHNA").aadarCard(aadarCard2).build();
		List<Person> list = personRepository.saveAll(List.of(person1, person2));
		System.out.println("Saved Persons with AadardCard Details: " + list);


		List<Person> personsList = personRepository.findAll();
		personsList.forEach(System.out::println);
//		System.out.println(list);
	}
}

