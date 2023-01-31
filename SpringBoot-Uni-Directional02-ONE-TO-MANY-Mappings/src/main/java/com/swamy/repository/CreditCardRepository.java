package com.swamy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swamy.entity.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {

}
