package com.swamy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swamy.entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

}
