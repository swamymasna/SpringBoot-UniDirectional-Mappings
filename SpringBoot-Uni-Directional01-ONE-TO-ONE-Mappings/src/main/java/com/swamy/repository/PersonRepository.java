package com.swamy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swamy.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
