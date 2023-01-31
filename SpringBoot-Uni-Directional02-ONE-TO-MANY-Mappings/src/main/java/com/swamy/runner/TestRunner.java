package com.swamy.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.swamy.entity.CreditCard;
import com.swamy.entity.Employee;
import com.swamy.repository.CreditCardRepository;
import com.swamy.repository.EmployeeRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private CreditCardRepository creditCardRepository;

	@Override
	public void run(String... args) throws Exception {

		CreditCard creditCard1 = CreditCard.builder().ccName("SBI").ccNo("7845").build();
		CreditCard creditCard2 = CreditCard.builder().ccName("UNION").ccNo("4578").build();
		creditCardRepository.saveAll(List.of(creditCard1, creditCard2));
		
		Employee employee1 = Employee.builder().employeeName("swamy").creditCards(Set.of(creditCard1)).build();
		Employee employee2 = Employee.builder().employeeName("surya").creditCards(Set.of(creditCard2)).build();
		
		List<Employee> savedList = employeeRepository.saveAll(List.of(employee1, employee2));
		System.out.println(savedList);
	}

}
