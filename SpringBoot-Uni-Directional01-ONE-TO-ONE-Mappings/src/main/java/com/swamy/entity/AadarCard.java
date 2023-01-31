package com.swamy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "AADAR_CARD")
public class AadarCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aadarId;
	private String aadarNo;
	private String address;
}
