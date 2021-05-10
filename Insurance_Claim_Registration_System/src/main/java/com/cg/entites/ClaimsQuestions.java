package com.cg.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ClaimsQuestions {
	@Id
	private int policyNumber;
	private int questionId;
	private String quesDesc;
	private String quesAns1;
	private String quesAns2;
	
	
	protected ClaimsQuestions(int questionId, String quesDesc, String quesAns1, String quesAns2) {
		super();
		this.questionId = questionId;
		this.quesDesc = quesDesc;
		this.quesAns1 = quesAns1;
		this.quesAns2 = quesAns2;
	}
		
}
