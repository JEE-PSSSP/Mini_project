package com.cg.entites;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClaimsQuestions {
	
	private int questionId;
	private String ClaimType;
	private String answer1;
	private String answer2;
	
	
	protected ClaimsQuestions(String claimType, String answer1, String answer2) {
		super();
		ClaimType = claimType;
		this.answer1 = answer1;
		this.answer2 = answer2;
	}

}
