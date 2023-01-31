package com.swamy.runner;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.swamy.entity.Role;
import com.swamy.entity.User;
import com.swamy.repository.RoleRepository;
import com.swamy.repository.UserRepository;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void run(String... args) throws Exception {

		Role role1 = Role.builder().roleName("ROLE_ADMIN").build();
		Role role2 = Role.builder().roleName("ROLE_USER").build();
		Role role3 = Role.builder().roleName("ROLE_EMPLOYEE").build();

		Role role11 = roleRepository.save(role1);
		Role role22 = roleRepository.save(role2);
		Role role33 = roleRepository.save(role3);
		
		Set<Role> role111 = Set.of(role11, role22);
		Set<Role> role222 = Set.of(role33, role22);
		
		
		User user1 = User.builder().username("admin").roles(role111).build();
		User user2 = User.builder().username("user").roles(role222).build();

		User user11 = userRepository.save(user1);
		User user22 = userRepository.save(user2);
		System.out.println("Saved");
		
		List<User> usersList = userRepository.findAll();
		System.out.println(usersList);
	}

}
